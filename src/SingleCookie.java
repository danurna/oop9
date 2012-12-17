/**
 * Ein einfacher Keks.
 * Ein einfcher Keks besteht aus einer Teigart in einer Form.
 */

public class SingleCookie extends Cookie implements Cloneable {
    //Invariante: besteht nur aus einem Keks mit einer form
    //und einem Teigtyp
    
    private final Shape shape;
    private final Dough dough;

    //VB shape und dough != null
    public SingleCookie(Shape shape, Dough dough) {
        this.shape = shape;
        this.dough = dough;
    }
    
    @Override
    public SingleCookie clone() {
        try {
            return (SingleCookie) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Unreachable.");
        }
    }
    public String toString() {
        return "Shape: " + shape + "; Dough: " + dough; 
    }
}
