# ex_12-2a

# Learning Perl on Win32 Systems, Exercise 12.2a



print "Where to? ";

chomp($newdir = <STDIN>);

chdir($newdir) ||

  die "Cannot chdir to $newdir: $!";

opendir(DOT,".") ||

  die "Cannot opendir . (serious dainbramage): $!";

foreach (sort readdir(DOT)) {

  print "$_\n";

}

closedir(DOT);

