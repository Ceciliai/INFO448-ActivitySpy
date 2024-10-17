# INFO448-ActivitySpy
A homework for my UW INFO448 class.

## Goal
The goal of this homework is to:

* Build an Android application 
* Override certain methods to see the activity lifecyle in motion
* Make use of the diagnostic logging system in Android
    * Writing to it
    * Knowing where those messages write to
    * Learning how "tags" work and how to filter on them

## Steps
Create an "Empty Views" project in Android Studio. Make sure the "New Project" dialog uses the following values:

    * "Name": "Activity Spy"
    * "Package name": edu.uw.ischool.{Your NetID}.activityspy
    * "Save location": this directory
    * "Minimum SDK": API 28 ("Pie"; Android 9.0)

Then push "Finish".

> If you did not complete the "Hello, Android" homework from the first day of class, you may find that Android Studio has to download a bunch of things when you first create this application--this is normal. It may take a few (sometimes up to 20) minutes, depending on the speed of your internet connection to download everything. Keep an eye on the status bar in the bottom of the Android Studio main window--it will tell you when it's finished.

Now, you are ready to complete the stories for this homework.

## Stories
There are principally three stories required:

* Change the "Hello, World" message in the generated code to read "Greetings, UW!"
* For each of the Activity lifecycle methods (onCreate, onDestroy, onStart, onStop, onPause, onResume) write a message to the INFO diagnostic log that says "on{eventname} event fired". If there are any parameters passed to those methods, write them to the log as well.
* In the onDestroy() method, you must *also* write a message to the ERROR diagnostic log that says "We're going down, Captain!". (You may, if you wish, use a different message, so long as it is a dramatic movie quote. You must identify the movie, e.g., "'Woah.' --Neo, The Matrix")

> NOTE: There are two ways to change "Hello, World" to "Greetings, UW!"; one is to edit it in the layout designer, but this will generate a warning about a hard-coded string when you do the build. The other way is to change the *string resource* that is used in the scaffolded code; we will talk more about that later in the quarter. For now, it's OK to live with the warning.

## Artifacts
In addition to the code required to build and run this application, create a new directory under this one called `screenshots`; in that directory, include a screenshot of the application running either on the emulator or on a physical device.

We also want to see the diagnostic log emitted by your application--you can do this one of several ways:

* Capture the diagnostic log into a text file (call it `diagnostic.txt`) and include that file in this directory.
* Take a screenshot or video of the diagnostic log window in Android Studio.

In both cases, your messages must be visible! (Part of what we want to make sure you know how to do is log things to the diagnostic log, and find them--it's a powerful and valuable debugging technique.)

## Gradic Rubric
This assignment is worth 5 points:

* 1 pt, it builds and runs in the emulator
* 1 pt, the diagnostic log is present in the repo
* 3 pts, one for each satisfied story above

Extra credit:

* 1 pt: Put a second text field onto the activity, and do a quote-with-attribution thing; that is, have the first text field contain a quote ("Whoa") and the second text field have the character who said it and what movie it's fromt ("--Neo, The Matrix"). The secod text field should be below the center, and the text in it italicized.
