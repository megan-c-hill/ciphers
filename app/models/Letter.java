package models;

public class Letter{
    char letter = '0';
    int numEquiv = 0;

    public Letter(String letter){
        this.letter = letter.charAt(0);
        setNum();
    }
    public Letter(char letter){
        this.letter = letter;
        setNum();
    }
    public Letter(int numEquiv){
        this.numEquiv = numEquiv;
        setLetter();
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


}