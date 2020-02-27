package dot.questionmark;

import balance.*;

public class Main {

    public static void main(String[] args)
    {
        balance.account ob = new balance.account();
        ob.Display_Balance((int)(Math.random()*1000000));
    }
}
