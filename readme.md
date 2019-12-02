> **The Academic Honor Policy (see Brightspace) is applicable to all work you do in CS 3270/5270.**

# CS 3270: Programming Languages
## Project 4

## Goal

Gain experience in quickly learning a new programming language.

## GitHub notes

Please see [GitHub notes](github_notes.md) for more information on cloning, committing, and pushing repositories.

## Dates
Date|Description
----:|-----------
Friday (11/15)|Notification of language choice and if working individually or as a team by completing [Google form](https://docs.google.com/forms/d/e/1FAIpQLSctVussK447nbLL3D-5vGWSnJ_uWMgHxIORCWVVAKFPxTvf-Q/viewform?usp=sf_link)
Wednesday (11/20)|Selection of presenters and schedule of presentations
Sunday (12/01)|Due date
Monday (12/02)<br />Wednesday (12/04)|Presentations

## Assignment

Create a Sudoku solver in a language that is new to you.

At this point in the class, you have programmed a Sudoku solver in C++, Racket, Prolog, and you will see Ruby in the final homework assignment. You are now to write a Sudoku solver in a language that is new to you. The languages you may choose from are:

* Ada
* Elixir
* Erlang
* F#
* Fortran
* Haskell
* Lua
* OCaml\*
* Rust
* Scala\*\*

\* Perferred OS is MacOS (hard to install on Windows)
\*\* Using Java packages prohibited

Your solver should either ask the user for the name of a text file or hard-code the text file name in the source code. Make sure you specify in your instructions how to use your program (i.e., will be prompted for the file name or file name stored as variable). If the file name is stored as a variable, make sure it is easy to update.

Note that the previous projects imported a puzzle in two different ways. In the Project 1 (C++), the contents of the text file were read one token at a time and stored in some data structure. In Projects 2 (Racket) and 3 (Prolog), the text file contained the actual code for the data structure in textual form (i.e., a list of lists) and built-in functions were utilized to import the textual version of the list of lists into the program. You may implement the reading of the text files either way.

Like the Sudoku solvers from previous projects, your program should print the initial board then the solved board or a "no solution" message if the board can't be solved.

You do not need to incorporate Travis CI in your project.

## Language selection and working individual or as a team

If you want, you may work on teams of up to three students for this project. All team members must be in the same course section. Regardless if you are working individually or as a team, you must complete the [Google form](https://docs.google.com/forms/d/e/1FAIpQLSctVussK447nbLL3D-5vGWSnJ_uWMgHxIORCWVVAKFPxTvf-Q/viewform?usp=sf_link) by **Friday (11/15)** with information on which language you have chosen for this project, and who you will be working with if you are working on a team. For a team, only one member of the team is required to complete the form (i.e., only one submission per team). Failure to complete the form by the deadline will incur a late penalty. After you complete the form, a repository will be generated for you. When the repository is ready, you will receive an email with the URL for the repository.

## Project submission

For submission, the individual or team repository for Project 4 on GitHub should contain the following files:

* All source code. Make sure to add block comments to the top of all source files and include an academic honesty statement.
* Two text files containing test puzzles, one that is solvable and one that isn't.
* An image file (GIF, JPG, or PNG) showing a screen shot of your program solving a puzzle.
* Update the `project4.md` file and add the information below.
  * Names of team members.
  * Instructions on how to access an appropriate compiler/interpreter for your solver. Please include a URL and any special installation instructions. You may include installation instructions based on the operating system that you used for the project.
  * Instructions on how to use your solver. Please include, as appropriate, instructions on compiling, linking, and running your solver.
  * A short description of what language feature that you found interesting or helpful.
  * A short description of what you found the language to be lacking of, an aspect of the language that was hard to understand, or a disadvantage that you perceived of the language.

### Markdown markup language

The `project4.md` file is a *Markdown* file, which allows you to use simple syntax to format the text in the file. You can open and edit `project4.md` in your favorite text editor. You are not required to *beautify* your text in this file, but at the very least, place a header before each of the items listed above. For example, add a header using two or three `#` before the header text:

```
## Names of team members

Satya Nadella, Sundar Pichai, and Mark Zuckerberg
```

Please include the screen shot of your program solving a puzzle in `project4.md`. Use the `[text](file name)` markup code to include an image. The resolution of the image should be good enough to be able to read the output of the program. The following example markup code will display the image file named `example-screen-shot.png` that is located in the `images` folder in this repository.

```
[Screen shot of program solving a puzzle](images/example-screen-shot.png)
```

![Screen shot of program solving a puzzle](images/example-screen-shot.png)

### Participation form for team projects

**Important:** For those who are on a team, each team member must complete the [Google form](https://docs.google.com/forms/d/e/1FAIpQLSfRwjXjpl1j5rByTaaXvzmVKv1iNn8cHqnpjnbpZ2AuL88ZbQ/viewform?usp=sf_link) by the project due date on **Sunday (12/01)** discussing how much each team member contributed to the project. A team member who does not complete this form by the deadline will be deducted 10% from that team member's score. Those working individually do not need to complete the form.

Your submission to the form stating your personal opinion will not be shared with other team members. You should state a percentage of contribution by each team member (should total 100%) and you should provide additional commentary describing each team member's contribution to the overall effort. Optionally, you can provide information on any special circumstances you want me to be aware of. Note that we will not look at how active each team member is on the GitHub repository (e.g., committing code). Team participation will be based on the form above.

## Style guidelines

* **Structure:** You should not place the entire solution in one function/method. Make sure you modularize your code (i.e., place code for sub-tasks in different functions/methods).

* **Line lengths:** No lines should exceed 100 columns.

* **Indentation:** Use proper and consistent indentation.

* **Whitespace:** Functions/methods should be separated by at least one empty line.

* **Comments:** Use Javadoc-style comments to document all functions/methods. For your reference, below is an example of Javadoc-style comments for a method.

   ```
  /**
   * Returns an Image object that can then be painted on the screen.
   *
   * @param  url  An absolute URL giving the base location of the image.
   * @param  name The location of the image, relative to the url argument.
   * @return      The image at the specified URL.
   */
  ```

## Final presentations

Several individuals and teams will be expected to present a final report to the class. This presentation is limited to 7 minutes. The presentation should include an introduction about the language. Then one interesting feature of the language that was used in the Sudoku solver, and one extra challenge that was faced in creating a solver in the given language (basically what you reported in `project4.md`). Viewing actual code is okay if it enhances the discussion. The presentation may also include a quick demonstration of the solver (though that is not required). Presenters and presentation order will be selected by a random drawing on **Wednesday (11/20)**. Presentations will take place on **Monday (12/02)** and **Wednesday (12/04)**. Not all teams will have an opportunity to present due to time limitations. Those presenting will not get extra points, but presentations that are really poor may affect your score.

## Grading

Each team member will receive the same grade unless a team member did not contribute much to the final project (in which case their score may be reduced by 10%).

If you are encountering difficulties implementing the reading of the puzzles from a file, you may forgo this feature and instead store the puzzle in an array (or similar structure). However, your score will be reduced by 6%.

If you are encountering difficulties and need to change the language that you initially chose, you must contact the instructor about the change. Note that your score will be reduced by 15%.

## Graduate students

You are required to select a second language and create a Sudoku solver with that language, too. For the second language, you **are not** allowed to join a team. That is, for one of your languages you can join a team, but for the other you must work individually. Of course, you may work on both individually, too. Please email your second language selection directly to the instructor. The due date for this second language is the last day of class on **Thursday (12/05)**.

## Academic honesty

As with the previous projects, there are many solutions to Sudoku in many different programming languages available on the Internet. Do not look at the code you may find there. Using code that you find on the Internet is unethical, and of course you would miss the learning opportunity that you get by developing this yourself. This instructor will report any violations to the university's Honor Council.

## Final notes

Ensure that your name, VUnetID, email address, and the honor code statement appear in the header comments of your source files.
