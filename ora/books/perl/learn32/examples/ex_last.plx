# ex_last

# Learning Perl on Win32 Systems, Exercise last



dbmopen (%last_good,"lastdb",0666) ||

  die "can't dbmopen lastdb: $!";

foreach $name (sort keys %last_good) {

  $when = $last_good{$name};

  $hours = (time - $when) / 3600; # compute hours ago

  write;

}

dbmclose(%last_good) || die "can't dbmclose lastdb: $!";



format STDOUT =

User @<<<<<<<<<<<: last correct guess was @<<< hours ago.

$name, $hours

.

