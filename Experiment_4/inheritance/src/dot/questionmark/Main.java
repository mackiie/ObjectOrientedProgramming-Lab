package dot.questionmark;

class player
{
    String name;
    int age;

    player(String n, int a)
    {
        name = n;
        age = a;
    }

    void show()
    {
        System.out.println("Player Name : " + name);
        System.out.println("Player Age : " + age);
    }
}

class cricket_player extends player
{
    int total_score;

    cricket_player(String n, int a, int t)
    {
        super(n,a);
        total_score = t;
    }

    void show()
    {
        super.show();
        System.out.println("Total goals scored : " + total_score);
    }

}

class football_player extends player
{
    int matches_played;

    football_player(String n, int a, int m)
    {
        super(n,a);
        matches_played = m;
    }

    void show()
    {
        super.show();
        System.out.println("Matches played : " + matches_played);
    }

}

class hockey_player extends player
{
    String nickname;

    hockey_player(String n, int a, String ni)
    {
        super(n,a);
        nickname = ni;
    }

    void show()
    {
        super.show();
        System.out.println("Nickname : " + nickname);
    }

}

public class Main
{

    public static void main(String[] args)
    {
        cricket_player p1 = new cricket_player("ABC", 24, 5476);
        football_player p2 = new football_player("XYZ", 27, 104);
        hockey_player p3 = new hockey_player("KLM", 21, "QWERTY");

        p1.show();
        p2.show();
        p3.show();
    }
}
