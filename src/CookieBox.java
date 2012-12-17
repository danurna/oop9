import java.util.ArrayList;

/** eine box mit kekesen*/
public class CookieBox extends ArrayList<Cookie> {
    public void content() {
        for (Cookie c: this) {
            System.out.println(c);
        }
    }
}
