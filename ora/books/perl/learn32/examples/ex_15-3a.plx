# ex_15-3a

# Learning Perl on Win32 Systems, Exercise 15.3a



while (<>) {

  substr($_,0,1) =~ tr/a-z/A-Z/;

  substr($_,1) =~ tr/A-Z/a-z/;

  print;

}

