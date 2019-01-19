// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;
public class labels extends java.applet.Applet {
   public void init () {
        Label l;
	String []fonts;
	fonts = Toolkit.getDefaultToolkit().getFontList();
	for (int i = 0; i < fonts.length; i++) {
                add (l = new Label (fonts[i]));
                l.setFont (new Font (fonts[i], Font.BOLD, 10+i*2));
	}
   }
}
