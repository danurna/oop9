public class DoubleCookieBakery {
    public DoubleCookie create(SingleCookie proto, Filling fill) {
        return new DoubleCookie(proto, new SingleCookie(proto), fill);
    }
}
