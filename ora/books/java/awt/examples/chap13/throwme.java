// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.AWTException;
import java.awt.AWTError;


public class throwme {

    public static void main (String[] args) {

	  System.out.println (System.getProperty ("awt.toolkit"));
        System.out.println (java.awt.Toolkit.getDefaultToolkit());
        System.out.println (new AWTError ("Never Gets Here"));

    }
}
