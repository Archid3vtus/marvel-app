
package b4a.MarvelApp;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class charactercontroller {
    public static RemoteObject myClass;
	public charactercontroller() {
	}
    public static PCBA staticBA = new PCBA(null, charactercontroller.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _http = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
public static RemoteObject _tobesent = RemoteObject.declareNull("Object");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.MarvelApp.main _main = null;
public static b4a.MarvelApp.url _url = null;
public static b4a.MarvelApp.characterdetails _characterdetails = null;
public static b4a.MarvelApp.charrelatedinfoview _charrelatedinfoview = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"http",_ref.getField(false, "_http"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"toBeSent",_ref.getField(false, "_tobesent")};
}
}