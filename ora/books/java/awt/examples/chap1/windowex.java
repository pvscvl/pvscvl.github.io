// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;
public class windowex extends Frame {
    public static void main (String args[]) {
	Frame f = new Frame ();
	f.show();
	Window w = new Window (f);
	w.add ("North", new Label ("This is a Warning Message"));
	w.add ("South", new Button ("Ok"));
        w.setBackground (Color.gray);
	w.resize (200, 200);
	w.show();
    }
}
