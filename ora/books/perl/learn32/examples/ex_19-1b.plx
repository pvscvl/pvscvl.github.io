# ex_19-1b

# Learning Perl on Win32 Systems, Exercise 19.1b



use Win32::OLE;

Win32::OLE::CreateObject("InternetExplorer.Application.1", $ie) || 

  die "CreateObject: $!";

$ie->{Visible} = 1;

$ie->Navigate("http://www.ora.com/publishing/perl/");

