---
layout: page
title: Tan Jia Rong's Project Portfolio Page
---

### Project: Plannit

### Overview
Plannit is an all-in-one application that streamlines the execution of module deliverables
by empowering NUS students with the ability to manage tasks, links and module-mates
(i.e. students in the same module) to increase their productivity.

### Summary of contributions
Given below are my contributions to the project.

#### Implemented navigation and search functionalities ([#64](https://github.com/AY2223S1-CS2103T-T10-1/tp/pull/64), [#81](https://github.com/AY2223S1-CS2103T-T10-1/tp/pull/81))

#### Navigation
**Highlights** <br>
The implementation of the navigation system between `Module` is not trivial because it involves constant updating of
`UniqueModuleList`, `UniquePersonList` and `isHome` status.

As such, it requires proper integration of `logic`, `model` and `ui` to ensure what is executed matches
what is seen on the screen and that the `isHome` status is set to its correct state as an incorrect
state would result in a detrimental user-experience.

Hence, whenever a command is executed, special thoughts have to be made in deciding on what is shown on the screen
and its next state.

Additionally, to ensure proper integration, extensive testing was required to ensure that the feature was bug-free.

* **New Feature:** Added `goto` command.
    * What it does: <br>
      Allows user to navigate to specific module to
      view information relevant to the particular module.
    * Justification:

    * Highlight:


* **New Feature:** Added `home` command.
    * What it does:
      Allows user to navigate back to home page after using `goto` to
      have an overview of details stored in Plannit.
    * Justification:

    * Highlight:

#### Search

* **New Feature:** Added `find-module` command.
    * What it does: <br>
      Allows user to find modules in home page only.
* Justification: <br>
  All modules are listed in the home page. Hence, `find-module` is implemented to allow user to filter
  module by module code prefix. <br>
  Additionally, it is a design decision to disable it after using `goto` command to prevent
  confusion between usage of `goto` command and `find-module` command.


* **New Feature:** Added `list-module` command.
    * What it does: <br>
      Allows user to list every module in home-page.
    * Justification: <br>
      A consequence of `find-module` so that user can reset the list of module back to its
      original state.


* **New Feature:** Added `find-person` command.
    * What it does: <br>
      Allows user to find persons in home page only.
    * Justification: <br>
      Similar to `find-module`, all person details are listed in
      the home page. Hence, `find-person` is implemented to allow user to filter
      person by person name prefix. <br>
      Additionally, it is a design decision to disable it after using `goto` command
      as relevant person added to a module is likely to be small as it should only comprise of
      people whom the user needs to interact with in the module
      (i.e. friends, project mates, teaching assistant, professors).


* **New Feature:** Added `list-person` command.
    * What it does: <br>
      Allows user to list every person's details in home-page.
    * Justification: <br>
      A consequence of `find-person` so that user can reset the list of person back to its
      original state.


**Code contributed:** [RepoSense link](https://nus-cs2103-ay2223s1.github.io/tp-dashboard/?search=tan-jia-rong&breakdown=true)

### Other contributions
**Documentation:**

* **User Guide:**
    * Added documentation for the following features:
        * `home` and `goto` ([#50](https://github.com/AY2223S1-CS2103T-T10-1/tp/pull/50))
        * `find-module`, `list-module`, `find-person` and `list-person` ([#81](https://github.com/AY2223S1-CS2103T-T10-1/tp/pull/81))
    * Updated UG with tips and notes and fixed some minor issues ([#161](https://github.com/AY2223S1-CS2103T-T10-1/tp/pull/161))

* **Developer Guide ([#87](https://github.com/AY2223S1-CS2103T-T10-1/tp/pull/87)):**
    * Added implementation details for `goto` command.

**Contribution to team-based-tasks:**
* Created first draft of `README.md` to match Plannit ([#32](https://github.com/AY2223S1-CS2103T-T10-1/tp/pull/32))
* Implemented initial model framework for Link, Task and Module ([#59](https://github.com/AY2223S1-CS2103T-T10-1/tp/pull/59))

**Review contributions:**
* List of PRs reviewed can be found [here](https://github.com/AY2223S1-CS2103T-T10-1/tp/pulls?q=is%3Apr+reviewed-by%3ATan-Jia-Rong).
* PRs reviewed (with non-trivial review messages):
  [#83](https://github.com/AY2223S1-CS2103T-T10-1/tp/pull/83),
  [#89](https://github.com/AY2223S1-CS2103T-T10-1/tp/pull/89),
  [#104](https://github.com/AY2223S1-CS2103T-T10-1/tp/pull/104),
  [#114](https://github.com/AY2223S1-CS2103T-T10-1/tp/pull/114),
  [#160](https://github.com/AY2223S1-CS2103T-T10-1/tp/pull/160),
  [#164](https://github.com/AY2223S1-CS2103T-T10-1/tp/pull/164),
  [#167](https://github.com/AY2223S1-CS2103T-T10-1/tp/pull/167).
