# ex_12-2b

# Learning Perl on Win32 Systems, Exercise 12.2b



print "Where to? ";

chomp($newdir = <STDIN>);

chdir($newdir) || die "Cannot chdir to $newdir: $!";

foreach (sort <* .*>) {

    print "$_\n";

}

