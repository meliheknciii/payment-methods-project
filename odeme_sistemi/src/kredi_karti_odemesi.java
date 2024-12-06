public class kredi_karti_odemesi implements odeme_kredikart{
    String kartin_sahibi;
    String cvc2;
    String kart_no;
    String son_tarih;

    @Override
    public void kartin_sahibi(String kartin_sahibi) {
        this.kartin_sahibi = kartin_sahibi;
        System.out.println("Kartın sahibi: " + kartin_sahibi);
    }

    @Override
    public void cvc2(String cvc2) {
        this.cvc2 = cvc2;
        System.out.println("CVC2: " + cvc2);
    }

    @Override
    public void kart_no(String kart_no) {
        this.kart_no = kart_no;
        System.out.println("kart numarası : " + kart_no);
    }

    @Override
    public void son_tarih(String son_tarih) {
        this.son_tarih = son_tarih;
        System.out.println("Son Kullanım Tarihi : " + son_tarih);
    }
}
