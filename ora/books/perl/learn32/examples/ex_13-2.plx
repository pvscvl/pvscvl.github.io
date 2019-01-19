# ex_13-2

# Learning Perl on Win32 Systems, Exercise 13.2



($old, $new) = @ARGV; # name them

if (-d $new) { # new name is a directory, need to patch it up

  ($basename = $old) =~ s#.*\\##s; # get basename of $old

    $new .= "\\$basename"; # and append it to new name

}

rename($old,$new) || die "Cannot rename $old to $new: $!";

