# ex_06-4

# Learning Perl on Win32 Systems, Exercise 6.4



print "Field width: ";

chomp($width = <STDIN>);

print "List of strings:\n";

chomp(@strings = <STDIN>);

foreach (@strings) {

  printf "%${width}s\n", $_;

}



