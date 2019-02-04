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
    public CanvasComponent(int width, int height)
    {
        wideness = width; //initializing my variables to my input
        tallness = height;
        setSize(width, height); //setting the size of my component to my input
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }
    protected void paintComponent(Graphics g){
        g.setColor(Color.blue); //coloring part of my canvas blue with graphics class
        g.fillRect(35, 45, 150, 150); //describing the shape I want to color in
    }
    public void mouseClicked(MouseEvent e){
        mouseFromX = e.getX();
        mouseFromY = e.getY();
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseDragged(MouseEvent e){
        int mouseToX = xposition;
        int mouseToY = yposition;
    }
    public void mouseMoved(MouseEvent e){}
}
