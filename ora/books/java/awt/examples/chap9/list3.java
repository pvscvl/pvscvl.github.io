// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;
import java.applet.Applet;
public class list3 extends Applet {
    List l;
    public void init () {
	String []fonts;
	fonts = Toolkit.getDefaultToolkit().getFontList();
        l = new List(4, true);
        for (int i = 0; i < fonts.length; i++)
            l.addItem (fonts[i]);
        setLayout (new BorderLayout (10, 10));
        add ("North", new Label ("Pick Font Set"));
        add ("Center", l);
        add ("South", new Button ("Submit"));
        resize (preferredSize());
        validate();
    }
    public boolean action (Event e, Object o) {
        if (e.target instanceof Button) {
            String chosen[] = l.getSelectedItems();
            for (int i=0;i<chosen.length;i++)
                System.out.println (chosen[i]);
        }
        return false;
    }
}
