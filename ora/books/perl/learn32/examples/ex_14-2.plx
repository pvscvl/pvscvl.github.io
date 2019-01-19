# ex_14-2

# Learning Perl on Win32 Systems, Exercise 14.2



@hosts = `net view`;

foreach (@hosts) {

  next unless m#\\\\#;

  chop;

  s/^(\S+).*/$1/;

  push @sorted, $_;

}

print join("\n", sort @sorted);

