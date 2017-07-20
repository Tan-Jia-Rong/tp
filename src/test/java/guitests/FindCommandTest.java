package guitests;

import static org.junit.Assert.assertTrue;
import static seedu.address.testutil.TypicalPersons.BENSON;
import static seedu.address.testutil.TypicalPersons.DANIEL;

import org.junit.Test;

import seedu.address.commons.core.Messages;
import seedu.address.logic.commands.ClearCommand;
import seedu.address.logic.commands.DeleteCommand;
import seedu.address.logic.commands.FindCommand;
import seedu.address.model.person.ReadOnlyPerson;

public class FindCommandTest extends AddressBookGuiTest {

    @Test
    public void find_nonEmptyList() throws Exception {
        assertFindResult(FindCommand.COMMAND_WORD + " Mark"); // no results
        assertFindResult(FindCommand.COMMAND_WORD + " Meier", BENSON, DANIEL); // multiple results

        //find after deleting one result
        runCommand(DeleteCommand.COMMAND_WORD + " 1");
        assertFindResult(FindCommand.COMMAND_WORD + " Meier", DANIEL);
    }

    @Test
    public void find_emptyList() throws Exception {
        runCommand(ClearCommand.COMMAND_WORD);
        assertFindResult(FindCommand.COMMAND_WORD + " Jean"); // no results
    }

    @Test
    public void find_invalidCommand_fail() {
        runCommand(FindCommand.COMMAND_WORD + "george");
        assertResultMessage(Messages.MESSAGE_UNKNOWN_COMMAND);
    }

    private void assertFindResult(String command, ReadOnlyPerson... expectedHits) throws Exception {
        runCommand(command);
        assertListSize(expectedHits.length);
        assertResultMessage(expectedHits.length + " persons listed!");
        assertTrue(getPersonListPanel().isListMatching(expectedHits));
    }
}
