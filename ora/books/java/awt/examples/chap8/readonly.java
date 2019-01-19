// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;
import java.applet.*;
public class readonly extends Applet {
	TextArea area;
	Label label;
	public void init () {
                setLayout (new BorderLayout (10, 10));
                add ("South", new Button ("toggleState"));
                add ("Center", area = new TextArea ("Help Me", 5, 10));
                add ("North", label = new Label ("Editable", Label.CENTER));
	}
	public boolean action (Event e, Object o) {
		if (e.target instanceof Button) {
                        if ("toggleState".equals(o)) {
                                area.setEditable (!area.isEditable ());
                                label.setText ((area.isEditable () ?
                                         "Editable" : "Read-only"));
                                return true;
			}
		}
		return false;
	}
}
