
import java.util.InputMismatchException;
import java.util.Scanner;

public class GirisEkrani {
    /// Değişkenler /////////////////////////////////////////////////////////////////////////////////////
    static String kullaniciAdi;
    static String kullaniciSifre;
    Scanner scan = new Scanner(System.in);

    /// Getter ve setter metodlar ///////////////////////////////////////////////////////////////////////
    public String getKullaniciAdi() {
        return GirisEkrani.kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        GirisEkrani.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciSifre() {
        return GirisEkrani.kullaniciSifre;
    }

    public void setKullaniciSifre(String kullaniciSifre) {
        GirisEkrani.kullaniciSifre = kullaniciSifre;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean caseInsensitiveKontrol(){

        return true;
    }

    protected  void giris(){ // Giriş ekranını çalıştıran metod

        System.out.println("Sisteme hoş geldiniz :)");

        do  {

            System.out.println("Kullanıcı ismini girniz: ");
            kullaniciAdi = scan.nextLine();
            setKullaniciAdi(kullaniciAdi);
            System.out.println("Şifre: ");
            kullaniciSifre = scan.nextLine();
            setKullaniciSifre(kullaniciSifre);

        }while (girisKontrol());
        //giral fonk içine kes yapıstır
        /* do {
            System.out.println("Lutfen secmek istediğiniz sehrin numarasını giriniz :");
            for(int i = 0; i < s.sehir().size(); i++){
                System.out.println(i+"-"+s.sehir().get(i));
            }
            sehirID = scan.nextInt();
            sehirSec();
        }  while(sehirKontrol());
        */
    }

    protected boolean girisKontrol(){ //Admin sistemi eklenecek
        Ustalar u = new Ustalar();
        u.ustaAdlariOlustur();
        u.ustaSifreleriOlustur();

        if((getKullaniciAdi().length() >= 3 && u.kullaniciAdiUstaAdiKontrol(getKullaniciAdi())) && (getKullaniciSifre().length() == 4 && u.kullaniciSifreUstaSifresiKontrol(getKullaniciSifre())) ){
            return false;
        }
        else {
            System.out.println("Kullanıcı adı veya şifre hatalı");
            return true;
        }
    }

}
