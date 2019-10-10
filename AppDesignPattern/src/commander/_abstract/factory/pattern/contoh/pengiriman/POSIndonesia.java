package commander._abstract.factory.pattern.contoh.pengiriman;

public class POSIndonesia implements Pengiriman{
    @Override
    public String media_pengiriman() {
        return "POS Indonesia";
    }
}
