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

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private chosen As Label
	Private contentList As ScrollView
	Private contentLabel As Label 'not added from the designer
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("CharRelatedInfoView")
	chosen.Text = Main.selected.Get("name") & " " & CharacterDetails.selected
	chosen.Tag = CharacterDetails.selected.ToLowerCase
	
	contentLabel.Initialize("")
	contentList.Panel.AddView(contentLabel, 0, 0, 100%x, 100%y)
	contentLabel.Text = GenerateContent
	contentLabel.TextColor = Colors.Gray
	contentLabel.TextSize = 24
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub GenerateContent As String
	Dim content As Map = Main.selected.Get(chosen.Tag)
	Dim contentItems As List = content.Get("items")
	
	Dim response As String = ""
	
	For Each item As Map In contentItems
		response = response & "• " & item.Get("name") & CRLF
	Next
	
	Return response
End Sub
