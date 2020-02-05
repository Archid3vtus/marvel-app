package b4a.MarvelApp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,35);
if (RapidSub.canDelegate("activity_create")) { return b4a.MarvelApp.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 38;BA.debugLine="Activity.LoadLayout(\"Search\")";
Debug.ShouldStop(32);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Search")),main.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="charList.SingleLineLayout.Label.TextColor = Color";
Debug.ShouldStop(64);
main.mostCurrent._charlist.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 40;BA.debugLine="character.Initialize(Me)";
Debug.ShouldStop(128);
main.mostCurrent._character.runClassMethod (b4a.MarvelApp.charactercontroller.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(main.getObject()));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
if (RapidSub.canDelegate("activity_pause")) { return b4a.MarvelApp.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,44);
if (RapidSub.canDelegate("activity_resume")) { return b4a.MarvelApp.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Private character As CharacterController";
main.mostCurrent._character = RemoteObject.createNew ("b4a.MarvelApp.charactercontroller");
 //BA.debugLineNum = 27;BA.debugLine="Private json As JSONParser";
main.mostCurrent._json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");
 //BA.debugLineNum = 30;BA.debugLine="Private charList As ListView";
main.mostCurrent._charlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private searchBar As EditText";
main.mostCurrent._searchbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private send As Button";
main.mostCurrent._send = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,52);
if (RapidSub.canDelegate("jobdone")) { return b4a.MarvelApp.main.remoteMe.runUserSub(false, "main","jobdone", _job);}
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _characterlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 52;BA.debugLine="Sub JobDone(Job As HttpJob) As HttpJob";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_vvv7"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 54;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(2097152);
switch (BA.switchObjectToInt(_job.getField(true,"_vvv6"),BA.ObjectToString("GetCharacter"))) {
case 0: {
 BA.debugLineNum = 56;BA.debugLine="json.Initialize(Job.GetString)";
Debug.ShouldStop(8388608);
main.mostCurrent._json.runVoidMethod ("Initialize",(Object)(_job.runMethod(true,"_vv5")));
 BA.debugLineNum = 57;BA.debugLine="Dim data As Map = json.NextObject.Get(\"data\")";
Debug.ShouldStop(16777216);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_data.setObject(main.mostCurrent._json.runMethod(false,"NextObject").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("data", _data);
 BA.debugLineNum = 58;BA.debugLine="Dim characterList As List = data.Get(\"results\"";
Debug.ShouldStop(33554432);
_characterlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_characterlist.setObject(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("results")))));Debug.locals.put("characterList", _characterlist);
 BA.debugLineNum = 59;BA.debugLine="For Each entry As Map In characterList";
Debug.ShouldStop(67108864);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group7 = _characterlist;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry.setObject(group7.runMethod(false,"Get",index7));
Debug.locals.put("entry", _entry);
 BA.debugLineNum = 60;BA.debugLine="charList.AddSingleLine(entry.Get(\"name\"))";
Debug.ShouldStop(134217728);
main.mostCurrent._charlist.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))))));
 }
}Debug.locals.put("entry", _entry);
;
 BA.debugLineNum = 63;BA.debugLine="Exit";
Debug.ShouldStop(1073741824);
if (true) break;
 break; }
}
;
 };
 BA.debugLineNum = 66;BA.debugLine="Job.Release";
Debug.ShouldStop(2);
_job.runVoidMethod ("_vvv5");
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
url_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.MarvelApp.main");
charactercontroller.myClass = BA.getDeviceClass ("b4a.MarvelApp.charactercontroller");
url.myClass = BA.getDeviceClass ("b4a.MarvelApp.url");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _send_click() throws Exception{
try {
		Debug.PushSubsStack("send_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,70);
if (RapidSub.canDelegate("send_click")) { return b4a.MarvelApp.main.remoteMe.runUserSub(false, "main","send_click");}
 BA.debugLineNum = 70;BA.debugLine="Sub send_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="charList.Clear";
Debug.ShouldStop(64);
main.mostCurrent._charlist.runVoidMethod ("Clear");
 BA.debugLineNum = 72;BA.debugLine="character.GetCharacter(searchBar.Text, \"99\")";
Debug.ShouldStop(128);
main.mostCurrent._character.runClassMethod (b4a.MarvelApp.charactercontroller.class, "_getcharacter" /*RemoteObject*/ ,(Object)(main.mostCurrent._searchbar.runMethod(true,"getText")),(Object)(BA.numberCast(int.class, RemoteObject.createImmutable("99"))));
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}