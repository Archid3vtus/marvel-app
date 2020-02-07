package b4a.MarvelApp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class charactercontroller extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.MarvelApp.charactercontroller");
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.samples.httputils2.httpjob _http = null;
public Object _tobesent = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.MarvelApp.main _main = null;
public b4a.MarvelApp.url _url = null;
public b4a.MarvelApp.characterdetails _characterdetails = null;
public b4a.MarvelApp.charrelatedinfoview _charrelatedinfoview = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private http As HttpJob";
_http = new anywheresoftware.b4a.samples.httputils2.httpjob();
 //BA.debugLineNum = 3;BA.debugLine="Private toBeSent As Object";
_tobesent = new Object();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public String  _downloadimage(String _address) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub DownloadImage(address As String)";
 //BA.debugLineNum = 22;BA.debugLine="http.Initialize(\"DownloadImage\", toBeSent, False)";
_http._initialize(ba,"DownloadImage",_tobesent,__c.False);
 //BA.debugLineNum = 23;BA.debugLine="http.Download(address)";
_http._v7(_address);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _getcharacter(String _name,int _limit) throws Exception{
String _address = "";
 //BA.debugLineNum = 12;BA.debugLine="Public Sub GetCharacter(name As String, limit As I";
 //BA.debugLineNum = 13;BA.debugLine="Dim address As String = url.GetPrefix & \"/v1/publ";
_address = _url._getprefix /*String*/ (getActivityBA())+"/v1/public/characters?"+_url._getauth /*String*/ (getActivityBA())+"&limit="+BA.NumberToString(_limit);
 //BA.debugLineNum = 14;BA.debugLine="If name <> \"\" Then";
if ((_name).equals("") == false) { 
 //BA.debugLineNum = 15;BA.debugLine="address = address & \"&nameStartsWith=\" & name";
_address = _address+"&nameStartsWith="+_name;
 };
 //BA.debugLineNum = 17;BA.debugLine="http.Initialize(\"GetCharacter\", toBeSent, False)";
_http._initialize(ba,"GetCharacter",_tobesent,__c.False);
 //BA.debugLineNum = 18;BA.debugLine="http.Download(address)";
_http._v7(_address);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _received) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize(received As Object)";
 //BA.debugLineNum = 8;BA.debugLine="toBeSent = received";
_tobesent = _received;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
