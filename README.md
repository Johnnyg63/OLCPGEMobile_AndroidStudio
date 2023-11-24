# OLC Pixel Game Engine Mobile 2.2.3 for Android Studio
<p><b><i>!!! NOW WITH SOUND !!!</i></b></p>
<p><b>Supports olcPGEX_MiniAudio.h</b><br/><a href="https://github.com/Moros1138/olcPGEX_MiniAudio/">https://github.com/Moros1138/olcPGEX_MiniAudio/</a> thanks @Moros1138</p>
<p><b>Supports: Windows, Linux and Apple MAC</b></p>
<p><b>This project supports Android devices</b><br/> SDK 23 --> 33 and beyond</p>
<p><img src='https://github.com/Johnnyg63/OLCPGEMobileAndroidProjectBeta20/assets/96908304/b5e9e72e-73cf-4fe1-ba66-7df31790fce9' /></p>
<p><i>iOS is under development and will be released ASAP</i></p>
<p><i>OLC Pixel Game Engine Mobile supports PGE 2.0 games created for Windows, Linux and Apple MAC.<br/>Please see:<br/>
  <a href="https://github.com/Johnnyg63/OLCPGEMobileAndroidProjectRelease221/tree/master/Demos">PGE Mobile 2.0 Demos</a><br/>
  <a href="https://github.com/Johnnyg63/OLCPGEMobileAndroidProjectRelease221/tree/master/Extensions">PGE Mobile 2.0 Extension</a><br/></i>
  Accessing assets on the PGE Mobile 2.0 is different to PGE 2.0. Please use the builtin FileManager (see 2.09 support details below)<br/>
  There is also an examples of FileManager usage in most of the demos.
</p>
<p>To rename this project please see:<br/> Please see: <a href="https://www.delasign.com/blog/android-studio-rename-project/">How to rename an Android Studio Project</a> for steps</p>  
<p>To use the Project Template please see: <i>currently creating this folks</i> </p>

 <p><b>Release 2.2.3 Support Details</b></p>
<p>
<ul>
  <li>2.01: BETA Port code from olcPixelGameEngine.h to olcPixelGameEngine_mobile.h</li>
  <li>2.02: Corrected support for X86</li>
  <li>2.03: Update EventManager to handle, Touch, Mouse and Keyboard events</li>
  <li>2.04: Corrected Touch offset, added 1 touch point, unlinked Mouse & Touch Events</li>
  <li>2.05: Sensors Support added</li>
  <li>2.06: Multi Touch Support</li>
  <li>2.06a: Added basic mouse support for Android Emulator</li>
  <li>2.07: Updated SIMD_SSE for Intel Atom devices, Updated GetTouch() to default to touch point zero</li>
  <li>2.07a: Corrected two small bugs in main.cpp</li>
  <li>2.08: Added ClearTouchPoints(int8_t startIndex = 0) for clearing of touch points at index x, some bug fixes too<br/> <i>Added Demos folder with some demos. Just Copy and Paste the code into main.cpp</i></li>
  <li>2.09: Added Demos folder with some demos</i>
	<br/> Added: FileManager: for gaining access to the Android Assets APK and iOS Zip Packages
				<br/> app_LoadFileFromAssets()
				<br/> app_ExtractFileFromAssets()
				<br/> app_GetInternalAppStorage()
				<br/> app_GetExternalAppStorage()
				<br/> app_GetPublicAppStorage()
				<br/> SmartPtr filehandler
				<br/> LoadFileFromAssets()
				<br/> ExtractFileFromAssets()
				<br/> GetInternalAppStorage()
				<br/> GetExternalAppStorage()
				<br/> GetPublicAppStorage()
  </li>
  <li>2.10: Removed ASensor_getHandle() as it only supports SDK 29 and higher. Updated project to support SDK 21 to SDK32, Thank you @VasCoder</li>
  <li>2.11: Corrected offset error bug in Drawline,<br/> Added release config to build.gradle.template. Please see: <a href="https://developer.android.com/studio/publish/app-signing">https://developer.android.com/studio/publish/app-signing"</a> and<br/> Please see: <a href="https://developer.android.com/studio/publish/app-signing">https://stackoverflow.com/questions/9081877/how-do-i-debug-an-apk-that-is-signed-for-release</a> for more info<br/><b>NOTE: You cannot debug or deploy a release app unless you have a signing key (Android Developer Account)</b></li>
  <li>2.20 <b>Pre-Release!</b> Can now be used in Production Environment, have fun! <br/> Android Keyboard mapping completed for GetKey() <br/>Note if using a MacOS, Linux or Windows for debugging, some keys may not map correctly, directionally keys will be out of sync as Android is mapped to a Direction Pad by default</li>
  <li>2.21 <b>Full Production Release</b> <l/i>
  <li>2.22 Better support for the latest Android phones<br/>
			The Engine will now detect the correct OpenGLES setting for your Android phone and apply the correct settings</li>
  <li>2.23 Now with Sound, supports olcPGE_MiniAudio <a href="https://github.com/Moros1138/olcPGEX_MiniAudio/">https://github.com/Moros1138/olcPGEX_MiniAudio/</a> thanks @Moros1138
		   <br/>Updated EventManager::HandleInput to ensure Volume UP/Down/Mute, Camera and Power Buttons are released back to the OS after execution
  </li>
</ul>
</p>
<p>
	<b>Apple Platforms will not see these updates immediately</b><br/>
	<b>iOS port in progress. Beta release due soon</b>
</p>
 
