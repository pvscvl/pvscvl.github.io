# ex_05-2

# Learning Perl on Win32 Systems, Exercise 5.2



chomp(@words = <STDIN>); # read the words, minus newlines

foreach $word (@words) {

  $count{$word} = $count{$word} + 1; # or $count{$word}++

}

foreach $word (keys %count) {

  print "$word was seen $count{$word} times\n";

}



