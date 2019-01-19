// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;

public class buttons extends java.applet.Applet {
  int align = 0;
  public void init () {
    String []fonts;
    setLayout (new FlowLayout (FlowLayout.CENTER, 0, 20));
    fonts = Toolkit.getDefaultToolkit().getFontList();
    for (int i = 0; i < fonts.length; i++) {
      add (new Button (fonts[i]));
    }
  }
  public boolean action (Event e, Object o) {
    setLayout (new FlowLayout((align++) % 3));
    validate();
    return true;
  }
}
