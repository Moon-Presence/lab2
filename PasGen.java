import java.util.Random;

public class PasGen {
    public String generation (int a)
    {
        Random c = new Random();
        String password="";
        for(int i = 0;i<a;i++)
            switch (c.nextInt(3)) {
                case 0:password += (char)RandomInRange('A','Z');break;
                case 1:password += (char)RandomInRange('0','9');break;
                case 2:password += (char)RandomInRange('a','z');break;
            }
        return password;
    }
    private int RandomInRange(int Min, int Max)
    {
        Random a = new Random();
        return Min+a.nextInt(Max+1-Min);
    }
}
