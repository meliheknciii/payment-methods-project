import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Yapmak istediğiniz ödeme şekli nedir ? :  " + "1-Kredi kartı Ödemesi    " +
                "2-Iban ile Odeme    " +
                "3-Paypal ile Odeme     ");
        Scanner sc = new Scanner(System.in);
        int odemeYontem = sc.nextInt();

        if(odemeYontem == 1){
            // Kredi kartı
            odeme_kredikart odmKredi = new kredi_karti_odemesi();
            odmKredi.kart_no("1234 5678 1234 5678");
            odmKredi.kartin_sahibi("Melih Ekinci");
            odmKredi.cvc2("131");
            odmKredi.son_tarih("04/24");
        }
        else if (odemeYontem == 2) {
            // iban ile transfer
            odeme_bankakart odmBanka = new banka_transferi();
            odmBanka.iban("TR98 1234 0000 5025 256568854 92");
            odmBanka.iban_alici("Fazıl Say");
            odmBanka.iban_tutar("1200");

        }
        else if (odemeYontem == 3) {
            // paypal ile ödeme
            odeme_paypal odmpay = new paypal_odemesi();

            odmpay.kart_no("9875 7231 1345 9347");
            odmpay.kartin_sahibi("Ahmet Hakan Demir");
            odmpay.son_tarih("08/28");
            odmpay.cvc2("141");
        }
        else {
            System.out.print("Yanlış tuşlama yaptınız tekrar deneyin.");
        }

    }
}