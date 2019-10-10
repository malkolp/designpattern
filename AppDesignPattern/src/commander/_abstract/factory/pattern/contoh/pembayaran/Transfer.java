package commander._abstract.factory.pattern.contoh.pembayaran;

public class Transfer implements Pembayaran{

    @Override
    public String media_pembayaran() {
        return "Transfer";
    }
}
