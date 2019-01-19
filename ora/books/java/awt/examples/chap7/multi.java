// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;

public class multi extends java.applet.Applet {

        public void init() {

                Panel s = new Panel();
                Panel e = new Panel();

                setLayout (new BorderLayout ());
                add ("North", new Label ("Enter text", Label.CENTER));
                add ("Center", new TextArea ());
                e.setLayout (new GridLayout (0,1));
                e.add (new Button ("Reformat"));
                e.add (new Button ("Spell Check"));
                e.add (new Button ("Options"));
                add ("East", e);

                s.setLayout (new FlowLayout ());
                s.add (new Button ("Save"));
                s.add (new Button ("Cancel"));
                s.add (new Button ("Help"));
                add ("South", s);

        }

}
