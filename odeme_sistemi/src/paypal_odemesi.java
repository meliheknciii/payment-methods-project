public class paypal_odemesi implements odeme_paypal{
    String kartSahibi;
    String cvc2 ;
    String kart_no;
    String sonTarih;
    @Override
    public void kartin_sahibi(String kart_sahibi) {
        this.kartSahibi = kart_sahibi;
        System.out.println("Kartin sahibi: " + kartSahibi);
    }

    @Override
    public void cvc2(String cvc2) {
        this.cvc2 = cvc2;
        System.out.println("CVC2 : " + cvc2);
    }

    @Override
    public void kart_no(String kart_no) {
        this.kart_no = kart_no;
        System.out.println("Kartno : " + kart_no);
    }

    @Override
    public void son_tarih(String son_tarih) {
        this.sonTarih = son_tarih;
        System.out.println("Son tarih : " + son_tarih);
    }
}
