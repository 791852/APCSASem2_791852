
/**
 * Veronica Pratt
 * 1/29/19
 */
public class Main
{
    public static void main(){
        Character mario = new Mario("It's me, Mario", 100);
        mario.setSpeed(100);
        System.out.print("catchphrase =" + mario.getCatchPhrase() + ", speed =" + mario.getSpeed());
    }
}
