/* Shachi Amin
 * January 16 2025
 * ThirdScreen
 * Third part of the game
 */

import javax.swing.*;
import java.awt.*;

public class ThirdScreen extends GameScreen {
    public ThirdScreen() {
        super();
    }

    //Breaks off different cases
    @Override
    public void screen(int x) {
        switch(x) {
            case 1:
                this.caseOne();
                break;
            case 2:
                this.caseTwo();
                break;
            case 3:
                this.caseThree();
                break;
            default:
                this.caseFour();
                break;
        }
    } //end screen

    //First case
    private void caseOne() {
        // Make & add prompt to screen
        JLabel result = new JLabel("<html>You encounter a HUNGRY sea-monster, & you prepare for battle. Answer the math problem to determine your fate.</html>");
        result.setPreferredSize(new Dimension(400, 60));
        super.getPanel().setLayout(new BoxLayout(super.getPanel(), BoxLayout.Y_AXIS));
        super.getPanel().add(result);
        
        // Randomly choose math problem & add to screen
        int b = super.RandomInt();
        
        //First possible math problem
        if (b == 1) {
            m1();
        }

        //Second possible case
        else if (b == 2) {
            m2();
        }

        //Final possible math problem
        else {
            m3();
        }
    } //end caseOne

    //Second case
    private void caseTwo() {
        // Make & add prompt to screen
        JLabel result = new JLabel("<html>In the old house lives a witch! Answer her riddles to determine your fate.</html>");
        result.setPreferredSize(new Dimension(400, 60)); 
        super.getPanel().setLayout(new BoxLayout(super.getPanel(), BoxLayout.Y_AXIS)); 
        super.getPanel().add(result);
        
        // Randomly choose riddle & add to screen
        int b = super.RandomInt();
        
        //First possible riddle
        if (b == 1) {
            r1();
        }

        //Second possible riddle
        else if (b == 2) {
            r2();
        }

        //Third possible riddle
        else {
            r3();
        }
    } //end caseTwo

