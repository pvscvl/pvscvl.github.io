# ex_hello

# Learning Perl on Win32 Systems, Exercise hello



init_words();

print "What is your name? ";

$name = <STDIN>;

chomp ($name);

if ($name =~ /^erik\b/i) { # back to the other way :-)

  print "Hello, Erik! How good of you to be here!\n";

} else {

  print "Hello, $name!\n"; # ordinary greeting

  print "What is the secret word? ";

  $guess = <STDIN>;

  chomp ($guess);

  while (! good_word($name,$guess)) {

    print "Wrong, try again. What is the secret word? ";

    $guess = <STDIN>;

    chomp ($guess);

  }

}

dbmopen (%last_good,"lastdb",0666) || 

                 die "can't dbmopen lastdb: $!";

$last_good{$name} = time;

dbmclose (%last_good) || die "can't dbmclose lastdb: $!";

sub init_words {

  while ( defined($filename = glob("*.sec")) ) {

    open (WORDSLIST, $filename) || 

      die "can't open $filename: $!";

    if (-M WORDSLIST <= 7.0) {

      while (defined ($name = <WORDSLIST>)) {

	chomp ($name);

	$word = <WORDSLIST>;

	chomp ($word);

	$words{$name} = $word;

      }

    } else { # rename the file so it gets noticed

      rename ($filename,"$filename.old");

    }

         close (WORDSLIST) ||

	   die "couldn't close $filename: $!";

  }

}

sub good_word {

  my($somename,$someguess) = @_; # name the parameters

  $somename =~ s/\W.*//; # delete everything after first word

  $somename =~ tr/A-Z/a-z/; # lowercase everything

  if ($somename eq "erik") { # should not need to guess

    return 1; # return value is true

  } elsif (($words{$somename} || "groucho") eq $someguess) {

    return 1; # return value is true

  } else {

    log_failure($somename,$someguess);

    return 0; # return value is false

  }

}



sub log_failure {

  my($somename,$someguess) = @_; # name the parameters

  open(LOG, ">>failures.log") || die "failures.log: $!";

  print LOG "bad news: $somename guessed $someguess\n";

  close (LOG)  || die "can't close failures.log: $!";

}



