// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;
public class star extends java.applet.Applet {
    public void paint (Graphics g) {
        g.setFont (new Font ("Helvetica", Font.BOLD, 20));
        g.drawString ("Hi", 112, 112);
        g.setColor (Color.red);
        g.drawLine (50, 75, 200, 75);
        g.drawLine (125, 25, 75, 175);
        g.drawLine (125, 25, 175, 175);
        g.drawLine (50, 75, 175, 175);
        g.drawLine (75, 175, 200, 75);
    }
    public void update (Graphics g) {
        paint (g);
    }
}
