# ex_17-1a

# Learning Perl on Win32 Systems, Exercise 17.1a



# program 1:

dbmopen(%WORDS,"words",0644);

while (<>) {

  foreach $word (split(/\W+/)) {

    $WORDS{$word}++;

  }

}

dbmclose(%WORDS);

