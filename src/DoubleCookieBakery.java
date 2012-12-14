
public class DoubleCookieBakery {
    public DoubleCookie create(SingleCookie proto, Filling fill) {
        try {
            return new DoubleCookie(proto, (SingleCookie) proto.clone(), fill);
        } catch (CloneNotSupportedException e) {
            assert(false);
            return null;
        }
    }
}
