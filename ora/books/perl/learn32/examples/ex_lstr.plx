# ex_lstr

# Learning Perl on Win32 Systems, Exercise lstr



while ( defined($filename = glob("*.sec")) ) {

  open (WORDSLIST, $filename) ||

    die "can't open $filename: $!";

  if (-M WORDSLIST <= 7.0) {

    while (defined ($name = <WORDSLIST>)) {

      chomp ($name);

      $word = <WORDSLIST>;

      chomp ($word);

      write; # invoke format STDOUT to STDOUT

    }

  }

  close (WORDSLIST) || die "can't close $filename: $!";

}



format STDOUT =

@<<<<<<<<<<<<<<< @<<<<<<<<< @<<<<<<<<<<<

$filename, $name, $word

.



format STDOUT_TOP =

Page @<<

$%



Filename         Name       Word

================ ========== ============

.

