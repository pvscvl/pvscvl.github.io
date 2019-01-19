# ex_16-2

# Learning Perl on Win32 Systems, Exercise 16.2



use Win32::Registry;

$p = shift || die "usage: $0 path";

# strip leading backslashes

$p =~ s#^\\##;

$main::HKEY_LOCAL_MACHINE->Open($p, $key) || 

  die "Open: $!";

$key->GetValues(\%vals); # get values -hash ref

foreach $k (keys %vals) {

  $key = $vals{$k};

  print "$$key[0] = $$key[2]\n";

}

