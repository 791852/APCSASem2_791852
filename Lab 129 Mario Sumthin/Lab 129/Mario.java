
/**
 *Veronica Pratt
 *1/29/19
 */
public class Mario extends Character
{
     public Mario(String catchPhrase, int speed)
    {
        super(catchPhrase, speed);
    }
    public void setSpeed(int fastness){
        super.setSpeed(fastness*2);
    }
}
