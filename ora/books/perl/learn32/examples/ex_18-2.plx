# ex_18-2

# Learning Perl on Win32 Systems, Exercise 18.2



use strict;

use CGI qw(:standard);

print header(), start_html("Browser Detective");

print h1("Browser Detective"), hr();

my $browser = $ENV{'HTTP_USER_AGENT'};

$_ = $browser;

if (/msie/) {

  msie($_);

} elsif (/mozilla/i) {

  netscape($_);

} elsif (/lynx/i) {

  lynx($_);

} else {

  default($_);

}



print end_html();

sub msie{ 

  print p("Internet Explorer: @_.  Good Choice\n");

}

sub netscape {

  print p("Netscape: @_.  Good Choice\n");

}

sub lynx {

  print p("Lynx: @_.  Shudder...");

}

sub default {

  print p("What the heck is a @_?");

}

