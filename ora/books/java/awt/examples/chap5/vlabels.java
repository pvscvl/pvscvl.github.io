// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;

public class vlabels extends java.applet.Applet {
    public void init () {
        setLayout (new BorderLayout (10, 10));
        setFont (new Font ("TimesRoman", Font.BOLD, 12));
        add (new VerticalLabel ("One", 10, VerticalLabel.LEFT), "North");
        add (new VerticalLabel ("Two", 10, VerticalLabel.RIGHT), "South");
        add (new VerticalLabel ("Three"), "West");
        add (new VerticalLabel ("Four"), "East");
        add (new VerticalLabel ("Five"), "Center");
//        resize (preferredSize());
    }
}
