package b4a.MarvelApp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,41);
if (RapidSub.canDelegate("activity_create")) { return b4a.MarvelApp.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 44;BA.debugLine="Activity.LoadLayout(\"Search\")";
Debug.ShouldStop(2048);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Search")),main.mostCurrent.activityBA);
 BA.debugLineNum = 45;BA.debugLine="IME.Initialize(\"IME\")";
Debug.ShouldStop(4096);
main.mostCurrent._ime.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("IME")));
 BA.debugLineNum = 46;BA.debugLine="IME.AddHeightChangedEvent";
Debug.ShouldStop(8192);
main.mostCurrent._ime.runVoidMethod ("AddHeightChangedEvent",main.mostCurrent.activityBA);
 BA.debugLineNum = 47;BA.debugLine="charList.SingleLineLayout.Label.TextColor = Color";
Debug.ShouldStop(16384);
main.mostCurrent._charlist.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 48;BA.debugLine="character.Initialize(Me)";
Debug.ShouldStop(32768);
main.mostCurrent._character.runClassMethod (b4a.MarvelApp.charactercontroller.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(main.getObject()));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,55);
if (RapidSub.canDelegate("activity_pause")) { return b4a.MarvelApp.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,51);
if (RapidSub.canDelegate("activity_resume")) { return b4a.MarvelApp.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 51;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _charlist_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("charList_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,87);
if (RapidSub.canDelegate("charlist_itemclick")) { return b4a.MarvelApp.main.remoteMe.runUserSub(false, "main","charlist_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 87;BA.debugLine="Sub charList_ItemClick (Position As Int, Value As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="selected = characterList.Get(Position)";
Debug.ShouldStop(8388608);
main._selected.setObject(main.mostCurrent._characterlist.runMethod(false,"Get",(Object)(_position)));
 BA.debugLineNum = 89;BA.debugLine="StartActivity(CharacterDetails)";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._characterdetails.getObject())));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 27;BA.debugLine="Private character As CharacterController";
main.mostCurrent._character = RemoteObject.createNew ("b4a.MarvelApp.charactercontroller");
 //BA.debugLineNum = 28;BA.debugLine="Private jsonParser As JSONParser";
main.mostCurrent._jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");
 //BA.debugLineNum = 29;BA.debugLine="Private IME As IME";
main.mostCurrent._ime = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 32;BA.debugLine="Private charList As ListView";
main.mostCurrent._charlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private searchBar As EditText";
main.mostCurrent._searchbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private send As Button";
main.mostCurrent._send = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private loading As ProgressBar";
main.mostCurrent._loading = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private characterList As List";
main.mostCurrent._characterlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _ime_heightchanged(RemoteObject _newheight,RemoteObject _oldheight) throws Exception{
try {
		Debug.PushSubsStack("IME_HeightChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,92);
if (RapidSub.canDelegate("ime_heightchanged")) { return b4a.MarvelApp.main.remoteMe.runUserSub(false, "main","ime_heightchanged", _newheight, _oldheight);}
Debug.locals.put("NewHeight", _newheight);
Debug.locals.put("OldHeight", _oldheight);
 BA.debugLineNum = 92;BA.debugLine="Sub IME_HeightChanged(NewHeight As Int, OldHeight";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="searchBar.Top = NewHeight - searchBar.Height";
Debug.ShouldStop(268435456);
main.mostCurrent._searchbar.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_newheight,main.mostCurrent._searchbar.runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 94;BA.debugLine="send.Top = NewHeight - send.Height";
Debug.ShouldStop(536870912);
main.mostCurrent._send.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_newheight,main.mostCurrent._send.runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 95;BA.debugLine="charList.Height = searchBar.Top - charList.Top";
Debug.ShouldStop(1073741824);
main.mostCurrent._charlist.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {main.mostCurrent._searchbar.runMethod(true,"getTop"),main.mostCurrent._charlist.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,59);
if (RapidSub.canDelegate("jobdone")) { return b4a.MarvelApp.main.remoteMe.runUserSub(false, "main","jobdone", _job);}
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _entry = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 59;BA.debugLine="Sub JobDone(Job As HttpJob) As HttpJob";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_vvv7"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 61;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(268435456);
switch (BA.switchObjectToInt(_job.getField(true,"_vvv6"),BA.ObjectToString("GetCharacter"))) {
case 0: {
 BA.debugLineNum = 63;BA.debugLine="jsonParser.Initialize(Job.GetString)";
Debug.ShouldStop(1073741824);
main.mostCurrent._jsonparser.runVoidMethod ("Initialize",(Object)(_job.runMethod(true,"_vv5")));
 BA.debugLineNum = 64;BA.debugLine="Dim data As Map = jsonParser.NextObject.Get(\"d";
Debug.ShouldStop(-2147483648);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_data.setObject(main.mostCurrent._jsonparser.runMethod(false,"NextObject").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("data", _data);
 BA.debugLineNum = 65;BA.debugLine="characterList = data.Get(\"results\")";
Debug.ShouldStop(1);
main.mostCurrent._characterlist.setObject(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("results")))));
 BA.debugLineNum = 66;BA.debugLine="For Each entry As Map In characterList";
Debug.ShouldStop(2);
_entry = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group7 = main.mostCurrent._characterlist;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_entry.setObject(group7.runMethod(false,"Get",index7));
Debug.locals.put("entry", _entry);
 BA.debugLineNum = 67;BA.debugLine="charList.AddSingleLine(entry.Get(\"name\"))";
Debug.ShouldStop(4);
main.mostCurrent._charlist.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(_entry.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))))));
 }
}Debug.locals.put("entry", _entry);
;
 BA.debugLineNum = 70;BA.debugLine="loading.Visible = False";
