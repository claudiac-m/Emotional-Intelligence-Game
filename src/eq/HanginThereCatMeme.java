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


public class HanginThereCatMeme extends JFrame {
        private ImageIcon image1;
    private JLabel label1;

public void HanginThereCatGUI(String[] arg) {

    
        
        image1 = new ImageIcon(getClass().getResource("C://JedSmith//DesktopEQMemes//hangintherecatEQ.jpg"));
        label1 = new JLabel(image1);
        add(label1);
        
        
  
  
        HanginThereCat gui = new HanginThereCat();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Better Luck Next Time!");
    
}
}
