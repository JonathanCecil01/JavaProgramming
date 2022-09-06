package PS6iipackage;

import java.lang.Math;

public class SentenceGenerate {
    String [] article;
    String [] noun;
    String [] verb;
    String [] preposition;
    public SentenceGenerate(String[] noun, String[] verb)
    {
        article = new String[]{"the", "a", "one", "some", "any"};
        preposition = new String[]{"to", "from", "over", "under", "on"};
        this.noun = new String[noun.length];
        for(int i=0;i< noun.length;i++)
        {
            this.noun[i] = noun[i];
        }
        this.verb = new String[verb.length];
        for(int i=0;i< verb.length;i++)
        {
            this.verb[i] = verb[i];
        }
    }
    public String createSentence()
    {
        String article = this.article[(int)(Math.random()*(5))];
        String noun = this.noun[(int)(Math.random()*(5))];
        String verb = this.verb[(int)(Math.random()*(5))];
        String preposition = this.preposition[(int)(Math.random()*(5))];
        String article1 = this.article[(int)(Math.random()*(5))];
        String noun1 = this.noun[(int)(Math.random()*(5))];
        return article+" "+noun+" "+verb+" "+preposition+" "+article1+" "+noun1+ ".";
    }
}
