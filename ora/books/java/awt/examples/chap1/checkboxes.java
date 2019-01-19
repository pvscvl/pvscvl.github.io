// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;
import java.applet.Applet;

public class checkboxes extends Applet {

   Checkbox cb;

   public void init () {

	String []fonts;

	fonts = Toolkit.getDefaultToolkit().getFontList();

        add (cb = new Checkbox (fonts[0]));
	CheckboxGroup cbg = new CheckboxGroup();
	Panel p = new Panel();
	p.setLayout (new GridLayout (0,1));

	for (int i = 1; i < fonts.length; i++) {

		p.add (new Checkbox (fonts[i], cbg, false));

	}
	add (p);

   }

   public boolean action (Event e, Object o) {

        if (e.target == cb) {
                if ("true".equals(o.toString()))
                        cb.setLabel ("True");
                else
                        cb.setLabel ("False");
        }

        return false;

   }

}
