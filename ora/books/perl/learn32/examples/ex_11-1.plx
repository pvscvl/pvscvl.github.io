# ex_11-1

# Learning Perl on Win32 Systems, Exercise 11.1



$file = shift || die "usage: $0 filename";

open(F, $file) || die "open: $!";

while (<F>) {

  ($user, $company, $email) = split /:/;

  write;

}



format STDOUT =

@<<<<<<<<<<<<<< @<<<<<<<<<<<<<<<<<<<<<<< @<<<<<<<<<<<<<<<<

$user,          $company,                $email

.

