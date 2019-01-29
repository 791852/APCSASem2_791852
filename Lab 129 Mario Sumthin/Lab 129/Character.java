
/**
 *Veronica Pratt
 *1/29/19
 */
public class Character
{
    public String catchPhrase;
    public int speed;
    public Character(String phrase,int fastness)
    {
        catchPhrase = phrase;
        speed = fastness;
    }
    public void setCatchPhrase(String phrase)
    {
        this.catchPhrase = phrase;
    }
    public String getCatchPhrase(){
        return catchPhrase;
    }
    public void setSpeed(int fastness)
    {
        this.speed = fastness;
    }
    public int getSpeed()
    {
        return speed;
    }
}
