interface Instrument
{
    public void play();
    public String what();
    public void adjust();
}

class Wind implements Instrument
{
    @Override
    public void play() {
        return;
    }

    @Override
    public String what() {
        return null;
    }

    @Override
    public void adjust() {

    }

}
class Percussion implements Instrument
{

    @Override
    public void play() {

    }

    @Override
    public String what() {
        return null;
    }

    @Override
    public void adjust() {

    }
}
class Stringed implements Instrument
{

    @Override
    public void play() {

    }

    @Override
    public String what() {
        return null;
    }

    @Override
    public void adjust() {

    }
}

class Woodwind extends Wind
{
    @Override
    public void play() {
        super.play();
    }
    @Override
    public String what()
    {
        return null;
    }
}
class Brass extends Wind
{
    @Override
    public void play() {
        super.play();
    }
    @Override
    public void adjust()
    {
    }
}


public class MuseeMusicals {
    public static void main(String[]args)
    {
        Instrument i = new Brass();
    }
}
