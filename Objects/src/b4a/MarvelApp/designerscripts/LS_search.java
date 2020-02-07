package b4a.MarvelApp.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_search{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("searchbar").vw.setWidth((int)((68d / 100 * width)-20d));
views.get("send").vw.setLeft((int)((views.get("searchbar").vw.getLeft())+(views.get("searchbar").vw.getWidth())+10d));
views.get("send").vw.setWidth((int)((32d / 100 * width)-(views.get("searchbar").vw.getLeft())));
views.get("loading").vw.setHeight((int)(120d));
views.get("loading").vw.setWidth((int)(120d));
views.get("loading").vw.setTop((int)((50d / 100 * height)-(views.get("loading").vw.getHeight())));
views.get("loading").vw.setLeft((int)((50d / 100 * width)-(views.get("loading").vw.getWidth())/2d));
views.get("charlist").vw.setWidth((int)((100d / 100 * width)));
views.get("charlist").vw.setHeight((int)((100d / 100 * height)-(views.get("searchbar").vw.getHeight())-10d));

}
}