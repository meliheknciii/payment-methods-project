public interface odeme_kredikart {
    void kart_no(String kart_no);
    void cvc2(String cvc2);
   void kartin_sahibi(String kartin_sahibi);
    void son_tarih(String son_tarih);
}
interface odeme_bankakart {
    void iban(String iban);
    void iban_alici(String iban_alici);
    void iban_tutar(String iban_tutar);
}
interface odeme_paypal{
    void kart_no(String kart_no);
    void cvc2(String cvc2);
    void kartin_sahibi(String kartin_sahibi);
    void son_tarih(String son_tarih);
}
