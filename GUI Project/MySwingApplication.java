import javax.swing.*;
/**
 *Veronica Pratt
 *
 *1/31
 */
public class MySwingApplication implements Runnable 
{
    public JFrame jFrame; //declaring my instance variables
    public CanvasComponent canvasComponent;
    public void run(){
        jFrame = new JFrame("title"); //initializing jFrame
        jFrame.setSize(460, 460); //setting size of window
        canvasComponent = new CanvasComponent(230, 230); //initializing canvasComponent
        jFrame.add(canvasComponent);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true); //making jFrame visible
        jFrame.addKeyListener(canvasComponent);
    }
    public static void main(){
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing); 
        //calls methods I supply through interfaces, gives control  of my program to Swing. which then runs my run method
    }
}
