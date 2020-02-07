package b4a.MarvelApp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class charactercontroller_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private http As HttpJob";
charactercontroller._http = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");__ref.setField("_http",charactercontroller._http);
 //BA.debugLineNum = 3;BA.debugLine="Private toBeSent As Object";
charactercontroller._tobesent = RemoteObject.createNew ("Object");__ref.setField("_tobesent",charactercontroller._tobesent);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _downloadimage(RemoteObject __ref,RemoteObject _address) throws Exception{
try {
		Debug.PushSubsStack("DownloadImage (charactercontroller) ","charactercontroller",1,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("downloadimage")) { return __ref.runUserSub(false, "charactercontroller","downloadimage", __ref, _address);}
Debug.locals.put("address", _address);
 BA.debugLineNum = 21;BA.debugLine="Public Sub DownloadImage(address As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="http.Initialize(\"DownloadImage\", toBeSent, False)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_http" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("DownloadImage")),(Object)(__ref.getField(false,"_tobesent" /*RemoteObject*/ )),(Object)(charactercontroller.__c.getField(true,"False")));
 BA.debugLineNum = 23;BA.debugLine="http.Download(address)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_http" /*RemoteObject*/ ).runVoidMethod ("_v7",(Object)(_address));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcharacter(RemoteObject __ref,RemoteObject _name,RemoteObject _limit) throws Exception{
try {
		Debug.PushSubsStack("GetCharacter (charactercontroller) ","charactercontroller",1,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("getcharacter")) { return __ref.runUserSub(false, "charactercontroller","getcharacter", __ref, _name, _limit);}
RemoteObject _address = RemoteObject.createImmutable("");
Debug.locals.put("name", _name);
Debug.locals.put("limit", _limit);
 BA.debugLineNum = 12;BA.debugLine="Public Sub GetCharacter(name As String, limit As I";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="Dim address As String = url.GetPrefix & \"/v1/publ";
Debug.ShouldStop(4096);
_address = RemoteObject.concat(charactercontroller._url.runMethod(true,"_getprefix" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA")),RemoteObject.createImmutable("/v1/public/characters?"),charactercontroller._url.runMethod(true,"_getauth" /*RemoteObject*/ ,__ref.runMethod(false,"getActivityBA")),RemoteObject.createImmutable("&limit="),_limit);Debug.locals.put("address", _address);Debug.locals.put("address", _address);
 BA.debugLineNum = 14;BA.debugLine="If name <> \"\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("!",_name,BA.ObjectToString(""))) { 
 BA.debugLineNum = 15;BA.debugLine="address = address & \"&nameStartsWith=\" & name";
Debug.ShouldStop(16384);
_address = RemoteObject.concat(_address,RemoteObject.createImmutable("&nameStartsWith="),_name);Debug.locals.put("address", _address);
 };
 BA.debugLineNum = 17;BA.debugLine="http.Initialize(\"GetCharacter\", toBeSent, False)";
Debug.ShouldStop(65536);
__ref.getField(false,"_http" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("GetCharacter")),(Object)(__ref.getField(false,"_tobesent" /*RemoteObject*/ )),(Object)(charactercontroller.__c.getField(true,"False")));
 BA.debugLineNum = 18;BA.debugLine="http.Download(address)";
Debug.ShouldStop(131072);
__ref.getField(false,"_http" /*RemoteObject*/ ).runVoidMethod ("_v7",(Object)(_address));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _received) throws Exception{
try {
		Debug.PushSubsStack("Initialize (charactercontroller) ","charactercontroller",1,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "charactercontroller","initialize", __ref, _ba, _received);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("received", _received);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize(received As Object)";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="toBeSent = received";
Debug.ShouldStop(128);
__ref.setField ("_tobesent" /*RemoteObject*/ ,_received);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}