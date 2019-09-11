
package swingopenimage;

import javax.imageio.ImageIO;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingOpenImage {
    public SwingOpenImage(String filePath){
        SwingUtilities.invokeLater(new Runnable(){
            
            public void run(){
                String filePath = null;
                JFrame frame= new JFrame(filePath);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                BufferedImage img= null;
                try{
                   img= ImageIO.read(new File(filePath));
                   
                } catch (IOException ex) {
                    Logger.getLogger(SwingOpenImage.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                JLabel lbl =new JLabel();
                lbl.setIcon(new ImageIcon(img));
                frame.getContentPane().add(lbl, BorderLayout.CENTER);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
            }
            
        });
        
    }
    
    public static void main(String[] args){
        SwingOpenImage swingOpenImage = new SwingOpenImage("C:\\Users\\Sebastian\\Desktop\\TEC SHIT\\ALGORITMOS\\Sasha.jpg");
    }

   
    }
    
    

   
    

