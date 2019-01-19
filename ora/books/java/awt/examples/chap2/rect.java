// This example is from the book _Java AWT Reference_ by John Zukowski.
// Written by John Zukowski.  Copyright (c) 1997 O'Reilly & Associates.
// You may study, use, modify, and distribute this example for any purpose.
// This example is provided WITHOUT WARRANTY either expressed or
import java.awt.Rectangle;
public class rect {
    public static void main (String[] args) {
        Rectangle r = new Rectangle (100, 100, 200, 200);
        System.out.println (r);
        r.grow (50, 75);
        System.out.println (r);
        r.grow (-25, -50);
        System.out.println (r);
    }
}
