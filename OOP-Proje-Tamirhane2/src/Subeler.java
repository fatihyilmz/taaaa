import java.util.ArrayList;
import java.util.Scanner;

public class Subeler extends Sehirler{
    Scanner scan = new Scanner(System.in);

   private ArrayList<String> subeNumarasi = new ArrayList<>();
     public ArrayList<String> subeOlustur() {
         subeNumarasi.add(0, "Fatih");
         subeNumarasi.add(1, "Bayrampasa");
         subeNumarasi.add(2, "Kartal");
         subeNumarasi.add(3, "Ostim");
         subeNumarasi.add(4, "Sasmaz");
         subeNumarasi.add(5, "Yenimahalle");
         subeNumarasi.add(6, "Bornova");
         subeNumarasi.add(7, "Konak");
         subeNumarasi.add(8, "Buca");
         subeNumarasi.add(9, "Nilufer");
         subeNumarasi.add(10, "Osmangazi");
         subeNumarasi.add(11,"Yildirim");
         subeNumarasi.add(12,"Kepez");
         subeNumarasi.add(13,"Muratpasa");
         subeNumarasi.add(14,"Serik");
         subeNumarasi.add(15,"Kayapinar");
         subeNumarasi.add(16,"Yenisehir");
         subeNumarasi.add(17,"Uckuyu");
         subeNumarasi.add(18,"Merkez");
         subeNumarasi.add(19,"Aziziye");
         subeNumarasi.add(20,"Yakutiye");
         subeNumarasi.add(21,"Canik");
         subeNumarasi.add(22,"Ilkadim");
         subeNumarasi.add(23,"Atakum");
         return subeNumarasi ;
     }

   public void addSubeNumarasi(String addSube){
       boolean eklemeKontrol = true;
       do{
           subeNumarasi.add(addSube);
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
   public int subeSecimi(){

       



       return 0;

   }
}