Debug.ShouldStop(32);
main.mostCurrent._loading.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 71;BA.debugLine="loading.Enabled = False";
Debug.ShouldStop(64);
main.mostCurrent._loading.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 72;BA.debugLine="Exit";
Debug.ShouldStop(128);
if (true) break;
 break; }
}
;
 };
 BA.debugLineNum = 75;BA.debugLine="Job.Release";
Debug.ShouldStop(1024);
_job.runVoidMethod ("_vvv5");
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
characterdetails_subs_0._process_globals();
charrelatedinfoview_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.MarvelApp.main");
charactercontroller.myClass = BA.getDeviceClass ("b4a.MarvelApp.charactercontroller");
url.myClass = BA.getDeviceClass ("b4a.MarvelApp.url");
characterdetails.myClass = BA.getDeviceClass ("b4a.MarvelApp.characterdetails");
charrelatedinfoview.myClass = BA.getDeviceClass ("b4a.MarvelApp.charrelatedinfoview");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="Public selected As Map";
main._selected = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _send_click() throws Exception{
try {
		Debug.PushSubsStack("send_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,79);
if (RapidSub.canDelegate("send_click")) { return b4a.MarvelApp.main.remoteMe.runUserSub(false, "main","send_click");}
 BA.debugLineNum = 79;BA.debugLine="Sub send_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="charList.Clear";
Debug.ShouldStop(32768);
main.mostCurrent._charlist.runVoidMethod ("Clear");
 BA.debugLineNum = 81;BA.debugLine="loading.Enabled = True";
Debug.ShouldStop(65536);
main.mostCurrent._loading.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 82;BA.debugLine="loading.Visible = True";
Debug.ShouldStop(131072);
main.mostCurrent._loading.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 84;BA.debugLine="character.GetCharacter(searchBar.Text, \"99\")";
Debug.ShouldStop(524288);
main.mostCurrent._character.runClassMethod (b4a.MarvelApp.charactercontroller.class, "_getcharacter" /*RemoteObject*/ ,(Object)(main.mostCurrent._searchbar.runMethod(true,"getText")),(Object)(BA.numberCast(int.class, RemoteObject.createImmutable("99"))));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}