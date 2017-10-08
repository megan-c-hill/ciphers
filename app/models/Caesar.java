package models;

public class Caesar{
    String originalMessage = "";
    String encryptedMessage = "";
    char key = '0';
    int numKey = 0;
    boolean decipher;


    public Caesar(String originalMessage, char key, boolean decipher){
        this.originalMessage = originalMessage;
        this.key = key;
        this.decipher = decipher;
        Letter l = new Letter(key);
        this.numKey = l.getNumEquiv();
        setEncryptedMessageByNum();
    }
    public Caesar(String originalMessage, String key, boolean decipher){
        this.originalMessage = originalMessage;
        this.key = key.charAt(0);
        this.decipher = decipher;
        Letter l = new Letter(key);
        this.numKey = l.getNumEquiv();
        setEncryptedMessageByNum();
    }
    public Caesar(){
        this.originalMessage = "";
        this.numKey = 1;
        this.decipher = false;
        setEncryptedMessageByNum();
    }

    private void setEncryptedMessageByNum(){
        for(int count = 0; count<originalMessage.length(); count++){
            Letter l = new Letter(originalMessage.charAt(count));
            if(l.isLetter()){
                char newLetter;
                if(decipher) {
                    newLetter = l.shiftLetter(numKey * -1);
                }
                else{
                    newLetter = l.shiftLetter(numKey);
                }
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