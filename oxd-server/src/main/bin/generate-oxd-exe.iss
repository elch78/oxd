; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

#define MyAppName "oxd-server"
#define MyAppVersion "4.0"
#define MyAppPublisher "Gluu, Inc."
#define MyAppURL "https://www.gluu.org/"
#define MyAppExeName "oxd-server.exe"
;set path to jre home
#define JREHome "D:\software\jdk1.8.0_161\jre"
;set path of the instructions to run oxd server
#define OXDInstructionFile "..\..\..\doc\oxd-instructions-doc.txt"
;set path to output directory of the exe file
#define OXDExeOutputDir "..\..\..\target"
;set path to oxd-server project.build.directory
#define OXDTargetDir "..\..\..\target"


[Setup]
; NOTE: The value of AppId uniquely identifies this application.
; Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{F23E1E34-794C-4817-9E58-D2627626CBF1}
AppName={#MyAppName}
AppVersion={#MyAppVersion}
;AppVerName={#MyAppName} {#MyAppVersion}
AppPublisher={#MyAppPublisher}
AppPublisherURL={#MyAppURL}
AppSupportURL={#MyAppURL}
AppUpdatesURL={#MyAppURL}
DefaultDirName={pf}\{#MyAppName}
;DefaultGroupName={#MyAppName}
DisableProgramGroupPage=yes
InfoBeforeFile={#OXDInstructionFile}
OutputDir={#OXDExeOutputDir}
OutputBaseFilename=oxd-server
Compression=lzma
SolidCompression=yes
DisableDirPage=no
ChangesEnvironment=yes

[Languages]
Name: "english"; MessagesFile: "compiler:Default.isl"

[Files]
;Source: "{#OXDTargetDir}\oxd-server.exe"; DestDir: "{app}"; Flags: ignoreversion
Source: "{#OXDTargetDir}\oxd-server-distribution\bin\*"; DestDir: "{app}\bin"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "{#OXDTargetDir}\oxd-server-distribution\conf\*"; DestDir: "{app}\conf"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "{#OXDTargetDir}\oxd-server-distribution\lib\*"; DestDir: "{app}\lib"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "{#JREHome}\*"; DestDir: "{app}\jre"; Flags: ignoreversion recursesubdirs createallsubdirs
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Icons]
Name: "{group}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"

[Run]
Filename: "{app}\bin\oxd-service-install.bat"; Check: InstallAsServiceFile;

[UninstallRun]
Filename: "{app}\bin\oxd-service-uninstall.bat"; Flags: runhidden

[Registry]
Root: HKCU; Subkey: "Environment"; ValueType:string; ValueName: "OXD_HOME"; ValueData: {app}; Flags: preservestringtype

[Code]
var
  InstallAsServiceCheckBox: TNewCheckBox;

procedure InitializeWizard;
var
 
  StaticText1: TNewStaticText;
  MainPage: TWizardPage;  
  Panel: TPanel;

begin
  MainPage := CreateCustomPage(wpWelcome, 'Do you want to install oxd as service?', 'Select the checkbox to install oxd as service.');

  //panel
  Panel := TPanel.Create(MainPage);
  Panel.Parent := MainPage.Surface;
  Panel.Left := 10;
  Panel.Top := 50;
  Panel.Width := ScaleX(450);
  Panel.Height := ScaleX(250);
  Panel.Visible := True;
  //text
  StaticText1 := TNewStaticText.Create(MainPage);
  StaticText1.Parent := Panel;
  StaticText1.Left := 12;
  StaticText1.Top := 50;
  StaticText1.Width := ScaleX(417);
  StaticText1.WordWrap:= true;
  StaticText1.Caption := 'Select the below checkbox to install oxd-server as windows service.';

  //checkbox
  InstallAsServiceCheckBox := TNewCheckBox.Create(MainPage);
  InstallAsServiceCheckBox.Parent := Panel;
  InstallAsServiceCheckBox.Top := 75;
  InstallAsServiceCheckBox.Left := 85;
  InstallAsServiceCheckBox.Width := ScaleX(417);
  InstallAsServiceCheckBox.Caption := 'Install OXD as service';
end;

function InstallAsServiceFile: Boolean;
begin
  // here is the Check function used above; if you return True to this
  // function, the file will be installed, when False, the file won't 
  // be installed
  Result := InstallAsServiceCheckBox.Checked;
end;