// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
implied.
import java.awt.*;
import java.applet.Applet;
public class buttonex extends Applet {
   public void init () {
	String []fonts;
	fonts = Toolkit.getDefaultToolkit().getFontList();
	for (int i = 0; i < fonts.length; i++) {
		add (new Button (fonts[i]));
	}
   }
}
