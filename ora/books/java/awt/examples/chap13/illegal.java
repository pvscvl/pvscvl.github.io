// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.TextField;
public class illegal {
    public static void main (String[] args) {
        new TextField().setCaretPosition (24);
        System.out.println ("Never got here");
    }
}
