# ex_08-3

# Learning Perl on Win32 Systems, Exercise 8.3



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

