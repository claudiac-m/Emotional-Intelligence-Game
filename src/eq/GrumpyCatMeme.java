/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eq;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Claws
 */
//extending the JFrame enables this class to be GUI 
public class GrumpyCatMeme extends JFrame {
    private ImageIcon image1;
    private JLabel label1;
    //creates imageicon and label on which to place image 

public void GrumpyCatMemeGUI() {
    JPanel pnl = new JPanel();
    
        
        image1 = new ImageIcon(getClass().getResource("grumpycatEQ.jpg"));
        label1 = new JLabel(image1);
        add(pnl);
        
        
  
  
        GrumpyCatMeme gui = new GrumpyCatMeme();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pnl.add(label1);
        setVisible(true);
        pack();
        setTitle("Don't make grumpt cat mad! ");
            
  
}
}

 

