public class SingleCookie extends Cookie {
    private final Shape shape;
    private final Dough dough;

    public SingleCookie(Shape shape, Dough dough) {
        this.shape = shape;
        this.dough = dough;
    }
    
    public SingleCookie(SingleCookie cookie) {
        this.shape = cookie.shape;
        this.dough = cookie.dough;
    }
    
    public String toString() {
        return "Shape: " + shape + "; Dough: " + dough; 
    }
}
