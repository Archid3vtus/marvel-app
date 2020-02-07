package b4a.MarvelApp;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class characterdetails extends Activity implements B4AActivity{
	public static characterdetails mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.MarvelApp", "b4a.MarvelApp.characterdetails");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (characterdetails).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, true))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.MarvelApp", "b4a.MarvelApp.characterdetails");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.MarvelApp.characterdetails", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (characterdetails) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (characterdetails) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return characterdetails.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (characterdetails) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            characterdetails mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (characterdetails) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public static String _selected = "";
public anywheresoftware.b4a.objects.ScrollViewWrapper _chardetail = null;
public anywheresoftware.b4a.objects.LabelWrapper _chardetailtext = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _charimage = null;
public anywheresoftware.b4a.objects.LabelWrapper _charname = null;
public anywheresoftware.b4a.objects.ListViewWrapper _charrelated = null;
public anywheresoftware.b4a.objects.LabelWrapper _linkslabel = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _charlinks = null;
public b4a.MarvelApp.charactercontroller _character = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.MarvelApp.main _main = null;
public b4a.MarvelApp.url _url = null;
public b4a.MarvelApp.charrelatedinfoview _charrelatedinfoview = null;

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
anywheresoftware.b4a.objects.collections.Map _thumbnail = null;
String _imageurl = "";
anywheresoftware.b4a.objects.collections.List _links = null;
 //BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"CharacterDetails\")";
mostCurrent._activity.LoadLayout("CharacterDetails",mostCurrent.activityBA);
 //BA.debugLineNum = 33;BA.debugLine="Dim thumbnail As Map = Main.selected.Get(\"thumbna";
_thumbnail = new anywheresoftware.b4a.objects.collections.Map();
_thumbnail.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(mostCurrent._main._selected /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("thumbnail"))));
 //BA.debugLineNum = 34;BA.debugLine="Dim imageUrl As String = thumbnail.Get(\"path\") &";
_imageurl = BA.ObjectToString(_thumbnail.Get((Object)("path")))+"/portrait_xlarge."+BA.ObjectToString(_thumbnail.Get((Object)("extension")));
 //BA.debugLineNum = 35;BA.debugLine="character.Initialize(Me)";
mostCurrent._character._initialize /*String*/ (processBA,characterdetails.getObject());
 //BA.debugLineNum = 36;BA.debugLine="character.DownloadImage(imageUrl)";
mostCurrent._character._downloadimage /*String*/ (_imageurl);
 //BA.debugLineNum = 39;BA.debugLine="charDetailText.Initialize(\"\")";
mostCurrent._chardetailtext.Initialize(mostCurrent.activityBA,"");
 //BA.debugLineNum = 40;BA.debugLine="charDetail.Panel.AddView(charDetailText, 0, 0, ch";
mostCurrent._chardetail.getPanel().AddView((android.view.View)(mostCurrent._chardetailtext.getObject()),(int) (0),(int) (0),mostCurrent._chardetail.getWidth(),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 41;BA.debugLine="charDetailText.Text = Main.selected.Get(\"descript";
mostCurrent._chardetailtext.setText(BA.ObjectToCharSequence(mostCurrent._main._selected /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("description"))));
 //BA.debugLineNum = 42;BA.debugLine="charDetailText.TextSize = 16";
mostCurrent._chardetailtext.setTextSize((float) (16));
 //BA.debugLineNum = 43;BA.debugLine="charDetailText.TextColor = Colors.Gray";
mostCurrent._chardetailtext.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
 //BA.debugLineNum = 45;BA.debugLine="charName.Text = Main.selected.Get(\"name\") & \" det";
mostCurrent._charname.setText(BA.ObjectToCharSequence(BA.ObjectToString(mostCurrent._main._selected /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("name")))+" details"));
 //BA.debugLineNum = 47;BA.debugLine="charRelated.SingleLineLayout.Label.TextColor = Co";
mostCurrent._charrelated.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
 //BA.debugLineNum = 48;BA.debugLine="charRelated.AddSingleLine(\"Comics\")";
mostCurrent._charrelated.AddSingleLine(BA.ObjectToCharSequence("Comics"));
 //BA.debugLineNum = 49;BA.debugLine="charRelated.AddSingleLine(\"Series\")";
mostCurrent._charrelated.AddSingleLine(BA.ObjectToCharSequence("Series"));
 //BA.debugLineNum = 50;BA.debugLine="charRelated.AddSingleLine(\"Stories\")";
mostCurrent._charrelated.AddSingleLine(BA.ObjectToCharSequence("Stories"));
 //BA.debugLineNum = 51;BA.debugLine="charRelated.AddSingleLine(\"Events\")";
mostCurrent._charrelated.AddSingleLine(BA.ObjectToCharSequence("Events"));
 //BA.debugLineNum = 53;BA.debugLine="Dim links As List = Main.selected.Get(\"urls\")";
