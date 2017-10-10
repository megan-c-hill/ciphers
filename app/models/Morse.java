package models;

public class Morse{
    String morseLetter;
    char plainLetter;

    public Morse(char plainLetter){
        this.plainLetter = plainLetter;
        setMorseLetter();
    }

    public Morse(Letter plainLetter){
        this.plainLetter = plainLetter.getLetter();
        setMorseLetter();
    }

    public Morse(String morseLetter){
        this.morseLetter = morseLetter;
        setPlainLetter();
    }

    private void setMorseLetter(){
        switch(plainLetter){
            case 'e':
                morseLetter = ".";
                break;
            case 't':
                morseLetter = "-";
                break;
            case 'i':
                morseLetter = "..";
                break;
            case 'a':
                morseLetter = ".-";
                break;
            case 'n':
                morseLetter = "-.";
                break;
            case 'm':
                morseLetter = "--";
                break;
            case 'd':
                morseLetter = "-..";
                break;
            case 'g':
                morseLetter = "--.";
                break;
            case 'k':
                morseLetter = "-.-";
                break;
            case 'o':
                morseLetter = "---";
                break;
            case 'r':
                morseLetter = ".-.";
                break;
            case 's':
                morseLetter = "...";
                break;
            case 'u':
                morseLetter = "..-";
                break;
            case 'w':
                morseLetter = ".--";
                break;
            case 'b':
                morseLetter = "-...";
                break;
            case 'c':
                morseLetter = "-.-.";
                break;
            case 'f':
                morseLetter = "..-.";
                break;
            case 'h':
                morseLetter = "....";
                break;
            case 'j':
                morseLetter = ".---";
                break;
            case 'l':
                morseLetter = ".-..";
                break;
            case 'p':
                morseLetter = ".--.";
                break;
            case 'q':
                morseLetter = "--.-";
                break;
            case 'v':
                morseLetter = "...-";
                break;
            case 'x':
                morseLetter = "-..-";
                break;
            case 'y':
                morseLetter = "-.--";
                break;
            case 'z':
                morseLetter = "--..";
                break;
            case '.':
                morseLetter = ".-.-.-";
                break;
            case ',':
                morseLetter = "--..--";
                break;
            case '?':
                morseLetter = "..--..";
                break;
            case '/':
                morseLetter = "-..-.";
                break;
            case '@':
                morseLetter = ".--.-.";
                break;
            case '1':
                morseLetter = ".----";
                break;
            case '2':
                morseLetter = "..---";
                break;
            case '3':
                morseLetter = "...--";
                break;
            case '4':
                morseLetter = "....-";
                break;
            case '5':
                morseLetter = ".....";
                break;
            case '6':
                morseLetter = "-....";
                break;
            case '7':
                morseLetter = "--...";
                break;
            case '8':
                morseLetter = "---..";
                break;
            case '9':
                morseLetter = "----.";
                break;
            case '0':
                morseLetter = "-----";
                break;
            default:
                morseLetter = "Not a recognized symbol";
                break;

        }

    }

    private void setPlainLetter(){

    }


}