// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;
public class panelex extends java.applet.Applet {
    String []fonts;
    Panel fillPanel (Panel p) {
        Button b;
        p.setLayout (new GridLayout (0,1, 3, 3));
	for (int i = 0; i < fonts.length; i++) {
            p.add (b = new Button (fonts[i].substring(0,2)));
	}
	return (p);
    }
    public void init () {
	Panel p;
	fonts = Toolkit.getDefaultToolkit().getFontList();
	for (int i = 0; i < 2; i++) {
	    p = fillPanel (new Panel());
	    add (p);
            p.setLayout (new GridLayout (1,0, 3, 3));
	    p.add (fillPanel (new Panel()));
            p.add (fillPanel (new Panel()));
	}
        setLayout (new FlowLayout ());
   }
}

