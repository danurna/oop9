import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CookieShop {
    Map<Shape, Bakery> bakeries;
    DoubleCookieBakery doubleBakery;

    public CookieShop() {
        doubleBakery = new DoubleCookieBakery();
        bakeries = new HashMap<Shape, Bakery>();
        bakeries.put(new Round(), new Bakery(new Round()));
        bakeries.put(new SantaClaus(), new Bakery(new SantaClaus()));
        bakeries.put(new Moon(), new Bakery(new Moon()));
    }

    public CookieBox processOrder(List<Order> orders) {
        CookieBox box = new CookieBox();
        for (Order current : orders) {
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
        CookieShop cs = new CookieShop();
        List<Order> orders = new ArrayList<Order>();
        orders.add(new Order(new SantaClaus(), new CinnamonStarDough(), 3));
        orders.add(new Order(new Round(), new ChocolateDough(), 3, new ChocolateFilling()));
        cs.processOrder(orders).content();
    }
}