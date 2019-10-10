package commander._abstract.factory.pattern.contoh.pembayaran;

import commander._abstract.factory.pattern.contoh.AbstractFactory;
import commander._abstract.factory.pattern.contoh.pengiriman.Pengiriman;

public class PembayaranFactory extends AbstractFactory {

    @Override
    public Pembayaran getPembayaran(String pembayaran) {
        if (pembayaran.equalsIgnoreCase("alfaramet")) return new Alfaramet();
        if (pembayaran.equalsIgnoreCase("indoramet")) return new Indoramet();
        if (pembayaran.equalsIgnoreCase("ovo")) return new Ovo();
        if (pembayaran.equalsIgnoreCase("paypal")) return new Paypal();
        return new Transfer();
    }

    @Override
    public Pengiriman getPengiriman(String pengiriman) {
        return null;
    }
}
