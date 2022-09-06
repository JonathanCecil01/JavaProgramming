import java.util.*;
import PS6iipackage.SentenceGenerate;
import PS6iipackage.WordGenerate;

public class MadLibs {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        /*
        String [] noun = new String[5];
        String [] verb = new String[5];
        System.out.println("Enter 5 Nouns");
        for(int i =0;i<5;i++)
        {
            noun[i] = sc.nextLine();
        }
        System.out.println("Enter 5 Verbs");
        for(int i =0;i<5;i++)
        {
            verb[i] = sc.nextLine();
        }
        SentenceGenerate sentence = new SentenceGenerate(noun, verb);
        for(int i=0;i<20;i++)
        {
            System.out.print(i+".");
            String sentence1 = sentence.createSentence();
            String ch = sentence1.substring(0, 1);

            System.out.println();
        }
        */
        String word_to_test = sc.nextLine();
        WordGenerate word = new WordGenerate(word_to_test);
        System.out.println(word.repeatEnd(3));

    }
}
