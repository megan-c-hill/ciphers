package models;

public class Vignere{
    private String originalMessage = "";
    private String encryptedMessage = "";
    private String key = "";

    public Vignere(String originalMessage, String key){
        this.originalMessage = originalMessage;
        this.key = key;
        setEncryptedMessage();
    }

    private void setEncryptedMessage(){
        int keyCount = 0;
        for(int count = 0; count<originalMessage.length(); count++){
            char thisKey = key.charAt(keyCount);
            Letter l =  new Letter(originalMessage.charAt(count));
            if(l.isLetter()){
                char newLetter = l.shiftLetter(thisKey);
                encryptedMessage += newLetter;

                if(keyCount < key.length()-1){
                    keyCount ++;
                }
                else{
                    keyCount = 0;
                }
            }
            else{
                encryptedMessage += l.getLetter();
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