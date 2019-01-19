// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.*;

public class gridbag extends java.applet.Applet {

    public static void addComponent (Container container, Component component,
        int gridx, int gridy, int gridwidth, int gridheight, int fill,
        int anchor) throws AWTException {
        LayoutManager lm = container.getLayout();
        if (!(lm instanceof GridBagLayout)) {
            throw new AWTException ("Invalid layout" + lm);
        } else {
            GridBagConstraints gbc = new GridBagConstraints ();
            gbc.gridx = gridx;
            gbc.gridy = gridy;
            gbc.gridwidth = gridwidth;
            gbc.gridheight = gridheight;
            gbc.fill = fill;
            gbc.anchor = anchor;
            ((GridBagLayout)lm).setConstraints(component, gbc);
            container.add (component);
        }
    }

    public void init() {
	Button b;
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gb);
	try {
/* Row One - Three button */
            b = new Button ("One");
            addComponent (this, b, 0, 0, 1, 1, 
                GridBagConstraints.BOTH, GridBagConstraints.CENTER);
            b = new Button ("Two");
            addComponent (this, b, 1, 0, 1, 1, 
                GridBagConstraints.BOTH, GridBagConstraints.CENTER);
            b = new Button ("Three");
            addComponent (this, b, 2, 0, 1, 1, 
                GridBagConstraints.BOTH, GridBagConstraints.CENTER);

/* Row Two - Two buttons */
            b = new Button ("Four");
            addComponent (this, b, 0, 1, 2, 1, 
                GridBagConstraints.BOTH, GridBagConstraints.CENTER);
            b = new Button ("Five");
            addComponent (this, b, 2, 1, 1, 2,
                GridBagConstraints.BOTH, GridBagConstraints.CENTER);

/* Row Three - Two buttons */

            b = new Button ("Six");
            addComponent (this, b, 0, 2, 1, 1, 
                GridBagConstraints.BOTH, GridBagConstraints.CENTER);
            b = new Button ("Seven");
            addComponent (this, b, 1, 2, 1, 1, 
                GridBagConstraints.BOTH, GridBagConstraints.CENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
