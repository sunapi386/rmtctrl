
<TITLE>Android RemoteCTRL</TITLE>

<h1>Android RemoteCTRL</h1>

<p> 
This is the documentation/prototyping page for the Android RemoteCTRL project. Start date April 28, 2013.</p>

<h2>Overview</h2>

<p>
In a typical home theatre system, there are too many remotes: tv, dvd/bluray, amplifier, cable, sat, and possiblity things like xbox, PS3, and HTPC. Whenever this is the case, turning on the and coordinating an intent such as "I want to watch my bluray" or "I want to play xbox" becomes a combination challenge. This project aims to solve that problem.
</p>

<p>The content of this webpage will be divided to two sections, which I will be writing about in order: 
<ol>
<li>Android app, which is the main UI, where the user can program the remote. I talk about theory and then my implementation.</li>
<li>IR blaster which runs off a small arduino, connectivity is established via bluetooth.</li>
</ol>
<p>I'll be working on developing the android app in parallel with the ardunio component.
</p>
</p>
<h1>Android Development Section</h1>
<h2>Learning Android: Theory</h2>

<h3>Purpose of Android:</h3>
<ul>
<li>To solve a fragmented market. Different phone manufacturers had different platforms and Android creates a universal properietory free foundation.</li>
<li>To be freely modifably and distributable. </li>
<li>To allow users to acquire any applications that is available. Previously users could only get what their phone networks allowed.</li>
</ul>

<h3>Environment:</h3>
When developing for the android, keep in mind of these things. 
<ul>
	<li>Limited Resources.</li>
<p>The primary concern is battery time. Design the program to run only when necessary</p>
	<li>Mobile mashups. </li>
<p>Applications can incorporate and leverage existing applications.</p>
	<li>Interchangeable applications.</li>
<p>Rather than specifying what programs must be leveraged, one can use "intents" to request a service, which the OS will handle, rather than handling it yourself.</p>

<h3>Components of an App:</h3>
<ol>
<li>Activities
<p>Comparable to stand alone utilities on desktop systems. These usually correspond to a display screne to the user. When not actively running, can be killed by OS to conserve memory. </p>
</li>
<li> Services
<p>Runs in background, generally no exposed UI. </p>
</li>
<li> Broadcast and Intent Receivers
<p>Two types. Broadcast receivers does the announcement; Intent receivers responds to an announcement. </p></li>
<li> Content providers
  <p>Created to share data with other acitivites or services. Uses a standardized interface in the form of a URI (uniform resource identifier) to fufill requests for data from other applicaitons. The OS figures out who is the content providers for the given URI. </p></li>
</ol>

<h3>Summary: </h3>
Application should make use of mechanisms provided rather than "reinventing the wheel". The applications can be freely changed, and the loose coupling of intents and URI keeps things working.
<h2>Learning Android: Practice</h2>
<p>Configuring eclipse and the android SDK and emulator is pretty straighfoward. I followed the tutorial on android's website <a href="http://developer.android.com/sdk/index.html">http://developer.android.com/sdk/index.html</a>. I don't have an android phone and so I need to use the emulator. </p>
<p>I found a x86 version which should speed it up. Emulation is done right down to the kernel and it is pretty slow and laggy, especially when emulating the ARM processor. I strongly recommend getting <a href="http://docs.xamarin.com/guides/android/deployment,_testing,_and_metrics/configuring_the_x86_emulator">this x86 version instead</a>, since Intel CPUs  supports virtualization environment through Intel VT. </p>

<h1>Arduino Development Section</h1>
<h1>Raspberry Pi Development Section</h1>