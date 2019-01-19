// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;
public class metrics extends Frame {
    metrics () {
        super ("metrics");
        setFont (new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 48));
        resize (225, 175);
    }
    public boolean handleEvent (Event e) {
        if (e.id == Event.WINDOW_DESTROY) {
            dispose();
            System.exit (1);
        }
        return super.handleEvent (e);
    }
    public void update (Graphics g) {
        paint(g);
    }
    public void paint (Graphics g) {
        g.translate (insets().left, insets().top);
        FontMetrics fm = null;
        int ascent, descent, leading, width1, width2, height;
        String string1 = "O'Reilly";
        String string2 = "�Reilly";
        int xPos = 25, yPos = 50;
        fm = g.getFontMetrics();
        ascent  = fm.getAscent();
        descent = fm.getDescent();
        leading = fm.getLeading();
        height  = fm.getHeight();
        width1  = fm.stringWidth (string1);
        width2  = fm.stringWidth (string2);
        g.drawString (string1, xPos, yPos);
        g.drawLine (xPos, yPos - ascent - leading,
                    xPos + width1, yPos - ascent - leading);
        g.drawLine (xPos, yPos - ascent,
                    xPos + width1, yPos - ascent);
        g.drawLine (xPos, yPos,
                    xPos + width1, yPos);
        g.drawLine (xPos, yPos + descent,
                    xPos + width1, yPos + descent);
        g.drawString (string2, xPos, yPos+height);
        g.drawLine (xPos, yPos - ascent - leading + height,
                    xPos + width2, yPos - ascent - leading + height);
        g.drawLine (xPos, yPos - ascent + height,
                    xPos + width2, yPos - ascent + height);
        g.drawLine (xPos, yPos + height,
                    xPos + width2, yPos + height);
        g.drawLine (xPos, yPos + descent + height,
                    xPos + width2, yPos + descent + height);

    }
    public static void main (String[] args) {
        Frame f = new metrics ();
        f.show();
    }
}
