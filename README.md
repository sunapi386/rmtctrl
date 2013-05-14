Update May 14: This project's development has been discontinued. No further updates on android app & arduino remote IR blaster.
<h1>RemoteCTRL</h1>

This is the documentation/prototyping page for the Android RemoteCTRL project. Start date April 28, 2013.

An exact replicate of this already out: http://www.youtube.com/watch?v=4NEX6loZFhE

<h2>Overview</h2>

In a typical home theatre system, there are too many remotes: tv, dvd/bluray, amplifier, cable, sat, and possiblity things like xbox, PS3, and HTPC. Whenever this is the case, turning on the and coordinating an intent such as "I want to watch my bluray" or "I want to play xbox" becomes a combination challenge. This project aims to solve that problem.

<h3>Android Application</h3>
The applications has three main functionality:
1 - Connect & pair with Arduino over bluetooth. Not implemented.
2 - Learn remote signal code. Stores data & signal name in db (SQLite), masked by a content provider. Not fully functional.
3 - Replicate signal. Pulls in db content and displays them as buttons.

<h3>Hardware</h3>
Two functionality:
1 - Pair with phone over bluetooth. Not implemented.
2 - Abel to receive & send IR signals. Used a 38kHz IR reader and 940nm IR led. This works.
