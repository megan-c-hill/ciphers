import org.junit.*;
import play.test.*;
import play.mvc.*;
import play.mvc.Http.*;
import models.*;

public class ApplicationTest extends FunctionalTest {

    @Test
    public void testThatIndexPageWorks() {
        Response response = GET("/");
        assertIsOk(response);
        assertContentType("text/html", response);
        assertCharset(play.Play.defaultWebEncoding, response);
    }

    @Test
    public void testThatEncryptPageWorks() {
        Response response = GET("/encrypt");
        assertIsOk(response);
        assertContentType("text/html", response);
    }

    @Test
    public void testThatDecipherPageWorks() {
        Response response = GET("/decipher");
        assertIsOk(response);
        assertContentType("text/html", response);
    }
    
}