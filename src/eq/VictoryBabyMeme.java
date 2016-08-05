/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eq;

import java.awt.*;
import javax.swing.*;

public class VictoryBabyMeme extends JFrame {
    private ImageIcon image1;
    private JLabel label1;

public void VictoryBabyMemeGUI() {
        
     JPanel pnl = new JPanel();
    
        
        image1 = new ImageIcon(getClass().getResource("victorybabyEQ.jpg"));
        label1 = new JLabel(image1);
        add(pnl);
        
        
  
  
        VictoryBabyMeme gui = new VictoryBabyMeme();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pnl.add(label1);
        setVisible(true);
        pack();
        setTitle("Congratulations!");
    
}
}


