// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or

import java.awt.*;
import java.applet.Applet;

public class cornertexts extends Applet {

   public void init () {

        setLayout (new CornerLayout2());
        add (new Button ("Northwest"), "Northwest");
        add (new Button ("Northeast"), "Northeast");
        add (new Button ("Southwest"), "Southwest");
        add (new Button ("Southeast"), "Southeast");
        add (new Button ("Center"), "Center");
        resize(preferredSize());
        System.out.println (new CornerLayout2());
   }
}
