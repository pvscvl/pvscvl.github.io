# ex_16-1

# Learning Perl on Win32 Systems, Exercise 16.1



foreach $host (@ARGV) {

  ($name, $aliases, $addrtype, $length, @addrs) = gethostbyname($host);

  print "$host:\n";

  

  foreach $a (@addrs) {

    print join(".", unpack("C4", $a)), "\n";

  }

}

