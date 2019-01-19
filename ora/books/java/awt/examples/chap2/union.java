// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;
public class union extends Frame {
    Rectangle r = new Rectangle (50, 50, 100, 100);
    Rectangle r1 = new Rectangle (100, 100, 75, 75);
    union () {
        super ("Union");
        resize (250, 250);
    }
    public void paint (Graphics g) {
            g.setColor (Color.lightGray);
            Rectangle r2 = r.union (r1);
            g.fillRect (r2.x, r2.y, r2.width, r2.height);
            g.setColor (Color.black);
            g.drawRect (r.x, r.y, r.width, r.height);
            g.drawRect (r1.x, r1.y, r1.width, r1.height);
    }
    public static void main (String [] args) {
        Frame f = new union ();
        f.show();
    }
}
