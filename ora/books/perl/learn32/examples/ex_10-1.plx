# ex_10-1

# Learning Perl on Win32 Systems, Exercise 10.1



print "What file? ";

chomp($filename = <STDIN>);

open(THATFILE, "$filename") ||

  die "cannot open $filename: $!";

while (<THATFILE>) {

  print "$filename: $_"; # presume $_ ends in \n

}

