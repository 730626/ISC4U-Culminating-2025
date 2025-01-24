/* Shachi Amin
 * January 20 2025
 * DieScreen
 * Screen the user will see if they die in game
 */

import javax.swing.*;

public class DieScreen extends GameScreen {
    public DieScreen() {
        super();
    }
    
    //Different cases of death print out different labels. 
    @Override
    public void screen(int x) {
        switch(x) {
            case 1:
                c1();
                break;
            case 2:
                c2();
                break;
            case 3:
                c3();
                break;
            case 4:
                c4();
                break;
            case 5:
                c5();
                break;
            case 6: 
                c6();
                break;
            case 7:
                c7();
                break;
            default:
                c8();
                break;
        } //end switch
        
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
     
         //end game button
         JButton b2 = new JButton("No");
         b2.addActionListener(e -> {
             super.clearScreen(super.getFrame());
             System.exit(0);
         });
         super.getPanel().add(b2);
         super.update();
    } //end screen
    
    //Differnt scenarios of how player dies. Each method initalizes message & adds it to screen
    public void c1() {
        JLabel message = new JLabel("You open the chest and snakes pop up at you. You died");
        super.getPanel().add(message);
    } //end c1
    
    public void c2() {
        JLabel message = new JLabel("The beautiful smell of the flowers put you in a deep sleep. You died");
        super.getPanel().add(message);
    } //end c2
    
    public void c3() {
        JLabel message = new JLabel("The seamonster eats you. You died");
        super.getPanel().add(message);
    } //end c3
    
    public void c4() {
        JLabel message = new JLabel("The witch kills you and turns you into soup");
        super.getPanel().add(message);
    } //end c4
    
    public void c5() {
        JLabel message = new JLabel("In the temple, you get crushed by rocks and died");
        super.getPanel().add(message);
    } //end c5
    
    public void c6() {
        JLabel message = new JLabel("Your ship breaks and you drown at sea.");
        super.getPanel().add(message);
    } //end c6
    
    public void c7() {
        JLabel message = new JLabel("The weird fruit kills you.");
        super.getPanel().add(message);
    } //end c7
    
    public void c8() {
        JLabel message = new JLabel("The wizard turns you into a frog");
        super.getPanel().add(message);
    } //end c8
    
} //end DieScreen
