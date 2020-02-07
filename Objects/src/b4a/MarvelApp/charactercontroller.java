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
public b4a.MarvelApp.characterdetails _characterdetails = null;
public b4a.MarvelApp.charrelatedinfoview _charrelatedinfoview = null;
public String  _initialize(b4a.MarvelApp.charactercontroller __ref,anywheresoftware.b4a.BA _ba,Object _received) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="charactercontroller";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_received}));}
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub Initialize(received As Object)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="toBeSent = received";
__ref._tobesent /*Object*/  = _received;
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="End Sub";
return "";
}
public String  _getcharacter(b4a.MarvelApp.charactercontroller __ref,String _name,int _limit) throws Exception{
__ref = this;
RDebugUtils.currentModule="charactercontroller";
if (Debug.shouldDelegate(ba, "getcharacter", false))
	 {return ((String) Debug.delegate(ba, "getcharacter", new Object[] {_name,_limit}));}
String _address = "";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub GetCharacter(name As String, limit As I";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim address As String = url.GetPrefix & \"/v1/publ";
_address = _url._getprefix /*String*/ (getActivityBA())+"/v1/public/characters?"+_url._getauth /*String*/ (getActivityBA())+"&limit="+BA.NumberToString(_limit);
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="If name <> \"\" Then";
if ((_name).equals("") == false) { 
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="address = address & \"&nameStartsWith=\" & name";
_address = _address+"&nameStartsWith="+_name;
 };
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="http.Initialize(\"GetCharacter\", toBeSent, False)";
__ref._http /*anywheresoftware.b4a.samples.httputils2.httpjob*/ ._initialize(ba,"GetCharacter",__ref._tobesent /*Object*/ ,__c.False);
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="http.Download(address)";
__ref._http /*anywheresoftware.b4a.samples.httputils2.httpjob*/ ._v7(_address);
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.MarvelApp.charactercontroller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="charactercontroller";
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Private http As HttpJob";
_http = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Private toBeSent As Object";
_tobesent = new Object();
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="End Sub";
return "";
}
public String  _downloadimage(b4a.MarvelApp.charactercontroller __ref,String _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="charactercontroller";
if (Debug.shouldDelegate(ba, "downloadimage", false))
	 {return ((String) Debug.delegate(ba, "downloadimage", new Object[] {_address}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub DownloadImage(address As String)";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="http.Initialize(\"DownloadImage\", toBeSent, False)";
__ref._http /*anywheresoftware.b4a.samples.httputils2.httpjob*/ ._initialize(ba,"DownloadImage",__ref._tobesent /*Object*/ ,__c.False);
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="http.Download(address)";
__ref._http /*anywheresoftware.b4a.samples.httputils2.httpjob*/ ._v7(_address);
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="End Sub";
return "";
}
}