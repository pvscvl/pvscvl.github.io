# ex_03-2

# Learning Perl on Win32 Systems, Exercise 3.2



print "Enter the line number: "; chomp($a = <STDIN>);

print "Enter the lines, end with ^Z:\n"; @b = <STDIN>;

print "Answer: $b[$a-1]";

