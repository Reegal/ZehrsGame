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
        String character = "", bgType, faceType;
        if (character.equals("Reegal") || character.equals("Jason") || character.equals("Colin") || character.equals("Gordon")) {
            bgType = "Dept";
        } else if (character.equals("Cutten") || character.equals("Andy")) {
            bgType = "Counter";
        } else {
            bgType = "DeptAlt";
        }
        try {
            BufferedImage bgImg = ImageIO.read(getClass().getResource("/zehrsgame/" + bgType + "_BG.jpg"));
            g2d.drawImage(bgImg,0,0,null);
            BufferedImage faceImg = ImageIO.read(getClass().getResource("/zehrsgame/" + character + "_Face.png"));
            g2d.drawImage(faceImg,100,40,null);
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
