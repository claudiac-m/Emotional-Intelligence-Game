/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eq;

import java.awt.*;
import javax.swing.*;



public class HanginThereCatMeme extends JFrame {
        private ImageIcon image1;
    private JLabel label1;

public void HanginThereCatGUI() {
        
      JPanel pnl = new JPanel();
    
        
        image1 = new ImageIcon(getClass().getResource("hangintherecatEQ.jpg"));
        label1 = new JLabel(image1);
        add(pnl);
        
        
  
  
        HanginThereCatMeme gui = new HanginThereCatMeme();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pnl.add(label1);
        setVisible(true);
        pack();
        setTitle("Better Luck Next Time!");
    
}
}
