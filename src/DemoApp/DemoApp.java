package DemoApp;

import processing.core.PApplet;

public class DemoApp extends PApplet {


    //main method needed on Windows (Win11 - JDK 17.0.4) - not on macOS (?)
    public static void main(String args[]) {
        PApplet.main(new String[] { DemoApp.class.getName() });
    }
    public void draw(){
        line(25,25,50,50);
    }
}
