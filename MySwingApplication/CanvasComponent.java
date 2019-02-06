import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *Veronica Pratt
 */
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener
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
        setSize(width, height); //setting the size of my component to my input
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
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
    public void actionPerformed(){ 
        Dimension componentSizeDimension = getSize(); //sets this variable to the current size of the shape
    }
}
