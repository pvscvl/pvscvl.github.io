// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;
import java.applet.*;
import sun.awt.OrientableFlowLayout;
public class buttonorient extends Applet {
    OrientableFlowLayout ofl;
    public void init () {
        setLayout (ofl = new OrientableFlowLayout(OrientableFlowLayout.VERTICAL));
System.out.println (ofl);
        add (new Button ("North"));
        add (new Button ("South"));
        add (new Button ("West"));
        add (new Button ("East"));
        add (new Button ("Center"));
        add (new Button ("North"));
        add (new Button ("South"));
        add (new Button ("West"));
        add (new Button ("East"));
        add (new Button ("Center"));
        add (new Button ("North"));
        add (new Button ("South"));
        add (new Button ("West"));
        add (new Button ("East"));
        add (new Button ("Center"));
   }
    public boolean action (Event e, Object o) {
        ofl.orientHorizontally();
        validate();
	  return false;
    }
}
