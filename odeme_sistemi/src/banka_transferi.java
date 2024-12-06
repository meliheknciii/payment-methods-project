
public class banka_transferi implements odeme_bankakart{
    String iban;
    String iban_alici;
    String iban_tutar;

    @Override
    public void iban(String iban) {
        this.iban = iban;
        System.out.println("Iban adresi : " + iban);
    }

    @Override
    public void iban_alici(String iban_alici) {
        this.iban_alici = iban_alici;
        System.out.println("Alıcı : " + iban_alici);
    }

    @Override
    public void iban_tutar(String iban_tutar) {
        this.iban_tutar = iban_tutar;
        System.out.println("Iban a aktarılacak tutar : " + iban_tutar);
    }
}
