# ex_11-3

# Learning Perl on Win32 Systems, Exercise 11.3



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



# append to program from the first problem...

format STDOUT_TOP =

Page @<<<

$%



User            Company                  Real Name

==============  =======================  =================

.

