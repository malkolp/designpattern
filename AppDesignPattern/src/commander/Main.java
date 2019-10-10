package commander;


import commander._abstract.factory.pattern.contoh.AbstractFactory;
import commander._abstract.factory.pattern.contoh.EPayment;
import commander._abstract.factory.pattern.contoh.pembayaran.Pembayaran;
import commander._abstract.factory.pattern.contoh.pengiriman.Pengiriman;

public class Main {

    public static void main(String[] args) {
        AbstractFactory pembayaran = EPayment.getFactory("pembayaran");
        AbstractFactory pengiriman = EPayment.getFactory("pengiriman");

        Pembayaran tipe_bayar = pembayaran.getPembayaran("transfer");
        Pengiriman ekspedisi = pengiriman.getPengiriman("pos indonesia");

        System.out.println("pembayaran menggunakan : "+tipe_bayar.media_pembayaran());
        System.out.println("pengiriman menggunakan : "+ekspedisi.media_pengiriman());
    }
}
