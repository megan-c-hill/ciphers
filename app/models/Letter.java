package models;

public class Letter{
    private char letter = '0'; //This will always be lowercase
    private int numEquiv = 0; //Corresponds to ASCII
    private boolean[] baconNum = new boolean[5];

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
        if (numEquiv < 91 && numEquiv > 40){
            numEquiv += 32;
        }
        if(numEquiv < 27 && numEquiv > 0){
            numEquiv += 96;
        }
        this.numEquiv = numEquiv;
        setLetter();
        setBaconNum();
    }

    public Letter(boolean[] baconNum){
        this.baconNum = baconNum;
        int num = 0;

        if(baconNum[4])
            num += 1;
        if(baconNum[3])
            num += 2;
        if(baconNum[2])
            num += 4;
        if(baconNum[1])
            num += 8;
        if(baconNum[0])
            num += 16;
        numEquiv = num + 97;
        setLetter();
    }

    public Letter(){ //Initializes a random letter
        numEquiv = (int)(26 * Math.random()) + 97;
        setLetter();
        setBaconNum();
    }


    private void setNum(){
        letter = Character.toLowerCase(letter);
        numEquiv = (int)letter;

    }
    private void setLetter(){
        letter = (char)(numEquiv);
        letter = Character.toLowerCase(letter); // This shouldn't be necessary but I'm leaving it as safety
    }
    private void setBaconNum(){
        int tempNum = numEquiv - 97; //temp num is assuming a = 0
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

    public char shiftLetter(int shifter){
        int newNum;
        if(shifter > 0)
            newNum = numEquiv + shifter - 97;
        else
            newNum = numEquiv + shifter + 97;
        if(newNum > 122){
            newNum -=26;
        }
        if(newNum < 97){
            newNum += 26;
        }
        return (char)(newNum);
    }

    public boolean isSpace(){
        return Character.isSpace(letter);
    }
    public boolean isLetter(){
        return Character.isLetter(letter);
    }
}