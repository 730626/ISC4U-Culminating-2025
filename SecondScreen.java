/* Shachi Amin
 * January 14 2025
 * SecondScreen
 * Second screen of the game, assuming player did not die
 */

import javax.swing.*;

public class SecondScreen extends GameScreen {
    public SecondScreen() {
        super();
    }

    @Override
    public void screen(int x) {
        if (x == 1) {
            this.caseOne();            
        }

        else {
            this.caseTwo();
        }
    }

    //First case
    private void caseOne() {
        JLabel result = new JLabel("The chest had a sword");
        super.getPanel().add(result);

        JLabel l = new JLabel("You decide to leave the forest. There are 3 paths. Which do you choose?");
        super.getPanel().add(l);

        JButton b1 = new JButton("The steep cliff down to the beach");
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            ThirdScreen s = new ThirdScreen();
            s.screen(1);

        });
        super.getPanel().add(b1);
    
        JButton b2 = new JButton("The wooden bridge down to an old house");
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            ThirdScreen s = new ThirdScreen();
            s.screen(2);

        });
        super.getPanel().add(b2); 

        JButton b3 = new JButton("The trail down to the flower feilds");
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(2);

            });
        super.getPanel().add(b3);
        super.update();
    }

    //Second case
    private void caseTwo() {
        
        //Initalizing & adding text to screen
        JLabel result = new JLabel("The chest had some food. You choose to save it for later");
        super.getPanel().add(result);

        JLabel l = new JLabel("You decide to leave the forest. There are 3 paths. Which do you choose?");
        super.getPanel().add(l);

        //Initalinzing & adding buttons to screen
        
        JButton b1 = new JButton("The steep cliff down to the beach");
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            ThirdScreen s = new ThirdScreen();
            s.screen(3);

        });
        super.getPanel().add(b1);
    
        JButton b2 = new JButton("The wooden bridge down to an old house");
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            ThirdScreen s = new ThirdScreen();
            s.screen(4);

        });
        super.getPanel().add(b2); 

        JButton b3 = new JButton("The trail down to the flower feilds");
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(2);

        });
        super.getPanel().add(b3);
        super.update();

    } //end caseTwo

} //end class
