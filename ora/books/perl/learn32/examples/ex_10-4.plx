# ex_10-4

# Learning Perl on Win32 Systems, Exercise 10.4



while (<>) {

  chomp;

  $age = -M;

  if ($oldest_age < $age) {

    $oldest_name = $_;

    $oldest_age = $age;

  }

}

print "The oldest file is $oldest_name ",

  "and is $oldest_age days old.\n";

