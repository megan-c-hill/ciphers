package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
import models.Letter;
import models.Caesar;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void encrypt(){
        render();
    }

    public static void caesar(String message, String key, String decipher){
        if(decipher == null){
            decipher = "true";
        }
        Caesar cipher = new Caesar();
        if(decipher.equals("true")){
            cipher = new Caesar(message, key, true);
        }
        else{
            cipher = new Caesar(message, key, false);
        }
        render(cipher);
    }

    public static void vignere(String message, String key, String decipher){
        Vignere cipher = new Vignere();
        if(decipher.equals("true")){
            cipher = new Vignere(message, key, true);
        }
        else{
            cipher = new Vignere(message, key, false);
        }
        render(cipher);
    }

    public static void bacon(String message){
        Bacon cipher = new Bacon(message);
        render (cipher);
    }

    public static void decipher(){
        render();
    }
}