/** backt aus einem Keks ein zweites identisches keks und vereinigt beide mit
 * der fuellung zu einem doppelkeks */
public class DoubleCookieBakery {
	// VB proto != null, fill != null
    public DoubleCookie create(SingleCookie proto, Filling fill) {
        return new DoubleCookie(proto, proto.clone(), fill);
    }
}
