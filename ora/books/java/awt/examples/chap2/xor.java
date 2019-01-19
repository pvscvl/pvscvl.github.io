// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;

public class xor extends java.applet.Applet {
    public void init () {
        setBackground (Color.red);
    }
    public void paint (Graphics g) {
        g.setColor (Color.green);
        g.setXORMode (Color.blue);
        g.fillRect (10, 10, 100, 100);
        g.fillRect (10, 60, 100, 100);

    }
}
