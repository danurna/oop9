
import java.util.ArrayList;
import java.util.List;


public class Test {

    /**
     * Hier werden die Punkte aus der Angabe getestet und vorgestellt wie man mit
     * den Klassen umgeht:
     */
    public static void main(String[] args) {
        /*
         * Testfall 1: Bestellung mit jeder Kombination der einfachen Kekse.
         */
        CookieShop cs = new CookieShop();

        Order bernhardsOrder = new Order();

        bernhardsOrder.add(new Position(new Round(), new ChocolateDough(), 1));
        bernhardsOrder.add(new Position(new Moon(), new ChocolateDough(), 2));
        bernhardsOrder.add(new Position(new SantaClaus(), new ChocolateDough(), 3));

        bernhardsOrder.add(new Position(new Round(), new CinnamonStarDough(), 4));
        bernhardsOrder.add(new Position(new Moon(), new CinnamonStarDough(), 5));
        bernhardsOrder.add(new Position(new SantaClaus(), new CinnamonStarDough(), 6));

        bernhardsOrder.add(new Position(new Round(), new ShortcrustDough(), 7));
        bernhardsOrder.add(new Position(new Moon(), new ShortcrustDough(), 8));
        bernhardsOrder.add(new Position(new SantaClaus(), new ShortcrustDough(), 9));

        System.out.println("BESTELLUNG FUER BERNHARD:");
        bernhardsOrder.print();
        System.out.println("ERHALTENE BOX FUER BERNHARD");
        cs.processOrder(bernhardsOrder).content();
        /*
         * Testfall 2: Bestellung mit Doppelkeksen
         */
        Order danielsOrder = new Order();

        danielsOrder.add(new Position(new Round(), new ChocolateDough(), 1, new ChocolateFilling()));
        danielsOrder.add(new Position(new Moon(), new ChocolateDough(), 2, new JamFilling()));
        danielsOrder.add(new Position(new SantaClaus(), new ChocolateDough(), 4, new ChocolateFilling()));

        System.out.println("BESTELLUNG FUER DANIEL:");
        danielsOrder.print();
        System.out.println("ERHALTENE BOX FUER DANIEL");
        cs.processOrder(danielsOrder).content();

        /*
         * Testfall 3: Fuenf mal die gleiche Bestellung
         */
        Order floriansOrder = new Order();

        floriansOrder.add(new Position(new SantaClaus(), new CinnamonStarDough(), 2));
        floriansOrder.add(new Position(new SantaClaus(), new CinnamonStarDough(), 2));
        floriansOrder.add(new Position(new SantaClaus(), new CinnamonStarDough(), 2));
        floriansOrder.add(new Position(new SantaClaus(), new CinnamonStarDough(), 2));
        floriansOrder.add(new Position(new SantaClaus(), new CinnamonStarDough(), 2));
        System.out.println("BESTELLUNG FUER FLORIAN:");
        floriansOrder.print();
        System.out.println("ERHALTENE BOX FUER FLORIAN");
        cs.processOrder(floriansOrder).content();


    }
}
