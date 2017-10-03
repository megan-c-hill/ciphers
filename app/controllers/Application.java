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

    public static void caesar(String message, String key){
        Caesar cipher = new Caesar(message, key);
        render(cipher);
    }

    public static void vignere(String message, String key){
        Vignere cipher = new Vignere(message, key);
        render(cipher);
    }


}