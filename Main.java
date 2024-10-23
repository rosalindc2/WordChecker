import java.util.ArrayList;
public class Main
{ 
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<>();
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(words);

                
        Wordchecker w = new WordChecker(words);
    }
}
