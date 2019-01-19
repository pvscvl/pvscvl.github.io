// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.TextArea;

public class textas11 extends java.applet.Applet {
   String s = "This is a test of the emergency broadcasting service.\n\n\n\n\nIf this were not a test\n\n\n\n\n, who knows what this would be.";
   public void init () {
        add (new TextArea (s, 3, 10, TextArea.SCROLLBARS_BOTH));
        add (new TextArea (s, 3, 10, TextArea.SCROLLBARS_VERTICAL_ONLY));
        add (new TextArea (s, 3, 10, TextArea.SCROLLBARS_HORIZONTAL_ONLY));
        add (new TextArea (s, 3, 10, TextArea.SCROLLBARS_NONE));
System.out.println (new TextArea ("Empty Area", 3, 10));
   }
}
