# ex_14-1

# Learning Perl on Win32 Systems, Exercise 14.1



my ($src, $trg) = @ARGV;

die "$src isn't a directory" unless -d $src;

die "$trg isn't a directory" unless -d $trg;

`xcopy /s /e $src $trg`;

