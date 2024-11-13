import java.util.ArrayList;
public class Main
{ 
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        //words.add("an");
        //words.add("band");
        //words.add("band");
        //words.add("abandon");

        WordChecker x = new WordChecker(words);

        words.add("catch");
        words.add("bobcat");
        words.add("catchacat");
        words.add("cat");
        words.add("at");
       // WordChecker w = new WordChecker(words);

       System.out.println(words);
       System.out.println(x.getwordList());

        System.out.println(x.isWordChain());
        ArrayList<String> result = x.createList("cat");
        System.out.println (result);
        System.out.println(x.getwordList());
        System.out.println(x.createList("cat"));


        System.out.println(x.createList("dog"));
        System.out.println(x.getwordList());
        System.out.println(x.createList("catch"));
    }
}
