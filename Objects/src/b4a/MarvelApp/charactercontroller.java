package b4a.MarvelApp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class charactercontroller extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.MarvelApp.charactercontroller");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.MarvelApp.charactercontroller.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.samples.httputils2.httpjob _http = null;
public Object _tobesent = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.MarvelApp.main _main = null;
public b4a.MarvelApp.url _url = null;
public String  _initialize(b4a.MarvelApp.charactercontroller __ref,anywheresoftware.b4a.BA _ba,Object _received) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="charactercontroller";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_received}));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Initialize(received As Object)";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="toBeSent = received";
__ref._tobesent /*Object*/  = _received;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
public String  _getcharacter(b4a.MarvelApp.charactercontroller __ref,String _name,int _limit) throws Exception{
__ref = this;
RDebugUtils.currentModule="charactercontroller";
if (Debug.shouldDelegate(ba, "getcharacter", false))
	 {return ((String) Debug.delegate(ba, "getcharacter", new Object[] {_name,_limit}));}
String _address = "";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub GetCharacter(name As String, limit As I";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Dim address As String = url.GetPrefix & \"/v1/publ";
_address = _url._getprefix /*String*/ (getActivityBA())+"/v1/public/characters?"+_url._getauth /*String*/ (getActivityBA())+"&limit="+BA.NumberToString(_limit);
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="If name <> \"\" Then";
if ((_name).equals("") == false) { 
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="address = address & \"&nameStartsWith=\" & name";
_address = _address+"&nameStartsWith="+_name;
 };
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="http.Initialize(\"GetCharacter\", toBeSent, False)";
__ref._http /*anywheresoftware.b4a.samples.httputils2.httpjob*/ ._initialize(ba,"GetCharacter",__ref._tobesent /*Object*/ ,__c.False);
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="http.Download(address)";
__ref._http /*anywheresoftware.b4a.samples.httputils2.httpjob*/ ._v7(_address);
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.MarvelApp.charactercontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="charactercontroller";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Private http As HttpJob";
_http = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Private toBeSent As Object";
_tobesent = new Object();
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="End Sub";
return "";
}
}