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


public class WoodyBuzzMeme extends JFrame {
    private ImageIcon image1;
    private JLabel label1;

public void WoodyBuzzMemeGUI() {
     JPanel pnl = new JPanel();
    
        
        image1 = new ImageIcon(getClass().getResource("woodybuzzEQ.jpg"));
        label1 = new JLabel(image1);
        add(pnl);
        
        
  
  
        WoodyBuzzMeme gui = new WoodyBuzzMeme();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pnl.add(label1);
        setVisible(true);
        pack();
        setTitle("Be mindful of the space you occupy and those around you");
        
               
    
}
}

 

