package commander._abstract.factory.pattern.contoh.pengiriman;

import commander._abstract.factory.pattern.contoh.AbstractFactory;
import commander._abstract.factory.pattern.contoh.pembayaran.Pembayaran;

public class PengirimanFactory extends AbstractFactory {
    @Override
    public Pembayaran getPembayaran(String pembayaran) {
        return null;
    }

    @Override
    public Pengiriman getPengiriman(String pengiriman) {
        if (pengiriman.equalsIgnoreCase("cod")) return new COD();
        if (pengiriman.equalsIgnoreCase("jne")) return new JNE();
        if (pengiriman.equalsIgnoreCase("jnt")) return new JNT();
        return new POSIndonesia();
    }
}
