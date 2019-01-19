// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
class TextFieldSetter implements ActionListener {
    TextField tf;
    TextFieldSetter (TextField tf) {
        this.tf = tf;
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals ("Set")) {
            tf.setText ("Hello");
        }
    }
}
public class text13 extends Applet implements TextListener {
    TextField tf;
    int i=0;
    public void init () {
        Button b;
        tf = new TextField ("Help Text", 20);
        add (tf);
        tf.addTextListener (this);
        add (b = new Button ("Set"));
        b.addActionListener (new TextFieldSetter (tf));
    }
    public void textValueChanged(TextEvent e) {
        System.out.println (++i + ": " + e);
    }
}
