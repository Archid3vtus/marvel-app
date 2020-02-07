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

	Private charDetail As Label
	Private charImage As ImageView
	Private charName As Label
	Private charRelated As ListView
	
	Private character As CharacterController
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("CharacterDetails")
	character.Initialize(Me)
	
	Dim thumbnail As Map = Main.selected.Get("thumbnail")
	Dim imageUrl As String = thumbnail.Get("path") & "/portrait_xlarge." & thumbnail.Get("extension")
	
	charDetail.Text = Main.selected.Get("description")
	
	charName.Text = Main.selected.Get("name") & " details"
	
	charRelated.SingleLineLayout.Label.TextColor = Colors.Gray
	charRelated.AddSingleLine("Comics")
	charRelated.AddSingleLine("Series")
	charRelated.AddSingleLine("Stories")
	charRelated.AddSingleLine("Events")
	
	character.DownloadImage(imageUrl)

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub charRelated_ItemClick (Position As Int, Value As Object)
	selected = Value
	StartActivity(CharRelatedInfoView)
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