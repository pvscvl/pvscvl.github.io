// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;

public class texts extends java.applet.Applet {
   public void init () {
        add (new TextField ());
        add (new TextField (15));
        add (new TextField ("Empty String"));
        add (new TextField ("Empty String", 20));
   }
}
