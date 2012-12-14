
public class DoubleCookie extends Cookie {
    private SingleCookie top;
    private Filling filling;
    private SingleCookie bottom;
    
    public DoubleCookie(SingleCookie top, SingleCookie bottom, Filling fill) {
        this.top = top;
        this.bottom = bottom;
        this.filling = fill;
    }
    public String toString() {
        return "Cookies: " + top + "; Filling: " + filling; 
    }
}
