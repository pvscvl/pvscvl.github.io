# ex_04-4

# Learning Perl on Win32 Systems, Exercise 4.4



print "Enter some strings, end with ^Z:\n";

@strings = <STDIN>;

while (@strings) {

  print pop @strings;

}



