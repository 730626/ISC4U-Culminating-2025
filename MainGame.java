/* Shachi Amin
 * January 20 2025
 * MainGame
 * Introduction screen: Welcomes user to game and explains how it works.
 */

import javax.swing.*;
import java.awt.*;

public class MainGame extends GameScreen {
    public MainGame() {
        super();
        screen(1);
    }

    //Produces welcome message & Start button
    @Override
    public void screen(int x) {
        JLabel message = new JLabel("<html><div style='text-align:center;'>"
                                + "Welcome to choose your own adventure!!<br>"
                                + "You will choose different options to write your own story.<br>"
                                + "The rules are simple: Read the scenario, and click a button to choose what you do next.<br>"
                                + "Click the start button when you are ready.<br>"
                                + "Have fun!!!</div></html>", SwingConstants.CENTER);
    
        // Create the start button
        JButton b1 = new JButton("Start");
    
        // Action listener for the button
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FirstScreen f = new FirstScreen();
        });
    
    
        // Add space between the components
     
        super.getPanel().add(message);
        super.getPanel().add(b1);
        super.update();
        }

    //Main class
    public static void main (String[]  args ) {
        MainGame m = new MainGame();
    }
}
