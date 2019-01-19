// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;
class dialogex extends Dialog {
    dialogex (Frame parent) {
        super (parent, false);
        Panel p = new Panel ();
        p.add (new Button ("Ok"));
        p.add (new Button ("Help"));
        add ("South", p);
        resize (200, 200);
    }
}
public class frameex extends Frame {
    frameex () {
	super ("My Frame");
        add ("North", new Button ("North"));
//        add ("South", new Button ("South"));
//        add ("East", new Button ("East"));
        add ("West", new Button ("West"));
        add ("Center", new Button ("Center"));
	resize (300, 300);
    }
    public static void main (String args[]) {
        frameex f = new frameex();
	FileDialog file = new FileDialog (f, "Open File...", FileDialog.LOAD);
        Dialog d = new dialogex (f);
	Menu m = new Menu ("File");
	MenuBar mb = new MenuBar ();
	mb.add (m);
	f.setMenuBar (mb);
	f.show();
	d.show();
	file.show();
    }
}
