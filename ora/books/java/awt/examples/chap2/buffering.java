// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;
import java.applet.*;
public class buffering extends Applet {
    Image im;
    Graphics buf;
    int pass=0;
    public void init () {
        // Create buffer
        im = createImage (size().width, size().height);
        // Get its graphics context
        buf = im.getGraphics();
	// Draw Board Once
        buf.setColor (Color.red);
        buf.drawLine (  0,  50, 150,  50);
        buf.drawLine (  0, 100, 150, 100);
        buf.drawLine ( 50,   0,  50, 150);
        buf.drawLine (100,   0, 100, 150);
        buf.setColor (Color.black);
    }
    public void paint (Graphics g) {
        // Draw image - changes are written onto buf
        g.drawImage (im, 0, 0, this);
        // Make a move
        switch (pass) {
            case 0:
                buf.drawLine (50, 50, 100, 100);
                buf.drawLine (50, 100, 100, 50);
                break;
            case 1:
                buf.drawOval (0, 0, 50, 50);
                break;
            case 2:
                buf.drawLine (100, 0, 150, 50);
                buf.drawLine (150, 0, 100, 50);
                break;
            case 3:
                buf.drawOval (0, 100, 50, 50);
                break;
            case 4:
                buf.drawLine (0, 50, 50, 100);
                buf.drawLine (0, 100, 50, 50);
                break;
            case 5:
                buf.drawOval (100, 50, 50, 50);
                break;
            case 6:
                buf.drawLine (50,  0, 100, 50);
                buf.drawLine (50, 50, 100,  0);
                break;
            case 7:
                buf.drawOval (50, 100, 50, 50);
                break;
            case 8:
                buf.drawLine (100, 100, 150, 150);
                buf.drawLine (150, 100, 100, 150);
                break;
        }
        pass++;
        if (pass <= 9)
            repaint (500);
    }
}
