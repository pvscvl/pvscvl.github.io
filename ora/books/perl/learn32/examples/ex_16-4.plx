# ex_16-4

# Learning Perl on Win32 Systems, Exercise 16.4



sub print_dword_key {

  my ($dw) = @_;

  printf ("0x%x", unpack("l", $dw));

}

