## Project

Name: JabRef

URL: https://github.com/JabRef/jabref

A reference management tool allowing users to collect, organize, and search for bibliographic information. 

## Onboarding experience

Did you choose a new project or continue on the previous one?

We selected a new project because our previous one, Apache Commons Lang, did not have as many appropriate issues available for us to work on.

If you changed the project, how did your experience differ from before?

One difference was that JabRef uses Gradle to build while Apache Commons Lang uses Maven, but this switch was fairly smooth. JabRef provided detailed instructions for how to set up a local workspace, particularly in IntelliJ, which was very helpful.

## Effort spent

For each team member, how much time was spent in

1. discussions/meetings;

- Meeting 1: initial discussion to look for projects and issues (45m)
- Meeting 2: finalizing project and issue choice (30m)
- Meeting 3: discussing chosen issue and preparing to start work (60m)
- Meeting 4: creating work plan and delegating tasks (30m)
- Meeting 5: check-in on progress and delegating next tasks (15m)
- Meeting 6: check-in on progress and discussing final steps to complete requirement 1 (30m)
- Meeting 7: discuss and delegate final tasks (45m)

2. discussions within parts of the group;

Anna

Emil

Filippa

Lotta

Tianning

3. reading documentation;

Anna

Emil

Filippa

Lotta

Tianning

4. configuration and setup;

Anna

Emil

Filippa

Lotta

Tianning

5. analyzing code/output;

Anna

Emil

Filippa

Lotta

Tianning

6. writing documentation;

Anna

Emil

Filippa

Lotta

Tianning

7. writing code;

Anna

Emil

Filippa

Lotta

Tianning

8. running code?

Anna

Emil

Filippa

Lotta

Tianning

9. in total?

Anna

Emil

Filippa

Lotta

Tianning

## Overview of issue(s) and work done.

Title: Import bib files from BibDesk and parse the groups + linked files

URL: https://github.com/JabRef/jabref/issues/10381

Add support for importing reference libraries from BibDesk, another reference management tool, to JabRef. In particular, make BibDesk groups available in the JabRef library and decode/translate BibDesk-specific fields.

Scope (functionality and code affected).

**TODO** 

## Requirements for the new feature or requirements affected by functionality being refactored

1. Import BibDesk Static Groups to JabRef

A BibDesk Static Group groups an arbitrary set of references in a reference library. The group information is stored as metadata in a comment field in the library bibliography file and entries in the group are identified by a list of citation keys in the comment. JabRef should support the import of such groups. For every BibDesk Static Group specified in the library bibliography file, the JabRef importer should create an equivalent JabRef Explicit Group containing the specified entries. It should make these groups available in the JabRef library.

2. Import BibDesk Smart Groups to JabRef

A BibDesk Smart Group groups references in a library based on specified criteria in one or several of the reference fields. The group information is stored as metadata in a comment field in the library bibliography file. Unlike a BibDesk Static group, the entries in the group are not explicitly listed. Rather, the group is identified by a set of criteria. JabRef does not have an equivalent dynamic group type, but it should still support the import of such BibDesk groups by creating explicit groups with the appropriate references. For every BibDesk Smart Group specified in the library bibliography file, the JabRef importer should use the criteria to identify which references in the library should belong to the group and create a JabRef Explicit Group with these entries. It should make these groups available in the JabRef library.

3. Import Multiple BibDesk Group Types to JabRef

A BibDesk library may contain several groups of different types. Information about the groups is contained in a comment for each type (Static or Smart). That is, there may be multiple groups of the same type in one comment but if the BibDesk library contains both Static and Smart groups, there will be two separate comments. The JabRef importer should be able to import all groups in such libraries and make them available in the JabRef library. In particular, it should only create one group tree even if bibliography file contains multiple group comments.

4. Convert BibDesk Linked Files to Proper Format

BibDesk stores linked files in reference fields called `bdsk-file-x`. The field includes a base64-encoded binary plist containing the relative path and metadata that macOS uses to keep track of a file in case it is moved. The JabRef importer should decode such fields and translate the field name and contents according to the conventions of the corresponding JabRef field `file`.

Optional (point 3): trace tests to requirements.

1. BibtexParserTest:integrationTestBibDeskStaticGroup traces to requirement 1 (Import BibDesk Static Groups to JabRef)
2. BibtexParserTest:integrationTestBibDeskSmartGroup traces to requirement 2 (Import BibDesk Smart Groups to JabRef)
3. BibtexParserTest:integrationTestBibDeskMultipleGroup traces to requirement 3 (Import Multiple BibDesk Group Types to JabRef)
4. BibtexParserTest:... traces to requirement 4 (Convert BibDesk Linked Files to Proper Format)

## Code changes

### Patch

git diff main bibDeskImport

Optional (point 4): the patch is clean.

## Test results

Overall results with link to a copy or excerpt of the logs (before/after
refactoring).

**TODO**

## UML class diagram and its description

### Key changes/classes affected

**TODO**

Optional (point 1): Architectural overview.

**TODO**

## Overall experience

What are your main take-aways from this project? What did you learn?

**TODO**

How did you grow as a team, using the Essence standard to evaluate yourself?

**TODO**

Optional (point 6): How would you put your work in context with best software engineering practice?

