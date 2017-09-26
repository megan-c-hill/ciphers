package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;
import models.Letter;

public class Application extends Controller {

    public static void index() {
        Letter A = new Letter(65);
        Letter a = new Letter(97);
        render();
    }

}