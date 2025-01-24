/* Shachi Amin
 * January 13 2025
 * FirstScreen
 * This is the first screen the user will see once they start the game.
 */

import javax.swing.*;

public class FirstScreen extends GameScreen {
    public FirstScreen() {
        super();
        this.screen(1);
    }

    @Override
    public void screen(int x) {
        super.getPanel().setLayout(new BoxLayout(super.getPanel(), BoxLayout.Y_AXIS));

        JLabel message = new JLabel("You wake up in a dense forest. In front of you are 3 chests. Which will you open?");
        message.setAlignmentX(JLabel.CENTER_ALIGNMENT); 
        super.getPanel().add(message);

        // Button for chest 1
        JButton b1 = new JButton("Chest 1");
        b1.setAlignmentX(JButton.CENTER_ALIGNMENT); // Center-align the button
        b1.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            SecondScreen s = new SecondScreen();
            s.screen(1);
        });
        super.getPanel().add(b1);

        // Button for chest 2
        JButton b2 = new JButton("Chest 2");
        b2.setAlignmentX(JButton.CENTER_ALIGNMENT); 
        b2.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            SecondScreen t = new SecondScreen();
            t.screen(2);
        });
        super.getPanel().add(b2);

        // Button for chest 3
        JButton b3 = new JButton("Chest 3");
        b3.setAlignmentX(JButton.CENTER_ALIGNMENT); 
        b3.addActionListener(e -> {
            super.clearScreen(super.getFrame());
            DieScreen d = new DieScreen();
            d.screen(1);
        });
        super.getPanel().add(b3);

        super.update();
    } // end screen
} // end class
