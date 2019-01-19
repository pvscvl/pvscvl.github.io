# ex_19-2a

# Learning Perl on Win32 Systems, Exercise 19.2a



use OLE;

# grab the numbers

@numbers = <STDIN>;

# create the automation object

$xl = CreateObject OLE "Excel.Application" ||

  die "CreateObject: $!";

# show it and add a new workbook

$xl->{Visible} = 1;

$xl->Workbooks->Add();

# start at the top left

$col = "A"; $row = 1;

foreach $num (@numbers) {

  chomp($num);

  $cell = sprintf("%s%d", $col, $row++);

  # add it to Excel

    $xl->Range($cell)->{Value}  = $num;

}

