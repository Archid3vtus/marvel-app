package b4a.MarvelApp.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_search{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[Search/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="searchBar.Width = 70%x"[Search/General script]
views.get("searchbar").vw.setWidth((int)((70d / 100 * width)));
//BA.debugLineNum = 4;BA.debugLine="send.Width = 30%x"[Search/General script]
views.get("send").vw.setWidth((int)((30d / 100 * width)));
//BA.debugLineNum = 5;BA.debugLine="charList.Width = 100%x"[Search/General script]
views.get("charlist").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 6;BA.debugLine="charList.Height = 100%y - searchBar.Height"[Search/General script]
views.get("charlist").vw.setHeight((int)((100d / 100 * height)-(views.get("searchbar").vw.getHeight())));

}
}