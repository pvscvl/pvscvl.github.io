# ex_08-1

# Learning Perl on Win32 Systems, Exercise 8.1



sub card {

  my %card_map;

  @card_map{1..9} = qw(

		       one two three four five six seven eight nine

		      );

  

  my($num) = @_;

  if ($card_map{$num}) {

    $card_map{$num}; # return value

  } else {

    $num; # return value

  }

}



# driver routine:

while (<>) {

  chomp;

  print "card of $_ is ", &card($_), "\n";

}



