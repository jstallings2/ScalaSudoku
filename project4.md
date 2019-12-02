# Project 4
## CS 3270: Programming Languages
## Team Members
### Taylor Pothast, Jacob Stallings, Lyndon Vickrey


## Compiler/Interpreter

The entire project and all the build files are contained in the root folder, which is called ScalaSudoku.  
If you have the Scala plugin in IntelliJ IDEA installed you should be able to download/clone and run the ScalaSudoku project root folder in IntelliJ. (Make sure ScalaSudoku folder is set as the root folder, not project4-36 or it may not work).  
However this won't work if sbt and JDK 1.8 aren't installed, so here's how:

To run the solver you will need to install the sbt shell (sbt stands for Scala Build Tool). The sbt shell acts as a REPL that automatically runs every time a change is detected in one of the source files. You must also have the Java JDK version 1.8 installed.  
Java JDK can be downloaded from Oracle's website (you will need to create an account): https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html  
sbt shell was installed using Homebrew on MacOS. To install Homebrew: https://brew.sh/ and copy the "Install Homebrew" text dialog and paste into terminal.
Once Homebrew is installed you can run `$ brew install sbt`
sbt can run in the command line using the command ~run, but we used an IDE. 
NOTE: The program was developed in JetBrains IntelliJ IDEA by creating a new project. There's a good chance you'll need to do this and then add in our source files by copy/paste. In case of that: here's instructions for setting up a new Scala project in IntelliJ:  
To do this you will need to install the Scala plugin in IntelliJ by going to IntelliJ IDEA > Preferences > Plugins and search for "Scala". You will need to restart IntelliJ.  

1. Open up IntelliJ and click Create New Project  
2. Select Scala and then sbt (first option) and click OK. Name the project and click finish.  
3. The shell will take a second to set up.
4. On the project structure, go to src/main/scala and right click on the scala directory and click New -> Package.  
5. Name the package, put both the source files in this package. In our project, Main is a Scala object while Sudoku is a Scala class. Both files should end in .scala and have `package` + whatever you named your package at the top.  
6. The shell should build automatically, but if it doesn't you can always trigger a bulid by pressing Build.  

## Running the program

Replace the text "sudoku-test1.txt" in the first line of the main method in Main.scala with an input text file representing a puzzle (must be a path if the file is not in project root directory)  
The sbt shell should trigger a build and rerun automatically. If it doesn't, you can do it manually by clicking build. If that still doesn't work, type ~run in the sbt shell dialog.  

Alternatively you can go into IntelliJ's settings and run the shell. Here's how to do that: https://www.jetbrains.com/help/idea/run-debug-and-test-scala.html  


## Discussion  
We chose to use Scala in the group project of trying to solve sudoku using a new language.  Scala combines object-oriented and functional programming in one concise, high-level language. Scala's static types help avoid bugs in complex applications, and its JVM and JavaScript runtimes let you build high-performance systems with easy access to huge ecosystems of libraries. 

Martin Odersky founded the program at the Programming Methods Laboratory of Ecole Polytechnique Federale De Lausanne on January 2004 following work on Funnel. 

Scala had many interesting features. One that we found interesting was the mutable and immutable collections, specifically in our project we used mutable.List and mutable.HashSet. Scala has a Standard library which provides both mutable and immutable versions of many data structures, called "collections". It is similar to the C++ STL. Immutable collections are used when functions are desired to be non-destructive.

We faced a challenge of using a Stack as part of the solver. We wanted to use a stack to temporarily store possible values 1-9 for a certain location. However, Stacks have been deprecated in Scala, since they were basically just wrapper classes for the Scala List class. The workaround was to use a List, a linked list that functions similarly to Racket lists (has head and tail operations).  
File I/O was also a challenge because we could not use the Scanner functionality of Java (normally Scala has access to all java packages because of the JVM) and cannot parse token-by-token as C++ does. Many NumberFormatExceptions were thrown but the issue was finally resolved.  



## Screenshot of program solving the puzzle
[Scala solver solving the puzzle](ScalaSudoku-solver-screenshot.png)


## Goal

Gain experience in quickly learning a new programming language.

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

### Program Solving the Puzzle

The `project4.md` file is a *Markdown* file, which allows you to use simple syntax to format the text in the file. You can open and edit `project4.md` in your favorite text editor. You are not required to *beautify* your text in this file, but at the very least, place a header before each of the items listed above. For example, add a header using two or three `#` before the header text:


Please include the screen shot of your program solving a puzzle in `project4.md`. Use the `[text](file name)` markup code to include an image. The resolution of the image should be good enough to be able to read the output of the program. The following example markup code will display the image file named `example-screen-shot.png` that is located in the `images` folder in this repository.

```
[Screen shot of program solving a puzzle](images/example-screen-shot.png)
```

![Screen shot of program solving a puzzle](images/example-screen-shot.png)


