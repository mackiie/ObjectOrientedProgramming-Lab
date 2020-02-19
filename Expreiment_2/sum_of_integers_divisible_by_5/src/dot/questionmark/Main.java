package dot.questionmark;

public class Main {

    public static void main(String[] args)
    {
        int result = 0;

        for(int i=40;i<250;i++)
        {
            if(i%5==0)
            {
                result+=i;
            }
        }

        System.out.println(result);
    }
}
