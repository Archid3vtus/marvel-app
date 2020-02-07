package b4a.MarvelApp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class characterdetails_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (characterdetails) ","characterdetails",3,characterdetails.mostCurrent.activityBA,characterdetails.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) { return b4a.MarvelApp.characterdetails.remoteMe.runUserSub(false, "characterdetails","activity_create", _firsttime);}
RemoteObject _thumbnail = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _imageurl = RemoteObject.createImmutable("");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"CharacterDetails\")";
Debug.ShouldStop(134217728);
characterdetails.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CharacterDetails")),characterdetails.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="character.Initialize(Me)";
Debug.ShouldStop(268435456);
characterdetails.mostCurrent._character.runClassMethod (b4a.MarvelApp.charactercontroller.class, "_initialize" /*RemoteObject*/ ,characterdetails.processBA,(Object)(characterdetails.getObject()));
 BA.debugLineNum = 31;BA.debugLine="Dim thumbnail As Map = Main.selected.Get(\"thumbna";
Debug.ShouldStop(1073741824);
_thumbnail = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_thumbnail.setObject(characterdetails.mostCurrent._main._selected /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("thumbnail")))));Debug.locals.put("thumbnail", _thumbnail);
 BA.debugLineNum = 32;BA.debugLine="Dim imageUrl As String = thumbnail.Get(\"path\") &";
Debug.ShouldStop(-2147483648);
_imageurl = RemoteObject.concat(_thumbnail.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("path")))),RemoteObject.createImmutable("/portrait_xlarge."),_thumbnail.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension")))));Debug.locals.put("imageUrl", _imageurl);Debug.locals.put("imageUrl", _imageurl);
 BA.debugLineNum = 35;BA.debugLine="charDetail.Text = Main.selected.Get(\"description\"";
Debug.ShouldStop(4);
characterdetails.mostCurrent._chardetail.runMethod(true,"setText",BA.ObjectToCharSequence(characterdetails.mostCurrent._main._selected /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("description"))))));
 BA.debugLineNum = 37;BA.debugLine="charName.Text = Main.selected.Get(\"name\") & \" det";
Debug.ShouldStop(16);
characterdetails.mostCurrent._charname.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(characterdetails.mostCurrent._main._selected /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),RemoteObject.createImmutable(" details"))));
 BA.debugLineNum = 39;BA.debugLine="charRelated.SingleLineLayout.Label.TextColor = Co";
Debug.ShouldStop(64);
characterdetails.mostCurrent._charrelated.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",characterdetails.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 40;BA.debugLine="charRelated.AddSingleLine(\"Comics\")";
Debug.ShouldStop(128);
characterdetails.mostCurrent._charrelated.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Comics"))));
 BA.debugLineNum = 41;BA.debugLine="charRelated.AddSingleLine(\"Series\")";
Debug.ShouldStop(256);
characterdetails.mostCurrent._charrelated.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Series"))));
 BA.debugLineNum = 42;BA.debugLine="charRelated.AddSingleLine(\"Stories\")";
Debug.ShouldStop(512);
characterdetails.mostCurrent._charrelated.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Stories"))));
 BA.debugLineNum = 44;BA.debugLine="character.DownloadImage(imageUrl)";
Debug.ShouldStop(2048);
characterdetails.mostCurrent._character.runClassMethod (b4a.MarvelApp.charactercontroller.class, "_downloadimage" /*RemoteObject*/ ,(Object)(_imageurl));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (characterdetails) ","characterdetails",3,characterdetails.mostCurrent.activityBA,characterdetails.mostCurrent,52);
if (RapidSub.canDelegate("activity_pause")) { return b4a.MarvelApp.characterdetails.remoteMe.runUserSub(false, "characterdetails","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_Resume (characterdetails) ","characterdetails",3,characterdetails.mostCurrent.activityBA,characterdetails.mostCurrent,48);
if (RapidSub.canDelegate("activity_resume")) { return b4a.MarvelApp.characterdetails.remoteMe.runUserSub(false, "characterdetails","activity_resume");}
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _charrelated_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("charRelated_ItemClick (characterdetails) ","characterdetails",3,characterdetails.mostCurrent.activityBA,characterdetails.mostCurrent,57);
if (RapidSub.canDelegate("charrelated_itemclick")) { return b4a.MarvelApp.characterdetails.remoteMe.runUserSub(false, "characterdetails","charrelated_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 57;BA.debugLine="Sub charRelated_ItemClick (Position As Int, Value";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="selected = Value";
Debug.ShouldStop(33554432);
characterdetails._selected = BA.ObjectToString(_value);
 BA.debugLineNum = 59;BA.debugLine="StartActivity(CharRelatedInfoView)";
Debug.ShouldStop(67108864);
characterdetails.mostCurrent.__c.runVoidMethod ("StartActivity",characterdetails.processBA,(Object)((characterdetails.mostCurrent._charrelatedinfoview.getObject())));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private charDetail As Label";
characterdetails.mostCurrent._chardetail = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private charImage As ImageView";
characterdetails.mostCurrent._charimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private charName As Label";
characterdetails.mostCurrent._charname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private charRelated As ListView";
characterdetails.mostCurrent._charrelated = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private character As CharacterController";
characterdetails.mostCurrent._character = RemoteObject.createNew ("b4a.MarvelApp.charactercontroller");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (characterdetails) ","characterdetails",3,characterdetails.mostCurrent.activityBA,characterdetails.mostCurrent,62);
if (RapidSub.canDelegate("jobdone")) { return b4a.MarvelApp.characterdetails.remoteMe.runUserSub(false, "characterdetails","jobdone", _job);}
Debug.locals.put("Job", _job);
 BA.debugLineNum = 62;BA.debugLine="Sub JobDone(Job As HttpJob) As HttpJob";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_vvv7"),characterdetails.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 64;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(-2147483648);
switch (BA.switchObjectToInt(_job.getField(true,"_vvv6"),BA.ObjectToString("DownloadImage"))) {
case 0: {
 BA.debugLineNum = 66;BA.debugLine="charImage.Bitmap = Job.GetBitmap";
Debug.ShouldStop(2);
characterdetails.mostCurrent._charimage.runMethod(false,"setBitmap",(_job.runMethod(false,"_vv1").getObject()));
 BA.debugLineNum = 67;BA.debugLine="Exit";
Debug.ShouldStop(4);
if (true) break;
 break; }
}
;
 };
 BA.debugLineNum = 70;BA.debugLine="Job.Release";
Debug.ShouldStop(32);
_job.runVoidMethod ("_vvv5");
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Public selected As String";
characterdetails._selected = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}