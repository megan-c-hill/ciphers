package models;

public class Vignere{
    private String originalMessage = "";
    private String encryptedMessage = "";
    private String key = "";
    private boolean decipher;

    public Vignere(String originalMessage, String key, boolean decipher){
        this.originalMessage = originalMessage;
        this.key = key;
        this.decipher = decipher;
        setEncryptedMessage();
    }
    public Vignere(){
        this.originalMessage = "";
        this.key = "";
        this.decipher = false;
    }

    private void setEncryptedMessage(){
        int keyCount = 0;
        for(int count = 0; count<originalMessage.length(); count++){
            char thisKey = key.charAt(keyCount);
            Letter messageLetter =  new Letter(originalMessage.charAt(count));
            if(messageLetter.isLetter()){
                Letter keyLetter = new Letter(thisKey);
                int numKey = keyLetter.getLetter();
                char newLetter;
                if(decipher){
                    newLetter = messageLetter.shiftLetter(numKey * -1);
                }
                else {
                    newLetter = messageLetter.shiftLetter(numKey);
                }

                encryptedMessage += newLetter;

                if(keyCount < key.length()-1){
                    keyCount ++;
                }
                else{
                    keyCount = 0;
                }
            }
            else{
                encryptedMessage += messageLetter.getLetter();
            }
        }
    }

    public String getOriginalMessage(){
        return originalMessage;
    }
    public String getKey(){
        return key;
    }
    public String getEncryptedMessage(){
        return encryptedMessage;
    }
}