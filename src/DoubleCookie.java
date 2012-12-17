/** Doppeltes Keks */
public class DoubleCookie extends Cookie {
    private SingleCookie top;
    private Filling filling;
    private SingleCookie bottom;
    
    // Invariante: besteht aus 2 einfachen Kekesen und einer fuellung
    // Invariante: Form und Teig der beiden einzelkekse sind ident!
    
    //VB top und bottom haben identische Form und identischen Teig
    public DoubleCookie(SingleCookie top, SingleCookie bottom, Filling fill) {
        this.top = top;
        this.bottom = bottom;
        this.filling = fill;
    }
    
    public String toString() {
        return "Cookies: " + top + "; Filling: " + filling; 
    }
}
