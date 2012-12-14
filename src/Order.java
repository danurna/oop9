import java.util.ArrayList;
import java.util.List;

/**
 * Repraesentiert eine Bestellung
 */
public class Order {
    private List<Position> order;

    public Order(){
         order = new ArrayList<Position>();
    }

    public void add(Position position){
        order.add(position);
    }

    public List<Position> getOrderList(){
        return order;
    }

    /**
     * Listet alle Positionen einer Bestellung in der Standardausgabe auf. 
     */
    public void print(){
        System.out.println(order.toString());
    }

}
