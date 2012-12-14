public class Position {
    // IV: != null
    private Shape shape;
    // IV: != null
    private Dough dough;
    // IV: can be null
    private Filling filling;
    private int amount;
    
    public Position(Shape shape, Dough dough, int amount) {
        this(shape, dough, amount, null);
    }
    
    public Position(Shape shape, Dough dough, int amount, Filling filling) {
        this.shape = shape;
        this.dough = dough;
        this.amount = amount;
        this.filling = filling;
    }
    
    public Shape getShape() {
        return shape;
    }
    public Dough getDough() {
        return dough;
    }
    public Filling getFilling() {
        return filling;
    }
    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "\n" + amount + "x " + shape + " aus Teig " + dough + ((filling != null) ?  (" mit " + filling) : "");
    }
    
}
