# ex_09-2

# Learning Perl on Win32 Systems, Exercise 9.2



{

  print "Enter a number (999 to quit): ";

  chomp($n = <STDIN>);

  last if $n == 999;

  $sum += $n;

  redo;

}



print "the sum is $sum\n";



