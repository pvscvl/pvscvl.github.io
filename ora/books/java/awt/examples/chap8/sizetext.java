// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or

import java.awt.*;                                         
import java.applet.Applet;

public class sizetext extends Applet {

   public void init () {
        add (new SizedTextField ());
        add (new SizedTextField (15));
        add (new SizedTextField (20, 10));
        add (new SizedTextField (20, -25));
        add (new SizedTextField ("Hello World"));
        add (new SizedTextField ("Empty String", 10));
        add (new SizedTextField ("String", 10, 20));
   }
}
