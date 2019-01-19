# ex_08-2

# Learning Perl on Win32 Systems, Exercise 8.2



print "Enter first number: ";

chomp($first = <STDIN>);

print "Enter second number: ";

chomp($second = <STDIN>);

$message = &card($first) . " plus " .

  &card($second) . " equals " .

  &card($first+$second) . ".\n";

print "\u$message";



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



