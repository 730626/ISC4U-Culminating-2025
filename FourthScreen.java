/* Shachi Amin
 * January 19 2025
 * FourthScreen
 * Fourth Screen the user will see
 */

import javax.swing.*;

public class FourthScreen extends GameScreen {

    // Constructor
    public FourthScreen() {
        super();
    }

    // Sends different cases to different methods
    @Override
    public void screen(int x) {
        // Set the panel layout to BoxLayout (vertical alignment)
        super.getPanel().setLayout(new BoxLayout(super.getPanel(), BoxLayout.Y_AXIS));
        
        switch (x) {
            case 1:
                caseOne();
                break;
            case 2:
                caseTwo();
                break;
            case 3:
                caseThree();
                break;
            default:
                caseFour();
                break;
        } // end switch
    } // end screen

    // First case
    private void caseOne() {
        JLabel message = new JLabel("You won the battle!! Now where will you go?");
        message.setAlignmentX(JLabel.CENTER_ALIGNMENT); // Center-align text
        super.getPanel().add(message);

        JButton b1 = new JButton("The sea");
        b1.setAlignmentX(JButton.CENTER_ALIGNMENT); // Center-align button
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(6);
        });
        super.getPanel().add(b1);

        JButton b2 = new JButton("The rainforest");
        b2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FifthScreen f = new FifthScreen();
            f.screen(1);
        });
        super.getPanel().add(b2);

        JButton b3 = new JButton("The abandoned castle");
        b3.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FifthScreen f = new FifthScreen();
            f.screen(2);
        });
        super.getPanel().add(b3);

        super.update();
    } // end caseOne

    // Second case
    private void caseTwo() {
        JLabel result = new JLabel("<html>The witch lets you go but asks you to get her mushrooms. Answer the riddle right to see if you picked the right one</html>");
        result.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        super.getPanel().add(result);

        int b = super.RandomInt();

        if (b == 1) {
            r1();
        } else if (b == 2) {
            r2();
        } else {
            r3();
        }
    } // end caseTwo

    // Third case
    private void caseThree() {
        JLabel message = new JLabel("You made it to the top. Everything looks beautiful. Where will you go now?");
        message.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        super.getPanel().add(message);

        JButton b1 = new JButton("The sea");
        b1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(6);
        });
        super.getPanel().add(b1);

        JButton b2 = new JButton("The rainforest");
        b2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FifthScreen f = new FifthScreen();
            f.screen(1);
        });
        super.getPanel().add(b2);

        JButton b3 = new JButton("The abandoned castle");
        b3.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FifthScreen f = new FifthScreen();
            f.screen(2);
        });
        super.getPanel().add(b3);

        super.update();
    } // end caseThree

    // Fourth case
    private void caseFour() {
        JLabel result = new JLabel("<html>Under the bridge lives an ugly troll! He will let you live if you answer his question right</html>");
        result.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        super.getPanel().add(result);

        int b = super.RandomInt();

        if (b == 1) {
            r1();
        } else if (b == 2) {
            r2();
        } else {
            r3();
        }
    } // end caseFour

    // First riddle
    private void r1() {
        JLabel q = new JLabel("The riddle: What has to be broken before you use it?");
        q.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        super.getPanel().add(q);

        JButton b1 = new JButton("An egg");
        b1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FifthScreen f = new FifthScreen();
            f.screen(3);
        });
        super.getPanel().add(b1);

        JButton b2 = new JButton("??");
        b2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(4);
        });
        super.getPanel().add(b2);

        JButton b3 = new JButton("A rock");
        b3.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(4);
        });
        super.getPanel().add(b3);

        super.update();
    } // end r1

    // Second riddle
    private void r2() {
        JLabel q = new JLabel("The riddle: What is full of holes but still holds water?");
        q.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        super.getPanel().add(q);

        JButton b1 = new JButton("A bucket with a hole");
        b1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(4);
        });
        super.getPanel().add(b1);

        JButton b2 = new JButton("A sponge");
        b2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FifthScreen f = new FifthScreen();
            f.screen(3);
        });
        super.getPanel().add(b2);

        JButton b3 = new JButton("A straw");
        b3.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(4);
        });
        super.getPanel().add(b3);

        super.update();
    } // end r2

    // Third riddle
    private void r3() {
        JLabel q = new JLabel("The riddle: What can you break, even if you never touch it?");
        q.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        super.getPanel().add(q);

        JButton b1 = new JButton("Glass");
        b1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(4);
        });
        super.getPanel().add(b1);

        JButton b2 = new JButton("A promise");
        b2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            FifthScreen f = new FifthScreen();
            f.screen(3);
        });
        super.getPanel().add(b2);

        JButton b3 = new JButton("Nothing like that exists");
        b3.setAlignmentX(JButton.CENTER_ALIGNMENT);
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(4);
        });
        super.getPanel().add(b3);

        super.update();
    } // end r3
} // end class
