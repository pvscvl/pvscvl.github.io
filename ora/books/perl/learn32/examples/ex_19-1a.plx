# ex_19-1a

# Learning Perl on Win32 Systems, Exercise 19.1a



use OLE;

$ie = CreateObject OLE "InternetExplorer.Application.1" ||

  die "CreateObject: $!";

$ie->{Visible} = 1;

$ie->Navigate("http://www.ora.com/publishing/perl/");

