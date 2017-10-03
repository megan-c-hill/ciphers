package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
import models.Letter;
import models.Caesar;

public class Application extends Controller {

    public static void index() {
        Vignere v = new Vignere("Hello World", "aabbc");
        System.out.println(v.getEncryptedMessage());
        render();
    }

    public static void encrypt(){
        render();
    }

    public static void vignere(String message, String key){
        render(message, key);
    }

    public static void caesar(String message, String key){
        render(message, key);
    }

}