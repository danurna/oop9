/** factory fuer kekese einer bestimmten form.
 * Form wird im konstruktor festgelegt. Backt dann kekse dieser form
 * aus einem Teig.*/
public class Bakery {
    private Shape shape;
    //VB shape != null
    public Bakery(Shape shape) {
        this.shape = shape;
    }
    // VB: dough != null
    public SingleCookie create(Dough dough) {
        return new SingleCookie(shape, dough);
    }
}
