package commander._abstract.factory.pattern.contoh.pembayaran;

public class Paypal implements Pembayaran{

    @Override
    public String media_pembayaran() {
        return "Paypal";
    }
}
