# ex_09-1

# Learning Perl on Win32 Systems, Exercise 9.1



while () { ## NEW ##

  print "Enter first number: ";

  chomp($first = <STDIN>);

  last if $first eq "end"; ## NEW ##

  

  print "Enter second number: ";

  chomp($second = <STDIN>);

  last if $second eq "end"; ## NEW ##

  

  $message = &card($first) . " plus " .

    &card($second) . " equals " .

      &card($first+$second) . ".\n";

  print "\u$message";

} ## NEW ##



sub card {

  my %card_map;

  @card_map{0..9} = qw(

		       zero one two three four five six seven eight nine

		      );

  

  my($num) = @_;

  my($negative);

  if ($num < 0) {

    $negative = "negative ";

    $num = - $num;

  }

  if ($card_map{$num}) {

    $negative . $card_map{$num}; # return value

  } else {

    $negative . $num; # return value

  }

}

