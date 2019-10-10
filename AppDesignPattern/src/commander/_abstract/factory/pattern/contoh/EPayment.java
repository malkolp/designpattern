package commander._abstract.factory.pattern.contoh;

import commander._abstract.factory.pattern.contoh.pembayaran.PembayaranFactory;
import commander._abstract.factory.pattern.contoh.pengiriman.PengirimanFactory;

public class EPayment {
    public static AbstractFactory getFactory(String type){
        if (type.equalsIgnoreCase("pembayaran")) return new PembayaranFactory();
        if (type.equalsIgnoreCase("pengiriman")) return new PengirimanFactory();
        return null;
    }
}
