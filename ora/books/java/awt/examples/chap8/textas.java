// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.TextArea;

public class textas extends java.applet.Applet {
   public void init () {
        add (new TextArea ());
        add (new TextArea (3, 10));
        add (new TextArea ("Empty Area"));
        add (new TextArea ("Empty Area", 3, 10));
        System.out.println (new TextArea ("Empty Area", 3, 10));
   }
}
