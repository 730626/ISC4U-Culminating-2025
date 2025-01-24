/* Shachi Amin
 * January 19 2025
 * FifthScreen
 * Fifth game screen
 */

import javax.swing.*;

public class FifthScreen extends GameScreen {
    
    //constructor
    public FifthScreen() {
        super();
    }
    
    //Different cases for different screens
    @Override
    public void screen(int x) {
        switch(x){
           case 1:
               caseOne();
               break;
               
            case 2:
                caseTwo();
                break;
                
            default:
                caseThree();
                break;
        } //end switch
    }
    
    //First case
    public void caseOne() {

        //initalize and add text to screen
        JLabel message = new JLabel("In the rainforest, you see the strangest fruit. It smells really good. Do you eat it??");
        super.getPanel().add(message);
    
        //Initaizes & adds buttons to screen
        JButton b1 = new JButton("No, lets keep traveling");
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            EndScreen e3 = new EndScreen();
            e3.screen(2);
    
        });
        super.getPanel().add(b1);
    
        
        JButton b2 = new JButton("Yes");
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(7);
        });
        super.getPanel().add(b2);
        super.update();
    } //end caseOne
    
    //Second case
    public void caseTwo() {
        
        //Initalizes, adds, and formats label to screen
        JLabel result = new JLabel("<html>The castel is home to an old wizard. He promises the castle if you anwser his problem right. If not, he will turn you into a</html>");;
        super.getPanel().setLayout(new BoxLayout(super.getPanel(), BoxLayout.Y_AXIS)); 
        super.getPanel().add(result);
        
        // Randomly choose math problem & add to screen
        int b = super.RandomInt();
        
        if (b == 1) {
            m1();
        }

        else if (b == 2) {
            m2();
        }

        else {
            m3();
        }
    } //end caseTwo
    
    //Third case
    public void caseThree() {

        //initalizes & adds text to screen
        JLabel message = new JLabel("You survived!! Do you choose to settle down, or do you want to keep traveling the world?");
        super.getPanel().add(message);
    
        JButton b1 = new JButton("Settle down");
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            EndScreen e1 = new EndScreen();
            e1.screen(1);
    
        });
        super.getPanel().add(b1);
    
        // Button for Chest 2
        JButton b2 = new JButton("Travel the world");
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            EndScreen e2 = new EndScreen();
            e2.screen(1);
        });
        super.getPanel().add(b2);
        super.update();
    } //end caseThree
    
    //First math problem
    public void m1() {
        //Initalizes & adds math problem to screen
        JLabel q = new JLabel("110 - 100 / 5");
        super.getPanel().add(q);
        
        // Initialize & add buttons
        JButton b1 = new JButton("90");
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            EndScreen e4 = new EndScreen();
            e4.screen(3);
            
        });
        super.getPanel().add(b1);
   
        JButton b2 = new JButton("10");
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(8);
        });
        super.getPanel().add(b2);

        JButton b3 = new JButton("5");
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(8);
            
        });
        super.getPanel().add(b3);
        super.update();
    } //end m1
    
    //second math problem
    public void m2() {

        //initaizies & adds label to screen 
        JLabel q = new JLabel("66 / 6 - 6");
        super.getPanel().add(q);
        
        // Initialize & add buttons
        JButton b1 = new JButton("6");
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(8);
            
        });
        super.getPanel().add(b1);
   
        JButton b2 = new JButton("10");
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(8);
        });
        super.getPanel().add(b2);

        JButton b3 = new JButton("5");
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            EndScreen e5 = new EndScreen();
            e5.screen(3);
            
        });
        super.getPanel().add(b3);
        super.update();
    } //end m2
    
    //third math problem
    public void m3() {

        //initalizes & adds math problem to screen
        JLabel q = new JLabel("6 / 3 + 14");
        super.getPanel().add(q);
        
        // Initialize & add buttons
        JButton b1 = new JButton("90");
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(8);
            
        });
        super.getPanel().add(b1);
   
        JButton b2 = new JButton("16");
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            EndScreen e6 = new EndScreen();
            e6.screen(3);
        });
        super.getPanel().add(b2);

        JButton b3 = new JButton("5");
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(8);
            
        });
        super.getPanel().add(b3);
        super.update();
    } //end m3

} //end FifthScreen
