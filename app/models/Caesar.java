package models;

public class Caesar{
    String originalMessage = "";
    String encryptedMessage = "";
    char key = '0';
    int numKey = 0;


    public Caesar(String originalMessage, char key){
        this.originalMessage = originalMessage;
        this.key = key;
        setEncryptedMessage();
    }
    public Caesar(String originalMessage, String key){
        this.originalMessage = originalMessage;
        this.key = key.charAt(0);
        setEncryptedMessage();
    }
    public Caesar(String originalMessage, int numKey){
        this.originalMessage = originalMessage;
        this.numKey = numKey;
        setEncryptedMessageByNum();
    }

    private void setEncryptedMessage(){
        for(int count = 0; count<originalMessage.length(); count++){
            Letter l =  new Letter(originalMessage.charAt(count));
            if(l.isLetter()){
                char newLetter = l.shiftLetter(key);
                encryptedMessage += newLetter;
            }
            else{
                encryptedMessage += l.getLetter();
            }
        }
    }
    private void setEncryptedMessageByNum(){
        for(int count = 0; count<originalMessage.length(); count++){
            Letter l = new Letter(originalMessage.charAt(count));
            if(l.isLetter()){
                char newLetter = l.shiftLetter(numKey);
                encryptedMessage += newLetter;
            }
            else{
                encryptedMessage += l.getLetter();
            }
        }
    }

    public String getOriginalMessage(){
        return originalMessage;
    }
    public String getEncryptedMessage(){
        return encryptedMessage;
    }
    public char getKey(){
        return key;
    }
}