package b4a.MarvelApp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class charrelatedinfoview_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (charrelatedinfoview) ","charrelatedinfoview",4,charrelatedinfoview.mostCurrent.activityBA,charrelatedinfoview.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) { return b4a.MarvelApp.charrelatedinfoview.remoteMe.runUserSub(false, "charrelatedinfoview","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 24;BA.debugLine="Activity.LoadLayout(\"CharRelatedInfoView\")";
Debug.ShouldStop(8388608);
charrelatedinfoview.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CharRelatedInfoView")),charrelatedinfoview.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="chosen.Text = Main.selected.Get(\"name\") & \" \" & C";
Debug.ShouldStop(16777216);
charrelatedinfoview.mostCurrent._chosen.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(charrelatedinfoview.mostCurrent._main._selected /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),RemoteObject.createImmutable(" "),charrelatedinfoview.mostCurrent._characterdetails._selected /*RemoteObject*/ )));
 BA.debugLineNum = 26;BA.debugLine="chosen.Tag = CharacterDetails.selected.ToLowerCas";
Debug.ShouldStop(33554432);
charrelatedinfoview.mostCurrent._chosen.runMethod(false,"setTag",(charrelatedinfoview.mostCurrent._characterdetails._selected /*RemoteObject*/ .runMethod(true,"toLowerCase")));
 BA.debugLineNum = 28;BA.debugLine="contentLabel.Initialize(\"\")";
Debug.ShouldStop(134217728);
charrelatedinfoview.mostCurrent._contentlabel.runVoidMethod ("Initialize",charrelatedinfoview.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 29;BA.debugLine="contentList.Panel.AddView(contentLabel, 0, 0, 100";
Debug.ShouldStop(268435456);
charrelatedinfoview.mostCurrent._contentlist.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((charrelatedinfoview.mostCurrent._contentlabel.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(charrelatedinfoview.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),charrelatedinfoview.mostCurrent.activityBA)),(Object)(charrelatedinfoview.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),charrelatedinfoview.mostCurrent.activityBA)));
 BA.debugLineNum = 30;BA.debugLine="contentLabel.Text = GenerateContent";
Debug.ShouldStop(536870912);
charrelatedinfoview.mostCurrent._contentlabel.runMethod(true,"setText",BA.ObjectToCharSequence(_generatecontent()));
 BA.debugLineNum = 31;BA.debugLine="contentLabel.TextColor = Colors.Gray";
Debug.ShouldStop(1073741824);
charrelatedinfoview.mostCurrent._contentlabel.runMethod(true,"setTextColor",charrelatedinfoview.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 32;BA.debugLine="contentLabel.TextSize = 24";
Debug.ShouldStop(-2147483648);
charrelatedinfoview.mostCurrent._contentlabel.runMethod(true,"setTextSize",BA.numberCast(float.class, 24));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Activity_Pause (charrelatedinfoview) ","charrelatedinfoview",4,charrelatedinfoview.mostCurrent.activityBA,charrelatedinfoview.mostCurrent,40);
if (RapidSub.canDelegate("activity_pause")) { return b4a.MarvelApp.charrelatedinfoview.remoteMe.runUserSub(false, "charrelatedinfoview","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(128);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (charrelatedinfoview) ","charrelatedinfoview",4,charrelatedinfoview.mostCurrent.activityBA,charrelatedinfoview.mostCurrent,36);
if (RapidSub.canDelegate("activity_resume")) { return b4a.MarvelApp.charrelatedinfoview.remoteMe.runUserSub(false, "charrelatedinfoview","activity_resume");}
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generatecontent() throws Exception{
try {
		Debug.PushSubsStack("GenerateContent (charrelatedinfoview) ","charrelatedinfoview",4,charrelatedinfoview.mostCurrent.activityBA,charrelatedinfoview.mostCurrent,44);
if (RapidSub.canDelegate("generatecontent")) { return b4a.MarvelApp.charrelatedinfoview.remoteMe.runUserSub(false, "charrelatedinfoview","generatecontent");}
RemoteObject _content = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _contentitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _response = RemoteObject.createImmutable("");
RemoteObject _item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 44;BA.debugLine="Private Sub GenerateContent As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Dim content As Map = Main.selected.Get(chosen.Tag";
Debug.ShouldStop(4096);
_content = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_content.setObject(charrelatedinfoview.mostCurrent._main._selected /*RemoteObject*/ .runMethod(false,"Get",(Object)(charrelatedinfoview.mostCurrent._chosen.runMethod(false,"getTag"))));Debug.locals.put("content", _content);
 BA.debugLineNum = 46;BA.debugLine="Dim contentItems As List = content.Get(\"items\")";
Debug.ShouldStop(8192);
_contentitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_contentitems.setObject(_content.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("contentItems", _contentitems);
 BA.debugLineNum = 48;BA.debugLine="Dim response As String = \"\"";
Debug.ShouldStop(32768);
_response = BA.ObjectToString("");Debug.locals.put("response", _response);Debug.locals.put("response", _response);
 BA.debugLineNum = 50;BA.debugLine="For Each item As Map In contentItems";
Debug.ShouldStop(131072);
_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group4 = _contentitems;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_item.setObject(group4.runMethod(false,"Get",index4));
Debug.locals.put("item", _item);
 BA.debugLineNum = 51;BA.debugLine="response = response & \"• \" & item.Get(\"name\") &";
Debug.ShouldStop(262144);
_response = RemoteObject.concat(_response,RemoteObject.createImmutable("• "),_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),charrelatedinfoview.mostCurrent.__c.getField(true,"CRLF"));Debug.locals.put("response", _response);
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 54;BA.debugLine="Return response";
Debug.ShouldStop(2097152);
if (true) return _response;
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private chosen As Label";
charrelatedinfoview.mostCurrent._chosen = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private contentList As ScrollView";
charrelatedinfoview.mostCurrent._contentlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private contentLabel As Label 'not added from the";
charrelatedinfoview.mostCurrent._contentlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}