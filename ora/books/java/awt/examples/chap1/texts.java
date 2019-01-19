// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or

import java.awt.*;
import java.applet.Applet;

public class texts extends Applet {

   public void init () {

        add (new TextField ("Empty String", 20));
        setFont (new Font ("TimesRoman", Font.ITALIC, 8));
        add (new TextField ("Hello World"));
        setFont (new Font ("Helvetica", Font.BOLD, 18));
        add (new TextArea ("Scratch Pad on Ice", 5,20));

   }

}
