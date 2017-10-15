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
        switch(morseLetter){
            case ".":
                plainLetter = 'e';
                break;
            case "-":
                plainLetter = 't';
                break;
            case "..":
                plainLetter = 'i';
                break;
            case ".-":
                plainLetter = 'a';
                break;
            case "-.":
                plainLetter = 'n';
                break;
            case "--":
                plainLetter = 'm';
                break;
            case "-..":
                plainLetter = 'd';
                break;
            case "--.":
                plainLetter = 'g';
                break;
            case "-.-":
                plainLetter = 'k';
                break;
            case "---":
                plainLetter = 'o';
                break;
            case ".-.":
                plainLetter = 'r';
                break;
            case "...":
                plainLetter = 's';
                break;
            case "..-":
                plainLetter = 'u';
                break;
            case ".--":
                plainLetter = 'w';
                break;
            case "-...":
                plainLetter = 'b';
                break;
            case "-.-.":
                plainLetter = 'c';
                break;
            case "..-.":
                plainLetter = 'f';
                break;
            case "....":
                plainLetter = 'h';
                break;
            case ".---":
                plainLetter = 'j';
                break;
            case ".-..":
                plainLetter = 'l';
                break;
            case ".--.":
                plainLetter = 'p';
                break;
            case "--.-":
                plainLetter = 'q';
                break;
            case "...-":
                plainLetter = 'v';
                break;
            case "-..-":
                plainLetter = 'x';
                break;
            case "-.--":
                plainLetter = 'y';
                break;
            case "--..":
                plainLetter = 'z';
                break;
            case ".-.-.-":
                plainLetter = '.';
                break;
            case "--..-":
                plainLetter = ',';
                break;
            case "..--..":
                plainLetter = '?';
                break;
            case "-..-.":
                plainLetter = '/';
                break;
            case ".--.-.":
                plainLetter = '@';
                break;
            case ".----":
                plainLetter = '1';
                break;
            case "..---":
                plainLetter = '2';
                break;
            case "...--":
                plainLetter = '3';
                break;
            case "....-":
                plainLetter = '4';
                break;
            case ".....":
                plainLetter = '5';
                break;
            case "-....":
                plainLetter = '6';
                break;
            case "--...":
                plainLetter = '7';
                break;
            case "---..":
                plainLetter = '8';
                break;
            case "----.":
                plainLetter = '9';
                break;
            case "-----":
                plainLetter = '0';
                break;
            default:
                plainLetter = '*';
                break;
        }

    }


}