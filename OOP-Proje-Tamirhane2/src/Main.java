/*
Ülke Genelinde Faaliyet Gösteren Bir Otomobil Tamirhanesinin Bilgi Sistemi- 01.12.2023
Fatih YILMAZ - 22181616060
Görkem BOYACIOĞLU - 22181616056
Furkan Emir KAYA - 22181617011
*/

public abstract class Main {
    static double toplamMaliyet;
    static int toplamTahminiIsBitirmeSuresi;

    public abstract int intGirdiAl();
    public abstract String stringGirdiAl();
    public abstract double doubleGirdiAl();

    public static void main(String[] args) {
        GirisEkrani g = new GirisEkrani();
        g.giris();
        System.out.println("Program testi başarılı");
    }


}