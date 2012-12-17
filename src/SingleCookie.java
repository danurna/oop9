/**
 * Ein einfacher Keks.
 * Ein einfcher Keks besteht aus einer Teigart in einer Form.
 */
public class SingleCookie extends Cookie {
	
	//Invariante: besteht nur aus einem Keks mit einer form
	//und einem Teigtyp
	
    private final Shape shape;
    private final Dough dough;

    //VB shape und dough != null
    public SingleCookie(Shape shape, Dough dough) {
        this.shape = shape;
        this.dough = dough;
    }
    
    //VB: cookie != null
    public SingleCookie(SingleCookie cookie) {
        this.shape = cookie.shape;
        this.dough = cookie.dough;
    }
    
    public String toString() {
        return "Shape: " + shape + "; Dough: " + dough; 
    }
}
