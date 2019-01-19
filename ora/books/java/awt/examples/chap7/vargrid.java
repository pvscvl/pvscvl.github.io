// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;
import java.applet.*;
import sun.awt.VariableGridLayout;
public class vargrid extends Applet {

        public void init () {

                VariableGridLayout vgl;
                setLayout (vgl = new VariableGridLayout (3,3));
                vgl.setRowFraction (0, 1.0/2.0);
                vgl.setRowFraction (1, 1.0/4.0);
                vgl.setRowFraction (2, 1.0/4.0);
                vgl.setColFraction (0, 1.0/2.0);
                vgl.setColFraction (1, 1.0/4.0);
                vgl.setColFraction (2, 1.0/4.0);

                add (new Button ("One"));
                add (new Button ("Two"));
                add (new Button ("Three"));
                add (new Button ("Four"));
                add (new Button ("Five"));
                add (new Button ("Six"));
                add (new Button ("Seven"));
                add (new Button ("Eight"));
                add (new Button ("Nine"));
        }

}
