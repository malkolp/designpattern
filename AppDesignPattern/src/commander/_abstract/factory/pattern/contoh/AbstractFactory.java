package commander._abstract.factory.pattern.contoh;

import commander._abstract.factory.pattern.contoh.pembayaran.Pembayaran;
import commander._abstract.factory.pattern.contoh.pengiriman.Pengiriman;

public abstract class AbstractFactory {
    public abstract Pembayaran getPembayaran(String pembayaran);
    public abstract Pengiriman getPengiriman(String pengiriman);
}
