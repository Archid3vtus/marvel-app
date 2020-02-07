B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
	Public selected As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private charDetail As ScrollView
	Private charDetailText As Label 'not added from designer
	Private charImage As ImageView
	Private charName As Label
	Private charRelated As ListView
	Private linksLabel As Label
	Private charLinks As ScrollView
	
	Private character As CharacterController
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("CharacterDetails")
	
	Dim thumbnail As Map = Main.selected.Get("thumbnail")
	Dim imageUrl As String = thumbnail.Get("path") & "/portrait_xlarge." & thumbnail.Get("extension")
	character.Initialize(Me)
	character.DownloadImage(imageUrl)
	
	'charDetail.Text = Main.selected.Get("description")
	charDetailText.Initialize("")
	charDetail.Panel.AddView(charDetailText, 0, 0, charDetail.Width, 100%y)
	charDetailText.Text = Main.selected.Get("description")
	charDetailText.TextSize = 16
	charDetailText.TextColor = Colors.Gray
	
	charName.Text = Main.selected.Get("name") & " details"
	
	charRelated.SingleLineLayout.Label.TextColor = Colors.Gray
	charRelated.AddSingleLine("Comics")
	charRelated.AddSingleLine("Series")
	charRelated.AddSingleLine("Stories")
	charRelated.AddSingleLine("Events")
	
	Dim links As List = Main.selected.Get("urls")
	If links.Size > 0 Then
		linksLabel.Visible = True
		addLinks(links)
	End If
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub charRelated_ItemClick (Position As Int, Value As Object)
	selected = Value
	StartActivity(CharRelatedInfoView)
End Sub

Sub addLinks(links As List)
	Dim position As Int = 0
	For Each link As Map In links
		Dim linkLabel As Label
		linkLabel.Initialize("link")
		linkLabel.Text = "• " & link.Get("type")
		linkLabel.Tag = link.Get("url")
		linkLabel.TextSize = 28
		linkLabel.TextColor = Colors.Blue
		
		charLinks.Panel.AddView(linkLabel, 0, position, charLinks.Width, linkLabel.TextSize*4)
		position = position + linkLabel.TextSize*4 + 20
	Next
End Sub

Sub JobDone(Job As HttpJob) As HttpJob
	If Job.Success = True Then
		Select Job.JobName
			Case "DownloadImage":
				charImage.Bitmap = Job.GetBitmap
				Exit
		End Select
	End If
	Job.Release
End Sub

Sub link_Click
	Dim lblSender As Label
	Dim p As PhoneIntents
	lblSender = Sender
	
	StartActivity(p.OpenBrowser(lblSender.Tag))
End Sub