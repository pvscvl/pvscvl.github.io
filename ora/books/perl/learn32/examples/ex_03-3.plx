# ex_03-3

# Learning Perl on Win32 Systems, Exercise 3.3



srand;

print "List of strings: "; @b = <STDIN>;

print "Answer: $b[rand(@b)]";

