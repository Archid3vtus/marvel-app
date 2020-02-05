B4A=true
Group=Default Group\Controllers
ModulesStructureVersion=1
Type=Class
Version=9.5
@EndOfDesignText@
Sub Class_Globals
	Private http As HttpJob
	Private toBeSent As Object
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(received As Object)
	toBeSent = received
End Sub

Public Sub GetCharacter(name As String, limit As Int)
	Dim address As String = url.GetPrefix & "/v1/public/characters?" & url.GetAuth & "&limit=" & limit
	If name <> "" Then
		address = address & "&nameStartsWith=" & name
	End If
	http.Initialize("GetCharacter", toBeSent, False)
	http.Download(address)
End Sub
