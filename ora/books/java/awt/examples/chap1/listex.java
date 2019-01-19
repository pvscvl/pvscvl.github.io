// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or

import java.awt.*;
import java.applet.Applet;

public class listex extends Applet {

   public void init () {

	String []fonts;

	fonts = Toolkit.getDefaultToolkit().getFontList();

	List a = new List(3, true);
	List b = new List(3, false);
	List c = new List(3, true);

	for (int i = 0; i < fonts.length; i++) {

		a.addItem (fonts[i]);
		b.addItem (fonts[i]);
		c.addItem (fonts[i]);

	}

	add (a);
	add (b);
	add (c);

   }

}
