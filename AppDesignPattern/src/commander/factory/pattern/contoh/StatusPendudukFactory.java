package commander.factory.pattern.contoh;

public class StatusPendudukFactory {

    public Status getStatusPenduduk(String status){
        if (status.equalsIgnoreCase("pelajar"))return new Pelajar();
        if (status.equalsIgnoreCase("polisi"))return new Polisi();
        if (status.equalsIgnoreCase("pns"))return new PNS();
        if (status.equalsIgnoreCase("pengangguran"))return new Pengangguran();
        return new Pengangguran();
    }
}
