// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
class MyChoice11 extends Choice {
    MyChoice11 () {
	super ();
	enableEvents (AWTEvent.ITEM_EVENT_MASK);
    }
    protected void processItemEvent(ItemEvent e) {
	ItemSelectable ie = e.getItemSelectable();
	System.out.println ("Item Selected: " + ie.getSelectedObjects()[0]);
	// If you do not call super.processItemEvent()
	// no listener will be notified
	super.processItemEvent (e);
    }
}

public class choice11 extends Applet implements ItemListener {
    Choice c;
    public void init () {
        String []fonts;
        fonts = Toolkit.getDefaultToolkit().getFontList();
        c = new MyChoice11();
        for (int i = 0; i < fonts.length; i++) {
            c.add (fonts[i]);
        }
	add (c);
	c.addItemListener (this);
   }
    public void itemStateChanged(ItemEvent e)  {
	ItemSelectable ie = e.getItemSelectable();
	System.out.println ("State Change: " + ie.getSelectedObjects()[0]);
    }
}
