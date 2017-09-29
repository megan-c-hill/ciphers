package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
import models.Letter;
import models.Caesar;

public class Application extends Controller {

    public static void index() {
        Caesar c = new Caesar("Hello World", 25);
        System.out.println(c.getEncryptedMessage());
        render();
    }

}