# ex_02-2

# Learning Perl on Win32 Systems, Exercise 2.2



print "What is the radius: ";

chomp($radius = <STDIN>);

$pi = 3.141592654;

$result = 2 * $pi * $radius;

print "radius $radius is circumference $result\n";

