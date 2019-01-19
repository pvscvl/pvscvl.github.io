// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.applet.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
public class grab extends Applet {
    Image i;
    PixelGrabber pg;
    public void init () {
        i = getImage (getDocumentBase(), "ora-icon.gif");
        pg  = new PixelGrabber (i, 0, 0, -1, -1, false);
        pg.startGrabbing();
        enableEvents (AWTEvent.MOUSE_EVENT_MASK);
    }
    public void paint (Graphics g) {
        g.drawImage (i, 10, 10, this);
    }
    protected void processMouseEvent(MouseEvent e) {
        if (e.getID() == MouseEvent.MOUSE_CLICKED) {
            System.out.println ("Status: " + pg.getStatus());
            System.out.println ("Width:  " + pg.getWidth());
            System.out.println ("Height: " + pg.getHeight());
            System.out.println ("Pixels: " + 
                (pg.getPixels() instanceof byte[] ? "bytes" : "ints"));
            System.out.println ("Model:  " + pg.getColorModel());
        }
        super.processMouseEvent (e);
    }
}