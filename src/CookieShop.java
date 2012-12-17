import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Die baekerei
public class CookieShop {
	// fuer jede form eine baeckerei
    Map<Shape, Bakery> bakeries;
    DoubleCookieBakery doubleBakery;

    public CookieShop() {
        doubleBakery = new DoubleCookieBakery();
        bakeries = new HashMap<Shape, Bakery>();
        bakeries.put(new Round(), new Bakery(new Round()));
        bakeries.put(new SantaClaus(), new Bakery(new SantaClaus()));
        bakeries.put(new Moon(), new Bakery(new Moon()));
    }

    // durchlaufe die liste der Positionen und backe kekse mit den jeweiligen 
    // baykery klassen
    // liefere Box mit fertigen keksen 
    public CookieBox processOrder(Order order) {
        List<Position> orders = order.getOrderList();
        CookieBox box = new CookieBox();
        for (Position current : orders) {
            for (int i = 0; i < current.getAmount(); ++i) {
                
                SingleCookie c = bakeries.get(current.getShape()).create(
                        current.getDough());
                if (current.getFilling() != null) {
                    box.add(doubleBakery.create(c, current.getFilling()));
                } else {
                    box.add(c);
                }

            }
        }
        return box;
    }
    
    public static void main(String[] args) {

    }
}