# ex_16-3

# Learning Perl on Win32 Systems, Exercise 16.3



sub CreateKeyPath {

  my ($subtree, $path) = @_;

  # break it into components

  # strip initial path separator, if there is one

  $path =~ s#^\\##;

  my (@klist) = split(/\\/, $path);

  my $key;

  my $regkey = $subtree;

  foreach $key (@klist) {

    $regkey->Create($key, $regkey) ||

      die "Can't create key $key: $!";

  }

  return $regkey;

}

