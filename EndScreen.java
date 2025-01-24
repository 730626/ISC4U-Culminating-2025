/* Shachi Amin
 * January 19 2025
 * EndScreen
 * Final screen of the game, assuming the player has not died 
 */

import javax.swing.*;

public class EndScreen extends GameScreen {
    
    //constructor
    public EndScreen() {
        super();
    }
    
    @Override
    public void screen(int x) {

        //Different ways games ends
        if (x == 1) {
            JLabel j = new JLabel("You find a nice place to live & live happily ever after");
            super.getPanel().add(j);
        } //end if
        
        else if (x == 2) {
            JLabel j = new JLabel("You live your life traveling the world");
            super.getPanel().add(j);
        } //end else if 
        
        else {
            JLabel j = new JLabel("The wizard was pleased and you live happily in the castle");
            super.getPanel().add(j);
        } //end else
        
        //Restart note
        JLabel message = new JLabel("Restart?");
        super.getPanel().add(message);
        
        //Restart button
        JButton b1 = new JButton("Yes");
        b1.addActionListener(e -> {
             super.clearScreen(super.getFrame());
                 FirstScreen f = new FirstScreen();
         });
        super.getPanel().add(b1);
     
        //end game option
        JButton b2 = new JButton("No");
        b2.addActionListener(e -> {
            System.exit(0);
        });
        super.getPanel().add(b2);
        super.update();
    } //end screen

} //end class
