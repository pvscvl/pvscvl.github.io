// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

class MyTextField extends TextField {
    public MyTextField (String s, int len) {
	super (s, len);
	enableEvents (AWTEvent.ACTION_EVENT_MASK);
    }
    protected void processActionEvent(ActionEvent e) {
        System.out.println ("The current text is: " + e.getActionCommand());
        TextField tf = (TextField)e.getSource();
        StringBuffer sb = new StringBuffer (e.getActionCommand());
        tf.setText (sb.reverse().toString());
        super.processActionEvent(e)  ;
    }
}
public class text12 extends Applet {
   public void init () {
	TextField tf = new MyTextField ("Help Text", 20);
	add (tf);
   }
}

