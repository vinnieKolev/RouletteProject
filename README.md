RouletteProject

Assignment X - Game Project
Due: Revised -- Thursday, July 20 (FINAL ABSOLUTE DEADLINE -- no lates)
Objective
Programming in Java involves not only understanding the syntactic rules and constructs of the language, but also the ability to research the libraries that are needed for a task, as well as organizing good object-oriented design. The Java API is very large and has many pre-built features. After this assignment, you will have some experience looking into existing Java libraries and designing a small program using object-oriented techniques.
Task
For this assignment, you will design and implement a game in Java. This project is to be done in groups of 3 people each. The final deliverables will be due at the end of the term.

Details
You may choose from a variety of board games List or 1-player solo games, or you may request a game that is not on the list, but it must be approved in advance. The idea is for various groups to do different games -- but to ensure that more groups will get one of their first choices, we'll allow at most two groups to do any one specific game.
Send me an e-mail (fl19g@my.fsu.edu) indicating who is working together, as well as what game you want to do (you should indicate a second and possibly third choice, in case your first is already taken). I will update choices on the linked chart as choices are made -- first come first serve.
If you want to request a game that is not already on the list, include this in your e-mail, along with a description of the game and/or link to online instructions for the game. Essentially, I want to ensure that each group is doing a game that is of an appropriate level. (Tic-tac-toe, for example, is too simple, and we've already done a version of it).
A good choice of game should be one that has choices to make by players, and at least 2 or 3 GUI controls. For example, a game like Chutes and Ladders would be a weak choice, because the only player control is to roll the dice -- there are no other controls, and no actual choices to make.
The minimum requirement is to write a game with a graphic interface as a Java application, which can be played by 1 or more human players on the computer. It should have an intuitive and usable interface, and it should implement the standard set of rules for your chosen game. In the event that you have a game with some rule variations, you should include information in your README file (described below) that clarifies what version of the rules you are implementing.
 
General Guidelines for Grading: Since you have the freedom to implement the design, grading for this project will be somewhat subjective. However, here are some guidelines I will be using:
Programs will be judged on 3 primary factors -- Correct rules implementation, user interface (GUI), and class/code design
 
To qualify for an A: Rules of game implemented correctly, playable game, well-designed GUI interface that is intuitive for the user, program fairly robust (erroneous inputs handled, for instance), well-designed object-oriented code. At least one extra feature, that goes beyond the basic game rules (Examples: multiple versions of rules implemented, a save-game feature, etc. If you're not sure whether a certain feature would satisfy this, ask).
 
To qualify for a B: Rules of game implemented mostly correctly (perhaps a few flaws, but fixable), usable GUI, playable game, reasonably good code design.
 
To qualify for a C: The main aspects of gameplay implemented correctly, so that the game is more or less playable, even if there are some flaws or other rules that didn't get implemented. Some sort of GUI (even if rough around the edges, and not as user-friendly).
 
Due to the fact that some games are harder to implement than others, the level of difficulty of implementing a game will factor in as well when judging rules implementations. (For example, chess has more complicated rules than checkers).
 
Roughly, the grading breakdown is:
Rules implementation / gameplay -- 30%
User interface (GUI) -- 30%
class/code design -- 30%
Some extra feature(s), beyond normal game rules -- 10%


Notes on these breakdown items:
Rules
Your game needs to adhere to the standard set of rules for the chosen game. If not a standard well-known game (like chess), make sure to provide rules or a link to the rules in your README file, along with any rule variations you are implementing.
User interface
This will be judged on the overall user experience / user friendliness. Strive for intuitive and appropriate GUI controls. Avoid redundancy (extra clicks just for the sake of having extra controls, buttons, etc). Also strive for a more attractive and clean-looking interface that an average person would WANT to use.
Also, make sure your game runs on a reasonable screen/window size (like a standard desktop or laptop screen). I should not have to hook up 2 monitors in parallel or one stacked on top of the other to view your game!
Code design
Code design will be judged on appropriateness of object-oriented design, modifiability, readability, easiness to debug. Avoid brute-force copy/paste style coding -- this leads to tedious code that is hard to read, modify, and debug. (When designing a game like this, you want to have code that would make it easy to add new features in the next version, for example).
Guidelines for researching resources
As we've been primarily using Java SE 11 in this class (it's the one installed on linprog), make sure your code compiles and runs with the Java 11 SDK (Standard Dev Kit). If you want to use the Java 8 SDK, that's fine as well, as that one is still a pretty commonly used Java version, and all of its features would work in JDK 11. Don't use features that are ONLY in JDK 15, for example.
You may use any of the Java libraries in the JavaSE (standard edition) API (unless you happen to find a package like java.game.monopoly, for instance).
It would probably be a good idea to look at many other GUI examples (including the ones we've done in class) and look at the tutorials on the java.sun web site (now on oracle), to help you find other techniques and tips for implementing graphic interfaces with event handling
If you find a resource that gives you some ideas -- and especially if you model a portion of your code after another example -- be sure to cite your source in your documentation
The coding, however, must be yours! You are to implement your own game logic (i.e. you may not just find an existing implementation of a game and use code found on web searches).
Any actual Java code in your program needs to be generated by you (and not auto-generated, for example, by NetBeans).
For GUI components and layouts, you may use Swing libraries, or you may use Java FX (i.e. embedded XML for the components and layouts). If you choose to use the latter, you may have some XML files generated by the SceneBuilder tool, but again, any Java code must be yours.
You may use icons, graphics pictures, sounds, etc that you find online. If and when possible, cite your source, and be sure to pay attention to any copyright notices regarding such resources. (Example: If you choose a solitaire card game, it would be a good idea to find image files of cards, for a nicer interface -- it's best to find public domain images for this sort of thing).
Extra Credit Opportunities -- I'm leaving this wide open. There will be plenty of chances to earn extra credit on this assignment. Anything above and beyond the minimum requirements can be done for extra credit. Be sure to list anything extra you do in your README file, so I know to look for it. Here are just a few possible things you could try, just to give you some ideas (but certainly not limited to these):
Save/Open feature, for saving games in progress
For a game with rule variations, implement the ability to play using one or more of the variations (or a menu to choose rule settings, if appropriate).
More creative and fun visual layouts, possibly incorporating graphics, sounds, animations, etc.
 

Resources
Core download page for the Java SDK
Boardgamecentral.com - a site that might help give ideas for games to choose
"The Really Bix Index" of java tutorials - links to tons of tutorials on the java.sun web site.

Deliverables:
You should pack all relevant files for your assignment into one jar file (named hwx.jar). The jar file should contain:
All necessary .class files and resource files that make your program work
All source code files (.java files) for your program
A README file (this can be in text format or in html format) that contains any extra documentation for your project. This should include
Any details regarding instructions for the game that are not obvious from the set of standard known instructions
A description of how to use the interface
Any other important details about your implementation, how to run the program, etc
Descriptions of any extra features implemented
A description of the separation of work between partners (who was responsible for what pieces of the program).
Your jar file should also be runnable. This means that if you wrote it as an application, I should be able to play your game with the command:
 java -jar hwx.jar

Possible exception: If you happen to do anything that involves multiple programs (like a client/server implementation), then you can pack those as separate runnable jar files, then put those into the main archive. Make sure any such details are noted in your README.
Submit your assignment via the Canvas submission links. Only ONE student in the group needs to physically submit the file, but make sure names of group members are included in your submission. Remember to INCLUDE YOUR SOURCE CODE in your jar file!
