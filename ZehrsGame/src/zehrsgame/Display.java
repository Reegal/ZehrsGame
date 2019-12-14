package zehrsgame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Display extends JPanel{
    
    
     private void doDrawing(Graphics g) {    
        Graphics2D g2d = (Graphics2D) g;
        try {
            BufferedImage menuImg = ImageIO.read(getClass().getResource("/zehrsgame/Dept_BG.jpg"));
            g2d.drawImage(menuImg,0,0,null);
        } catch (IOException e) {
            g2d.drawString("Error: " + e, 10, 10);
        }
        
    }
     
    //overrides paintComponent in JPanel class
    //performs custom painting
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);//does the necessary work to prepare the panel for drawing
        doDrawing(g);
    }
}
