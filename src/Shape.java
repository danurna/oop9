/**
 * Abstrakte Superklasse fuer moegliche Keksformen.
 */
public abstract class Shape {
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        return getClass() == o.getClass();
    }
    
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
