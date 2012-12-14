public class SingleCookie extends Cookie implements Cloneable {
    private final Shape shape;
    private final Dough dough;

    public SingleCookie(Shape shape, Dough dough) {
        this.shape = shape;
        this.dough = dough;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public String toString() {
        return "Shape: " + shape + "; Dough: " + dough; 
    }
}
