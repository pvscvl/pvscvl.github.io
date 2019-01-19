// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;

public class clipping extends java.applet.Applet {
    public void paint (Graphics g) {
        g.setColor (Color.red);
        Graphics clippedGraphics = g.create();
        clippedGraphics.drawRect (0,0,100,100);
        clippedGraphics.clipRect (25, 25, 50, 50);
        clippedGraphics.drawLine (0,0,100,100);
        clippedGraphics.dispose();
        clippedGraphics=null;
        g.drawLine (0,100,100,0);
    }
}
