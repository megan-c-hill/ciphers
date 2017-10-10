package models;

public class Bacon{
    String originalMessage;
    String pattern="";
    String randomText="";

    public Bacon(String originalMessage){
        this.originalMessage = originalMessage;
        setPattern();
        setRandomText();
    }

    private void setPattern(){
        boolean[] thisLetterArray = new boolean[5];
        for(int i = 0; i<originalMessage.length(); i++){
            Letter thisLetter = new Letter(originalMessage.charAt(i));
            thisLetterArray = thisLetter.getBaconNum();
            for(int j = 0; j<thisLetterArray.length; j++){
                boolean digit = thisLetterArray[j];
                if(digit){
                    pattern += "1";
                }
                else{
                    pattern += "0";
                }
            }
        }
    }

    private void setRandomText(){
        for(int i = 0; i<pattern.length(); i++){
            Letter thisLetter = new Letter();
            randomText += thisLetter.getLetter() + "";
            if(i%5==4){
                randomText += " ";
            }
        }
    }

    public String getOriginalMessage() {
        return originalMessage;
    }

    public String getPattern() {
        return pattern;
    }

    public String getRandomText() {
        return randomText;
    }
}