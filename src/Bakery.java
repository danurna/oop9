
public class Bakery {
    private Shape shape;
    public Bakery(Shape shape) {
        this.shape = shape;
    }
    
    public SingleCookie create(Dough dough) {
        return new SingleCookie(shape, dough);
    }
}
