abstract class Question
{
    public String getMyText() {
        return myText;
    }

    private String myText;
    Question(String myText)
    {
        this.myText = myText;
    }
    public abstract String getQuestion();
    public abstract String getAnswer();
    public abstract boolean checkAnswer(String Answer);

}
class ShortAnswerQuestion extends Question
{
    private String myAnswer;

    ShortAnswerQuestion(String myText) {
        super(myText);
    }

    @Override
    public String getQuestion() {
        return getMyText();
    }

    @Override
    public String getAnswer() {
        return null;
    }

    @Override
    public boolean checkAnswer(String Answer) {
        if(Answer.equalsIgnoreCase(getAnswer()))
        {
            return true;
        }
        return false;
    }
}
class FillInBlanks extends Question
{
    private String myAnswer;
    FillInBlanks(String myText) {
        super(myText);
    }

    @Override
    public String getQuestion() {
        String text = getMyText()+"\nFill in the Blanks";
        return text;
    }

    @Override
    public String getAnswer() {
        return myAnswer;
    }

    @Override
    public boolean checkAnswer(String Answer) {
        if(Answer.equalsIgnoreCase(getAnswer()))
        {
            return true;
        }
        return false;
    }
}

class TrueFalseQuestion extends Question
{
    private boolean myAnswer;

    TrueFalseQuestion(String myText, boolean myAnswer) {
        super(myText);
        this.myAnswer = myAnswer;
    }

    @Override
    public String getQuestion() {
        String text = getMyText()+"\nIs this statement true or false?";
        return text;
    }

    @Override
    public String getAnswer() {
        return new Boolean(myAnswer).toString();
    }

    @Override
    public boolean checkAnswer(String Answer) {
        if(Answer.equalsIgnoreCase(getAnswer()))
        {
            return true;
        }
        return false;
    }
}
public class QPaper {
    public static void main(String[]args)
    {
        return;
    }
}
