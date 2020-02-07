package b4a.MarvelApp.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_characterdetails{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[CharacterDetails/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 5;BA.debugLine="charName.Width = 100%x - 20"[CharacterDetails/General script]
views.get("charname").vw.setWidth((int)((100d / 100 * width)-20d));
//BA.debugLineNum = 7;BA.debugLine="charImage.Height = 150 * ((30%x) * 0.01)"[CharacterDetails/General script]
views.get("charimage").vw.setHeight((int)(150d*(((30d / 100 * width))*0.01d)));
//BA.debugLineNum = 8;BA.debugLine="charImage.Width = 100 * ((30%x) * 0.01)"[CharacterDetails/General script]
views.get("charimage").vw.setWidth((int)(100d*(((30d / 100 * width))*0.01d)));
//BA.debugLineNum = 11;BA.debugLine="charDetail.Top = charName.Top + charName.Height + 10"[CharacterDetails/General script]
views.get("chardetail").vw.setTop((int)((views.get("charname").vw.getTop())+(views.get("charname").vw.getHeight())+10d));
//BA.debugLineNum = 12;BA.debugLine="charDetail.Left = charName.Left"[CharacterDetails/General script]
views.get("chardetail").vw.setLeft((int)((views.get("charname").vw.getLeft())));
//BA.debugLineNum = 13;BA.debugLine="charDetail.Height = 50%y - charDetail.Top - 10"[CharacterDetails/General script]
views.get("chardetail").vw.setHeight((int)((50d / 100 * height)-(views.get("chardetail").vw.getTop())-10d));
//BA.debugLineNum = 14;BA.debugLine="charDetail.Width = 100%x - (charImage.Width + 10) - 20"[CharacterDetails/General script]
views.get("chardetail").vw.setWidth((int)((100d / 100 * width)-((views.get("charimage").vw.getWidth())+10d)-20d));
//BA.debugLineNum = 17;BA.debugLine="charImage.Top = charName.Top + charName.Height + 10"[CharacterDetails/General script]
views.get("charimage").vw.setTop((int)((views.get("charname").vw.getTop())+(views.get("charname").vw.getHeight())+10d));
//BA.debugLineNum = 18;BA.debugLine="charImage.Left = charDetail.Left + charDetail.Width + 10"[CharacterDetails/General script]
views.get("charimage").vw.setLeft((int)((views.get("chardetail").vw.getLeft())+(views.get("chardetail").vw.getWidth())+10d));
//BA.debugLineNum = 21;BA.debugLine="charRelated.Top = charImage.Top + charImage.Height + 10"[CharacterDetails/General script]
views.get("charrelated").vw.setTop((int)((views.get("charimage").vw.getTop())+(views.get("charimage").vw.getHeight())+10d));
//BA.debugLineNum = 22;BA.debugLine="charRelated.Left = charImage.Left"[CharacterDetails/General script]
views.get("charrelated").vw.setLeft((int)((views.get("charimage").vw.getLeft())));
//BA.debugLineNum = 23;BA.debugLine="charRelated.Height = 100%y - (charRelated.Top + 10)"[CharacterDetails/General script]
views.get("charrelated").vw.setHeight((int)((100d / 100 * height)-((views.get("charrelated").vw.getTop())+10d)));
//BA.debugLineNum = 24;BA.debugLine="charRelated.Width = charImage.Width"[CharacterDetails/General script]
views.get("charrelated").vw.setWidth((int)((views.get("charimage").vw.getWidth())));
//BA.debugLineNum = 27;BA.debugLine="linksLabel.Width = charDetail.Width"[CharacterDetails/General script]
views.get("linkslabel").vw.setWidth((int)((views.get("chardetail").vw.getWidth())));
//BA.debugLineNum = 28;BA.debugLine="linksLabel.Top = charDetail.Top + charDetail.Height + 10"[CharacterDetails/General script]
views.get("linkslabel").vw.setTop((int)((views.get("chardetail").vw.getTop())+(views.get("chardetail").vw.getHeight())+10d));
//BA.debugLineNum = 31;BA.debugLine="charLinks.Top = linksLabel.Top + linksLabel.Height + 10"[CharacterDetails/General script]
views.get("charlinks").vw.setTop((int)((views.get("linkslabel").vw.getTop())+(views.get("linkslabel").vw.getHeight())+10d));
//BA.debugLineNum = 32;BA.debugLine="charLinks.Height = 100%y - charLinks.Top - 10"[CharacterDetails/General script]
views.get("charlinks").vw.setHeight((int)((100d / 100 * height)-(views.get("charlinks").vw.getTop())-10d));
//BA.debugLineNum = 33;BA.debugLine="charLinks.Width = linksLabel.Width"[CharacterDetails/General script]
views.get("charlinks").vw.setWidth((int)((views.get("linkslabel").vw.getWidth())));

}
}