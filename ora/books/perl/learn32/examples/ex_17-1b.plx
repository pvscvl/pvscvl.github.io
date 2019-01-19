# ex_17-1b

# Learning Perl on Win32 Systems, Exercise 17.1b



# program 2:

dbmopen(%WORDS,"words",undef);

foreach $word (sort { $WORDS{$b} <=> $WORDS{$a} } keys %WORDS) {

  print "$word $WORDS{$word}\n";

}

dbmclose(%WORDS);

