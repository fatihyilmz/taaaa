import java.util.ArrayList;
import java.util.Objects;

public class Ustalar extends Subeler implements UstaBilgileri {

    String ustaAdi;
    String ustaSifre;

    public ArrayList<String> getUstaSifreleri() {
        return ustaSifreleri;
    }

    public void setUstaSifreleri(ArrayList<String> ustaSifreleri) {
        this.ustaSifreleri = ustaSifreleri;
    }

    int calismaYili;
    int ustaUzmanlikID;
    private static int artirici = 0; //Admin usta ve şifre eklediğinde ArrayList'in boyutunu artıracak değişken

    private ArrayList<String> ustaAdlari = new ArrayList<>(14 + artirici); //Ustaların adlarını tutan ArrayList
    private ArrayList<String> ustaSifreleri = new ArrayList<>(14 + artirici); //Ustaların sifrelerini tutan ArrayList

    /// Getter Setter Metodlar ///////////////////////////////////////////////////////////////////////////
    public String getUstaAdi() {
        return this.ustaAdi;
    }

    public void setUstaAdi(String ustaAdi) {
        this.ustaAdi = ustaAdi;
    }

    public String getUstaSifre() {
        return this.ustaSifre;
    }

    public void setUstaSifre(String ustaSifre) {
        this.ustaSifre = ustaSifre;
    }

    public int getCalismaYili() {
        return this.calismaYili;
    }

    public void setCalismaYili(int calismaYili) {
        this.calismaYili = calismaYili;
    }

    public int getUstaUzmanlikID() {
        return this.ustaUzmanlikID;
    }

    public void setUstaUzmanlikID(int ustaUzmanlikID) {
        this.ustaUzmanlikID = ustaUzmanlikID;
    }

    public static int getartirici() {
        return artirici;
    }

    public static void setartirici(int artirici) {
        Ustalar.artirici = artirici;
    }

    public ArrayList<String> getUstaAdlari() {
        return this.ustaAdlari;
    }

    public void setUstaAdlari(ArrayList<String> ustaAdlari) {
        this.ustaAdlari = ustaAdlari;
    }
//////////////////////////////////////////////////////////////////////////////////////////////

    public ArrayList<String> ustaAdlariOlustur() {  // Ustaların adlarını tutan ArrayListi oluşturan metod
        ustaAdlari.add(0, "Ahmet");
        ustaAdlari.add(1, "Mehmet");
        ustaAdlari.add(2, "Ali");
        ustaAdlari.add(3, "Görkem");
        ustaAdlari.add(4, "Fatih");
        ustaAdlari.add(5, "Furkan");
        ustaAdlari.add(6, "Cemal");
        ustaAdlari.add(7, "Kemal");
        ustaAdlari.add(8, "Hilmi");
        ustaAdlari.add(9, "Okan");
        ustaAdlari.add(10, "İsmail");
        ustaAdlari.add(11, "Kerem");
        ustaAdlari.add(12, "Emirhan");
        ustaAdlari.add(13, "Enes");
        ustaAdlari.add(14, "Ümit");
        // String ad = String.valueOf(getUstaAdlari());
        // if(){ admin erişebilecek. Başka bir sınıftayken
        // ustaAdlari.add(ad);
        //}
        return ustaAdlari;
    }

    public ArrayList<String> ustaSifreleriOlustur() {  // Ustaların şifrelerini tutan ArrayListi oluşturan metod
        ustaSifreleri.add(0, "1926");
        ustaSifreleri.add(1, "1926");
        ustaSifreleri.add(2, "1926");
        ustaSifreleri.add(3, "1926");
        ustaSifreleri.add(4, "1926");
        ustaSifreleri.add(5, "1926");
        ustaSifreleri.add(6, "1926");
        ustaSifreleri.add(7, "1926");
        ustaSifreleri.add(8, "1926");
        ustaSifreleri.add(9, "1926");
        ustaSifreleri.add(10, "1926");
        ustaSifreleri.add(11, "1926");
        ustaSifreleri.add(12, "1926");
        ustaSifreleri.add(13, "1926");
        ustaSifreleri.add(14, "1926");
        // String ad = String.valueOf(getustaSifreleri());
        // if(){ admin erişebilecek. Başka bir sınıftayken
        // ustaSifreleri.add(ad);
        //}
        return ustaSifreleri;
    }

    @Override
    public double tecrubeMaliyet(int calismaYili) {
        return 0;
    }

    @Override
    public int tecrubeIsBitirmeSuresi(int calismaYili) {
        return 0;
    }


    public boolean kullaniciAdiUstaAdiKontrol(String kullaniciAdi) { //Kullanıcının girdiği kullanıcı adı ile sisteme girili ustaların adını karşılaştıran metod
        // Sorun cozuldu
        for (int i = 0; i <= 14 + artirici; i++) {
            String geciciAd = ustaAdlari.get(i);
            if (Objects.equals(geciciAd, kullaniciAdi)) {
                return true;
            }
        }
        return false;
    }

    public boolean kullaniciSifreUstaSifresiKontrol(String kullaniciSifre) { //Kullanıcının girdiği kullanıcı adı ile sisteme girili ustaların adını karşılaştıran metod

        for (int i = 0; i <= 14 + artirici; i++) {
            String geciciSifre = ustaSifreleri.get(i);
            if (Objects.equals(geciciSifre, kullaniciSifre )) {
                return true;
            }
        }
        return false;
    }
}
