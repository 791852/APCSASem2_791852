import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *Veronica Pratt
 */
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener, ActionListener, KeyListener
{
    public int xposition; //declaring my variables
    public int yposition;
    public int wideness;
    public int tallness;
    public int mouseFromX;
    public int mouseFromY;
    public boolean shapeSelected;
    public int animationDeltaX;
    public int animationDeltaY;
    public int gutterX;
    public int gutterY;
    public Timer animationTimer;
    public int motionSpeed;
    public CanvasComponent(int width, int height)
    {
        wideness = width; //initializing my variables to my input
        tallness = height;
        xposition =0;
        yposition =0;
        animationDeltaX = 1;
        animationDeltaY = 0;
        gutterX = 10;
        gutterY = 10;
        motionSpeed = 1;
        setSize(width, height); //setting the size of my component to my input
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        animationTimer = new Timer(20, this);
        animationTimer.start();
    }
    protected void paintComponent(Graphics g){
        g.setColor(Color.blue); //coloring part of my canvas blue with graphics class
        g.fillRect(xposition, yposition, 150, 150); //describing the shape I want to color in
    }
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){
        mouseFromX = e.getX(); //sets mouse position to the place at which it's clicked
        mouseFromY = e.getY(); 
        if(mouseFromX>=xposition && mouseFromX<=xposition+wideness&& mouseFromY>=yposition && mouseFromY<=yposition+tallness){
            shapeSelected = true; //sets this to true if the mouse is within the borders of the shape
        }
    }
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseDragged(MouseEvent e){
        if(shapeSelected){ //checking if the mouse is clicked within the shape
            int mouseToX = e.getX(); 
            int mouseToY = e.getY();
            xposition = mouseToX-mouseFromX; //sets the new position of the shape to where the mouse is clicked
            yposition = mouseToY-mouseFromY;
            repaint(); //repaints the shape to the new position
        }
    }
    public void mouseMoved(MouseEvent e){}
    public void actionPerformed(ActionEvent e){ 
        Dimension componentSizeDimension = getSize(); //sets this variable to the current size of the shape
        if(xposition+gutterX+wideness>componentSizeDimension.getWidth()){ //makes it bounce back from the right side
           animationDeltaY = 1; //moves the box down the side of the canvas
           animationDeltaX = 0; //makes sure the box does not move further to the right
           xposition = (int)(componentSizeDimension.getWidth()) - gutterX - wideness;
           yposition += animationDeltaY*motionSpeed; //changes yposition/xposition accordingly
        }
        if(yposition+gutterY+tallness > componentSizeDimension.getHeight()){ //makes it bounce back from the bottom
            animationDeltaX = -1; //moves object to the left
            animationDeltaY=0; //stops moving the object vertically
            yposition = (int)(componentSizeDimension.getHeight())-gutterY-tallness;
            xposition+=animationDeltaX*motionSpeed; //adjusts x and y position accordingly
        }
        if(xposition<gutterX){ //makes it bounce back from left side
            animationDeltaX = 0;
            animationDeltaY = -1;
            xposition = gutterX;
            yposition += animationDeltaY*motionSpeed;
        }
        if(yposition < gutterY){ //makes it bounce back from top side
            yposition = gutterY;
            animationDeltaX = 1;
            animationDeltaY =0;
            xposition += animationDeltaX*motionSpeed;
        }
        else{ //adjusts the x and y position throught the middle of the window so the object constantly moves at the user's speed
            xposition += animationDeltaX*motionSpeed;
            yposition += animationDeltaY*motionSpeed;
        }
        repaint(); //repaints the object so it actually is moved
    }
    public void keyTyped(KeyEvent e){
        char keyChar = e.getKeyChar();//checks what key the user presses
        if(keyChar == '+'){ //makes the object speed up if the user pushes a '+'
            motionSpeed += 1;
        }
        if(keyChar == '-' && motionSpeed > 0){ //makes the object slow down if the user pushes a '-'
            motionSpeed -= 1;
        }
    }
    public void keyPressed(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
}
