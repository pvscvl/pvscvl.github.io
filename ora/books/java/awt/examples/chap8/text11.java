// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

class MyAL implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println ("The current text is: " + e.getActionCommand());
        if (e.getSource() instanceof TextField) {
            TextField tf = (TextField)e.getSource();
            StringBuffer sb = new StringBuffer (e.getActionCommand());
            tf.setText (sb.reverse().toString());
        }
    }
}
public class text11 extends Applet {
   public void init () {
	TextField tf = new TextField ("Help Text", 20);
	add (tf);
	tf.addActionListener (new MyAL());
   }
}
