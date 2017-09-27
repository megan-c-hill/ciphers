package models;

public class Letter{
    char letter = '0'; //This will always be lowercase
    int numEquiv = 0; //This will be 1,2,3 etc.
    boolean[] baconNum = new boolean[5];

    public Letter(String letter){
        this.letter = letter.charAt(0);
        setNum();
        setBaconNum();
    }
    public Letter(char letter){
        this.letter = letter;
        setNum();
        setBaconNum();
    }
    public Letter(int numEquiv){
        this.numEquiv = numEquiv;
        setLetter();
        setBaconNum();
    }
    public Letter(){
        numEquiv = (int)(26 * Math.random()) + 1;
        setLetter();
        setBaconNum();
    }


    private void setNum(){
        letter = Character.toLowerCase(letter);
        numEquiv = (int)letter;
        numEquiv -= 96;

    }
    private void setLetter(){
        letter = (char)numEquiv;
        letter = Character.toLowerCase(letter);
    }
    private void setBaconNum(){
        int tempNum = numEquiv - 1; //temp num is assuming a = 0
        if(tempNum % 2 == 0)
            baconNum[4] = false;
        else
            baconNum[4] = true;
        if(tempNum % 4 < 2)
            baconNum[3] = false;
        else
            baconNum[3] = true;
        if(tempNum % 8 < 4)
            baconNum[2] = false;
        else
            baconNum[2] = true;
        if(tempNum % 16 < 8)
            baconNum[1] = false;
        else
            baconNum[1] = true;
        if (tempNum < 16)
            baconNum[0] = false;
        else
            baconNum[0] = true;
    }


    public char getLetter(){
        return letter;
    }
    public int getNumEquiv(){
        return numEquiv;
    }

    public void shiftLetter(char shifter){
        int numShifter = (int)Character.toLowerCase(letter);
        int newNum = numEquiv + numShifter;
        if(newNum > 26){
            newNum -=26;
        }
        setLetter();
        setBaconNum();
    }
    public void shiftLetter(int shifter){
        int newNum = numEquiv + shifter;
        if(newNum > 26){
            newNum -=26;
        }
        setLetter();
        setBaconNum();
    }


}