    //Third case
    private void caseThree() {
        // Make & add prompt to screen
        JLabel result = new JLabel("<html>The beach is home to a HUNGRY sea-monster. You give it some of your food and continue on your way. Where do you go?</html>");
        result.setPreferredSize(new Dimension(400, 60)); // Ensure the text fits
        super.getPanel().setLayout(new BoxLayout(super.getPanel(), BoxLayout.Y_AXIS)); // Use BoxLayout for vertical arrangement
        super.getPanel().add(result);
        
        // Initialize & add buttons
        JButton b1 = new JButton("The mountain peak");
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FourthScreen s = new FourthScreen();
            s.screen(3);
        });
        super.getPanel().add(b1);
   
        JButton b2 = new JButton("The desert temple, that is home to immortality.");
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(5);
        });
        super.getPanel().add(b2);

        JButton b3 = new JButton("The bridge that dips into the fog");
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FourthScreen s = new FourthScreen();
            s.screen(4);
        });
        super.getPanel().add(b3);
        super.update();
    } //end caseThree

    //Fourth case
    private void caseFour() {
        // Make & add prompt to screen
        JLabel result = new JLabel("<html>In the old house lives a witch! You give her food in exchange for your life. Where do you go now?</html>");
        result.setPreferredSize(new Dimension(400, 60)); // Ensure the text fits
        super.getPanel().setLayout(new BoxLayout(super.getPanel(), BoxLayout.Y_AXIS)); // Use BoxLayout for vertical arrangement
        super.getPanel().add(result);
        
        // Initialize & add buttons
        JButton b1 = new JButton("The mountain peak");
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FourthScreen s = new FourthScreen();
            s.screen(3);
        });
        super.getPanel().add(b1);
   
        JButton b2 = new JButton("The desert, where there is a legendary treasure that gives you immortality.");
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(5);
        });
        super.getPanel().add(b2);

        JButton b3 = new JButton("The bridge that dips into the fog");
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FourthScreen f = new FourthScreen();
            f.screen(4);
        });
        super.getPanel().add(b3);
        super.update();
    }//end caseFout

    //First problem
    private void m1() {
        //Initalize & add math problem
        JLabel q = new JLabel("5 *(4 + 3) - 6");
        super.getPanel().add(q);
        
        // Initialize & add buttons
        JButton b1 = new JButton("29");
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FourthScreen s = new FourthScreen();
            s.screen(1);
        });
        super.getPanel().add(b1);
   
        JButton b2 = new JButton("6");
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(3);
        });
        super.getPanel().add(b2);

        JButton b3 = new JButton("3");
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(3);
        });
        super.getPanel().add(b3);
        super.update();
    } //end m1

    //Second problem
    private void m2() {
        //Initalize & add math problem
        JLabel q = new JLabel("(6^2 - 4 * 3) / 2");
        super.getPanel().add(q);
        
        // Initialize & add buttons
        JButton b1 = new JButton("12");
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FourthScreen s = new FourthScreen();
            s.screen(1);
        });
        super.getPanel().add(b1);
   
        JButton b2 = new JButton("9");
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(3);
        });
        super.getPanel().add(b2);

        JButton b3 = new JButton("-17");
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(3);
        });
        super.getPanel().add(b3);
        super.update();
    } //end m2

    //Third problem
    private void m3() {
        JLabel q = new JLabel("12 + (8 - 3)^2 ");
        super.getPanel().add(q);
        
        // Initialize & add buttons
        JButton b1 = new JButton("37");
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FourthScreen s = new FourthScreen();
            s.screen(1);
        });
        super.getPanel().add(b1);
   
        JButton b2 = new JButton("39");
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(3);
        });
        super.getPanel().add(b2);

        JButton b3 = new JButton("15");
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(3);
        });
        super.getPanel().add(b3);
        super.update();
    } //end m3

    //First riddle
    private void r1() {
        JLabel q = new JLabel("The riddle: I come once in a minute, twice in a moment, but never in a thousand years. What am I?");
        super.getPanel().add(q);
        
        // Initialize & add buttons
        JButton b1 = new JButton("The letter M");
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FourthScreen s = new FourthScreen();
            s.screen(2);
        });
        super.getPanel().add(b1);
   
        JButton b2 = new JButton("IDK this is a game");
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(4);
        });
        super.getPanel().add(b2);

        JButton b3 = new JButton("The present");
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(4);
        });
        super.getPanel().add(b3);
        super.update();
    }//end r1

    //Second riddle
    private void r2() {
        JLabel q = new JLabel("The riddle: What has keys but cannot open locks?");
        super.getPanel().add(q);
        
        // Initialize & add buttons
        JButton b1 = new JButton("A piano");
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FourthScreen s = new FourthScreen();
            s.screen(1);
        });
        super.getPanel().add(b1);
   
        JButton b2 = new JButton("A keychain");
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(4);
        });
        super.getPanel().add(b2);

        JButton b3 = new JButton("Trick question! Nothing like that exists!");
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(4);
        });
        super.getPanel().add(b3);
        super.update();
    } //end r2

    //Third riddle
    private void r3() {
        JLabel q = new JLabel("The riddle: The more you take, the more you leave behind. What am I?");
            super.getPanel().add(q);
            
            // Initialize & add buttons
            JButton b1 = new JButton("Footsteps");
            b1.addActionListener(e -> {
                super.clearScreen(super.getFrame());
                FourthScreen s = new FourthScreen();
                s.screen(1);
            });
            super.getPanel().add(b1);
       
            JButton b2 = new JButton("Time");
            b2.addActionListener(e -> {
                super.clearScreen(super.getFrame());
                FourthScreen t = new FourthScreen();
                t.screen(2);
            });
            super.getPanel().add(b2);
    
            JButton b3 = new JButton("No clue :(");
            b3.addActionListener(e -> {
                super.clearScreen(super.getFrame());
                DieScreen d = new DieScreen();
                d.screen(4);
            });
            super.getPanel().add(b3);
            super.update();
    } //end r3

} //end ThirdScreen
