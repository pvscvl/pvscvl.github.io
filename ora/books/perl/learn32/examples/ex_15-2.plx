# ex_15-2

# Learning Perl on Win32 Systems, Exercise 15.2



chomp(@nums = <STDIN>); # note special use of chomp

@nums = sort { $a <=> $b } @nums;

foreach (@nums) {

  printf "%30g\n", $_;

}

