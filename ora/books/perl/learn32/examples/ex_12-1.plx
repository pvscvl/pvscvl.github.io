# ex_12-1

# Learning Perl on Win32 Systems, Exercise 12.1



print "Where to? ";

chomp($newdir = <STDIN>);

chdir($newdir) || die "Cannot chdir to $newdir: $!";

foreach (<*>) {

  print "$_\n";

}

