package PS6iipackage;

public class WordGenerate {
    String word;


    public WordGenerate(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    public String repeatEnd(int n)
    {
        String repeated = "";
        if(n>=word.length())
        {
            for(int i=0;i<n;i++)
            {
                repeated+=word;
            }
        }
        else{
            String sub = word.substring(word.length()-n);
            for(int i=0;i<n;i++)
            {
                repeated+=sub;
            }
        }
        return repeated;
    }
}
