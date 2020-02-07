
package b4a.MarvelApp;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class characterdetails implements IRemote{
	public static characterdetails mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public characterdetails() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("characterdetails"), "b4a.MarvelApp.characterdetails");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, characterdetails.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _selected = RemoteObject.createImmutable("");
public static RemoteObject _chardetail = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _charimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _charname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _charrelated = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _character = RemoteObject.declareNull("b4a.MarvelApp.charactercontroller");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.MarvelApp.main _main = null;
public static b4a.MarvelApp.url _url = null;
public static b4a.MarvelApp.charrelatedinfoview _charrelatedinfoview = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",characterdetails.mostCurrent._activity,"character",characterdetails.mostCurrent._character,"charDetail",characterdetails.mostCurrent._chardetail,"charImage",characterdetails.mostCurrent._charimage,"charName",characterdetails.mostCurrent._charname,"charRelated",characterdetails.mostCurrent._charrelated,"CharRelatedInfoView",Debug.moduleToString(b4a.MarvelApp.charrelatedinfoview.class),"HttpUtils2Service",characterdetails.mostCurrent._httputils2service,"Main",Debug.moduleToString(b4a.MarvelApp.main.class),"selected",characterdetails._selected,"url",Debug.moduleToString(b4a.MarvelApp.url.class)};
}
}