# ex_06-3

# Learning Perl on Win32 Systems, Exercise 6.3



print "List of strings:\n";

chomp(@strings = <STDIN>);

foreach (@strings) {

  printf "%20s\n", $_;

}



