/* Shachi Amin
 * January 13 2025
 * GameScreen
 * Template for all screens.
 */

import javax.swing.*;
import java.awt.*;

public abstract class GameScreen {
    private JPanel p;
    private JFrame f;

    public GameScreen() {
        this.makeFrame();
    }

    //Will be used to get a random int when needed
    public int RandomInt() {
        int n = (int)(Math.random() * 3) + 1;;
        return n;
    } //end random int

    //set frame visibility to false
    public void clearScreen(JFrame f) {
        f.setVisible(false);
        f.repaint();
        f.revalidate();
    }

    //Initalize & setVisibility of frame
    private void makeFrame() {
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.makePanel();
        JPanel addPane = this.getPanel();
        f.setContentPane(addPane);
        f.pack();
        f.setVisible(true);
    }

    //Initalize & setVisibility frame
    private void makePanel() {
        p = new JPanel();
        p.setPreferredSize(new Dimension(700, 500));
        p.setVisible(true);

    }

    //Retuns JPanel
    public JPanel getPanel() {
        return this.p;
    }

    //Returns JFrame
    public JFrame getFrame() {
        return this.f;
    }
    
    //updates frame after adding stuff
    public void update() {
        getFrame().repaint();
        getFrame().revalidate();
    }

    //Void that will print out screen. x is for different possibilites of the game
    public abstract void screen(int x);

}//class end
