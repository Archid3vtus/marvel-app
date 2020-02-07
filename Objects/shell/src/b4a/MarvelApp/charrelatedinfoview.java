
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

public class charrelatedinfoview implements IRemote{
	public static charrelatedinfoview mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public charrelatedinfoview() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("charrelatedinfoview"), "b4a.MarvelApp.charrelatedinfoview");
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
		pcBA = new PCBA(this, charrelatedinfoview.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _chosen = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _contentlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _contentlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.MarvelApp.main _main = null;
public static b4a.MarvelApp.url _url = null;
public static b4a.MarvelApp.characterdetails _characterdetails = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",charrelatedinfoview.mostCurrent._activity,"CharacterDetails",Debug.moduleToString(b4a.MarvelApp.characterdetails.class),"chosen",charrelatedinfoview.mostCurrent._chosen,"contentLabel",charrelatedinfoview.mostCurrent._contentlabel,"contentList",charrelatedinfoview.mostCurrent._contentlist,"HttpUtils2Service",charrelatedinfoview.mostCurrent._httputils2service,"Main",Debug.moduleToString(b4a.MarvelApp.main.class),"url",Debug.moduleToString(b4a.MarvelApp.url.class)};
}
}