_links = new anywheresoftware.b4a.objects.collections.List();
_links.setObject((java.util.List)(mostCurrent._main._selected /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("urls"))));
 //BA.debugLineNum = 54;BA.debugLine="If links.Size > 0 Then";
if (_links.getSize()>0) { 
 //BA.debugLineNum = 55;BA.debugLine="linksLabel.Visible = True";
mostCurrent._linkslabel.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 56;BA.debugLine="addLinks(links)";
_addlinks(_links);
 };
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public static String  _addlinks(anywheresoftware.b4a.objects.collections.List _links) throws Exception{
int _position = 0;
anywheresoftware.b4a.objects.collections.Map _link = null;
anywheresoftware.b4a.objects.LabelWrapper _linklabel = null;
 //BA.debugLineNum = 74;BA.debugLine="Sub addLinks(links As List)";
 //BA.debugLineNum = 75;BA.debugLine="Dim position As Int = 0";
_position = (int) (0);
 //BA.debugLineNum = 76;BA.debugLine="For Each link As Map In links";
_link = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = _links;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_link.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group2.Get(index2)));
 //BA.debugLineNum = 77;BA.debugLine="Dim linkLabel As Label";
_linklabel = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 78;BA.debugLine="linkLabel.Initialize(\"link\")";
_linklabel.Initialize(mostCurrent.activityBA,"link");
 //BA.debugLineNum = 79;BA.debugLine="linkLabel.Text = \"• \" & link.Get(\"type\")";
_linklabel.setText(BA.ObjectToCharSequence("• "+BA.ObjectToString(_link.Get((Object)("type")))));
 //BA.debugLineNum = 80;BA.debugLine="linkLabel.Tag = link.Get(\"url\")";
_linklabel.setTag(_link.Get((Object)("url")));
 //BA.debugLineNum = 81;BA.debugLine="linkLabel.TextSize = 28";
_linklabel.setTextSize((float) (28));
 //BA.debugLineNum = 82;BA.debugLine="linkLabel.TextColor = Colors.Blue";
_linklabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Blue);
 //BA.debugLineNum = 84;BA.debugLine="charLinks.Panel.AddView(linkLabel, 0, position,";
mostCurrent._charlinks.getPanel().AddView((android.view.View)(_linklabel.getObject()),(int) (0),_position,mostCurrent._charlinks.getWidth(),(int) (_linklabel.getTextSize()*4));
 //BA.debugLineNum = 85;BA.debugLine="position = position + linkLabel.TextSize*4 + 20";
_position = (int) (_position+_linklabel.getTextSize()*4+20);
 }
};
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public static String  _charrelated_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub charRelated_ItemClick (Position As Int, Value";
 //BA.debugLineNum = 70;BA.debugLine="selected = Value";
_selected = BA.ObjectToString(_value);
 //BA.debugLineNum = 71;BA.debugLine="StartActivity(CharRelatedInfoView)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._charrelatedinfoview.getObject()));
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private charDetail As ScrollView";
mostCurrent._chardetail = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private charDetailText As Label 'not added from d";
mostCurrent._chardetailtext = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private charImage As ImageView";
mostCurrent._charimage = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private charName As Label";
mostCurrent._charname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private charRelated As ListView";
mostCurrent._charrelated = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private linksLabel As Label";
mostCurrent._linkslabel = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private charLinks As ScrollView";
mostCurrent._charlinks = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private character As CharacterController";
mostCurrent._character = new b4a.MarvelApp.charactercontroller();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.samples.httputils2.httpjob  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub JobDone(Job As HttpJob) As HttpJob";
 //BA.debugLineNum = 90;BA.debugLine="If Job.Success = True Then";
if (_job._vvv7==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 91;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._vvv6,"DownloadImage")) {
case 0: {
 //BA.debugLineNum = 93;BA.debugLine="charImage.Bitmap = Job.GetBitmap";
mostCurrent._charimage.setBitmap((android.graphics.Bitmap)(_job._vv1().getObject()));
 //BA.debugLineNum = 94;BA.debugLine="Exit";
if (true) break;
 break; }
}
;
 };
 //BA.debugLineNum = 97;BA.debugLine="Job.Release";
_job._vvv5();
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public static String  _link_click() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lblsender = null;
anywheresoftware.b4a.phone.Phone.PhoneIntents _p = null;
 //BA.debugLineNum = 100;BA.debugLine="Sub link_Click";
 //BA.debugLineNum = 101;BA.debugLine="Dim lblSender As Label";
_lblsender = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 102;BA.debugLine="Dim p As PhoneIntents";
_p = new anywheresoftware.b4a.phone.Phone.PhoneIntents();
 //BA.debugLineNum = 103;BA.debugLine="lblSender = Sender";
_lblsender.setObject((android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
 //BA.debugLineNum = 105;BA.debugLine="StartActivity(p.OpenBrowser(lblSender.Tag))";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_p.OpenBrowser(BA.ObjectToString(_lblsender.getTag()))));
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Public selected As String";
_selected = "";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
}
