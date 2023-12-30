import java.util.ArrayList;
import java.util.Scanner;

public class Sehirler {

    Scanner scan = new Scanner(System.in);
    private ArrayList<String> sehirNumarasi = new ArrayList<>();

    public ArrayList<String> addSehirNumarasi(){

        sehirNumarasi.add(0 ,"-İstanbul");
        sehirNumarasi.add(1, "-Ankara");
        sehirNumarasi.add(2,"-İzmir");
        sehirNumarasi.add(3,"-Bursa");
        sehirNumarasi.add(5,"-Antalya");
        sehirNumarasi.add(5,"-Diyarbakır");
        sehirNumarasi.add(6,"-Erzurum");
        sehirNumarasi.add(7,"-Samsun");

        return sehirNumarasi;
    }
    public int girdiAl(int secim){
        secim = scan.nextInt();
        return secim;
    }
    public void addSubeNumarasi(String addSube){
        boolean eklemeKontrol = true;
        do{
            sehirNumarasi.add(addSube);
            System.out.println("Devam etmek istiyor musunuz : ");
            System.out.println("1-Evet");
            System.out.println("2-Hayır");
            String cevap = scan.nextLine();
            if(true!=(cevap.equalsIgnoreCase("hayır")||cevap.equals("2")||cevap.equalsIgnoreCase("evet")|| cevap.equals("1"))) {
                System.out.println("Yanlış tuşlama yaptınız lutfen tekrar deneyiniz!!!");
                continue;
            }
            if (cevap.equalsIgnoreCase("hayır")||cevap.equals("2")){
                eklemeKontrol = false ;
            }
            else if (cevap.equalsIgnoreCase("evet")|| cevap.equals("1")){
                eklemeKontrol = true ;
            }

        }while (eklemeKontrol);
    }






    public int sehirSecimi(int secim) { //caselerde de index numarasından başlarız.
        int index = -1;
        switch (secim) {
            case 0:
                System.out.println("İstanbul'u seçtiniz");
                index = 0;
                break;
            case 1:
                System.out.println("Ankara'yı seçtiniz");
                index = 1;
                break;
            case 2:
                System.out.println("İzmir'i seçtiniz");
                index = 2;
                break;
            case 3:
                System.out.println("Bursa'yı seçtiniz");
                index = 3;
                break;
            case 4:
                System.out.println("Antalya'yı seçtiniz");
                index = 4;
                break;
            case 5:
                System.out.println("Diyarbakır'ı seçtiniz");
                index = 5;
                break;
            case 6:
                System.out.println("Erzurum'u seçtiniz");
                index = 6 ;
                break;
            case 7:
                System.out.println("Samsun'u seçtiniz");
                index =7;
                break;

            default:
                System.out.println("Lütfen geçerli bir şehir seçiniz");
                break;


        }
        return index;
    }
}