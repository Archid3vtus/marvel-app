package b4a.MarvelApp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class url_subs_0 {


public static RemoteObject  _getauth(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetAuth (url) ","url",2,_ba,url.mostCurrent,28);
if (RapidSub.canDelegate("getauth")) { return b4a.MarvelApp.url.remoteMe.runUserSub(false, "url","getauth", _ba);}
;
 BA.debugLineNum = 28;BA.debugLine="Sub GetAuth As String";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Return ts & \"&\" & apikey & \"&\" & hash";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.concat(url._ts,RemoteObject.createImmutable("&"),url._apikey,RemoteObject.createImmutable("&"),url._hash);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getprefix(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetPrefix (url) ","url",2,_ba,url.mostCurrent,24);
if (RapidSub.canDelegate("getprefix")) { return b4a.MarvelApp.url.remoteMe.runUserSub(false, "url","getprefix", _ba);}
;
 BA.debugLineNum = 24;BA.debugLine="Sub GetPrefix As String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Return prefix";
Debug.ShouldStop(16777216);
if (true) return url._prefix;
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private ts As String = \"ts=1\"";
url._ts = BA.ObjectToString("ts=1");
 //BA.debugLineNum = 7;BA.debugLine="Private apikey As String = \"apikey=5fc96ead8b9128";
url._apikey = BA.ObjectToString("apikey=5fc96ead8b912800a22481d1132159cc");
 //BA.debugLineNum = 8;BA.debugLine="Private hash As String = \"hash=e7d5ec269e6de7ccd4";
url._hash = BA.ObjectToString("hash=e7d5ec269e6de7ccd44a646a8ef92e8f");
 //BA.debugLineNum = 9;BA.debugLine="Private prefix As String = \"https://gateway.marve";
url._prefix = BA.ObjectToString("https://gateway.marvel.com:443");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}