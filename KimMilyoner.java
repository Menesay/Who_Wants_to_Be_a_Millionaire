
import java.io.IOException;
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author menesay
 */
public class KimMilyoner {
    
    
    
     public static void main(String[] args)throws IOException{
         
         int puan = 0;
          
            
         System.out.println("KimMilyonerOlmakİstemezki ?");
         System.out.println(" ");
         System.out.println("Lütfen cevapları büyük harfle veriniz !");
         System.out.println(" ");
         
         Scanner soru = new Scanner(System.in);
         
         System.out.println("Soru 1");
         
         System.out.println("Hangisi Güneydoğu Anadolu bölgesinde değildir ?");
         System.out.println("A)Batman");
         System.out.println("B)Antalya");
         System.out.println("C)Siirt");
         
         String soru1 = soru.next();
         
         if ("A".equals(soru1)){
         System.out.println("Yanlış ! Doğru cevap B");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru1)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru1)){
         System.out.println("Yanlış ! Doğru cevap B");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("a".equals(soru1)){
         System.out.println("Lütfen cevapları büyük harfle veriniz !");
         System.out.println(" ");
         }
         
         if ("b".equals(soru1)){
         System.out.println("Lütfen cevapları büyük harfle veriniz !");
         System.out.println(" ");
         }
        
         if ("c".equals(soru1)){
         System.out.println("Lütfen cevapları büyük harfle veriniz !");
         System.out.println(" ");
         }
         
         System.out.println("Soru 2");
         
         System.out.println("Hangisi Kurtuluş Savaşı kadın kahramanlarından değildir ?");
         System.out.println("A)Kara Fatma");
         System.out.println("B)Nene Hatun");
         System.out.println("C)Hayme Ana");
         
         String soru2 = soru.next();
         
         if ("A".equals(soru2)){
         System.out.println("Yanlış ! Doğru cevap C");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru2)){
         System.out.println("Yanlış ! Doğru cevap C");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru2)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 3");
         
         System.out.println("İlk bilgisayarın adı nedir ?");
         System.out.println("A)BOT");
         System.out.println("B)ENIAC");
         System.out.println("C)COMPUTER");
         
         String soru3 = soru.next();
         
         if ("A".equals(soru3)){
         System.out.println("Yanlış ! Doğru cevap B" );
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru3)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru3)){
         System.out.println("Yanlış ! Doğru cevap B");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 4");
         
         System.out.println("Kişinin amcasının tek kardeşinin tek çocuğu kimdir ?");
         System.out.println("A)Kendisi");
         System.out.println("B)Kardeşi");
         System.out.println("C)Kuzeni");
         
         String soru4 = soru.next();
         
         if ("A".equals(soru4)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru4)){
         System.out.println("Yanlış ! Doğru cevap A");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru4)){
         System.out.println("Yanlış ! Doğru cevap A");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 5");
         
         System.out.println("6(12-4) + (4-2)9 sorusunun cevabı nedir ?");
         System.out.println("A)54");
         System.out.println("B)66");
         System.out.println("C)58");
         
         String soru5 = soru.next();
         
         if ("A".equals(soru5)){
         System.out.println("Yanlış ! Doğru cevap B");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru5)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru5)){
         System.out.println("Yanlış ! Doğru cevap B");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 6");
         
         System.out.println("Atmosferdeki gaz oranlarından hangisi yanlıştır ?");
         System.out.println("A)Azot %78");
         System.out.println("B)Oksijen %22");
         System.out.println("C)Diğer %1");
         
         String soru6 = soru.next();
         
         if ("A".equals(soru6)){
         System.out.println("Yanlış ! Doğru cevap B");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru6)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru6)){
         System.out.println("Yanlış ! Doğru cevap B");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         
         
         
         System.out.println("Soru 7");
         
         System.out.println("Diplomatların araba plakası ne renktir ?");
         System.out.println("A)Yeşil");
         System.out.println("B)Kırmızı");
         System.out.println("C)Mavi");
         
         String soru7 = soru.next();
         
         if ("A".equals(soru7)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru7)){
         System.out.println("Yanlış ! Doğru cevap A");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru7)){
         System.out.println("Yanlış ! Doğru cevap A");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 8");
         
         System.out.println("Ülkemizdeki elektrik üretimi en çok hangisinden yapılır ?");
         System.out.println("A)Hidro Elektrik Santrali");
         System.out.println("B)Termik Santral");
         System.out.println("C)Doğalgaz");
         
         String soru8 = soru.next();
         
         if ("A".equals(soru8)){
         System.out.println("Yanlış ! Doğru cevap C");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru8)){
         System.out.println("Yanlış ! Doğru cevap C");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru8)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 9");
         
         System.out.println("Hangisi Alman markası değildir ?");
         System.out.println("A)Audi");
         System.out.println("B)Wolkswagen");
         System.out.println("C)Peugeot");
         
         String soru9 = soru.next();
         
         if ("A".equals(soru9)){
         System.out.println("Yanlış ! Doğru cevap C");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru9)){
         System.out.println("Yanlış ! Doğru cevap C");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru9)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 10");
         
         System.out.println("Köfte yapmak isteyen kişi hangi malzemeyi kullanmaz ?");
         System.out.println("A)Karabiber");
         System.out.println("B)Zencefil");
         System.out.println("C)Kekik");
         
         String soru10 = soru.next();
         
         if ("A".equals(soru10)){
         System.out.println("Yanlış ! Doğru cevap B");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru10)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru10)){
         System.out.println("Yanlış ! Doğru cevap B");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 11");
         
         System.out.println("Duru sakin havada çıkan kuru soğuk anlamına gelen ayaz kelimesinin kökeni hangisidir ?");
         System.out.println("A)Aydınlık");
         System.out.println("B)Keskinlik");
         System.out.println("C)Karanlık");
         
         String soru11 = soru.next();
         
         if ("A".equals(soru11)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru11)){
         System.out.println("Yanlış ! Doğru cevap A");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru11)){
         System.out.println("Yanlış ! Doğru cevap A");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 12");
         
         System.out.println("Susam Sokağı’ndaki kukla karakterler Edi ile Büdü için hangisi doğrudur ?");
         System.out.println("A)Edi kaşsız, Büdü Ayrık kaşlıdır");
         System.out.println("B)Büdü Kaşsız, Edi ayrık kaşlıdır");
         System.out.println("C)Edi kaşsız, Büdü bitişik kaşlıdır");
         
         String soru12 = soru.next();
         
         if ("A".equals(soru12)){
         System.out.println("Yanlış ! Doğru cevap C");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru12)){
         System.out.println("Yanlış ! Doğru cevap C");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru12)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 13");
         
         System.out.println("Kuran'da hangisi üzerine yemin edilmemiştir ?");
         System.out.println("A)Arı");
         System.out.println("B)Güneş");
         System.out.println("C)Kalem");
         
         String soru13 = soru.next();
         
         if ("A".equals(soru13)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru13)){
         System.out.println("Yanlış ! Doğru cevap A");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru13)){
         System.out.println("Yanlış !Doğru cevap A");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 14");
         
         System.out.println("Türkçede kelimeler en çok hangi harfle başlar ?");
         System.out.println("A)M");
         System.out.println("B)K");
         System.out.println("C)R");
         
         String soru14 = soru.next();
         
         if ("A".equals(soru14)){
         System.out.println("Yanlış ! Doğru cevap B");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru14)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru14)){
         System.out.println("Yanlış ! Doğru cevap B");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 15");
         
         System.out.println("Hangi bilgi yanlıştır ?");
         System.out.println("A)Tilkiler ağaca tırmanamaz.");
         System.out.println("B)Denizanaları planktondur.");
         System.out.println("C)Uzaya dinozor fosili çıkartılmıştır.");
         
         String soru15 = soru.next();
         
         if ("A".equals(soru15)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru15)){
         System.out.println("Yanlış ! Doğru cevap A");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru15)){
         System.out.println("Yanlış ! Doğru cevap A");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 16");
         
         System.out.println("Türkiye “Mavi Akım” projesini aşağıdaki devletlerin hangisiyle gerçekleştirmiştir ?");
         System.out.println("A)Gürcistan");
         System.out.println("B)Rusya");
         System.out.println("C)Azerbaycan");
         
         String soru16 = soru.next();
         
         if ("A".equals(soru16)){
         System.out.println("Yanlış ! Doğru cevap C");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru16)){
         System.out.println("Yanlış ! Doğru cevap C");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru16)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 17");
         
         System.out.println("Hangisi Fransız heykeltıraş Rodin’in eserlerinden biri değildir ?");
         System.out.println("A)Uyuyan Kadın");
         System.out.println("B)Yürüyen Adam");
         System.out.println("C)Çömelen Kadın");
         
         String soru17 = soru.next();
         
         if ("A".equals(soru17)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru17)){
         System.out.println("Yanlış ! Doğru cevap A");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru17)){
         System.out.println("Yanlış ! Doğru cevap A");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 18");
         
         System.out.println("Caretta Caretta'nın diğer adı nedir ?");
         System.out.println("A)Akdeniz kaplumbağası");
         System.out.println("B)Sini kaplumbağası");
         System.out.println("C)Benekli kaplumbağa");
         
         String soru18 = soru.next();
         
         if ("A".equals(soru18)){
         System.out.println("Yanlış ! Doğru cevap B");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru18)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru18)){
         System.out.println("Yanlış ! Doğru cevap B");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 19");
         
         System.out.println("Boş bir arabaya 4 kişi bindi 3 indi 2 bindi 3 bindi 1 indi arabada kaç kişi kalır ?");
         System.out.println("A)6");
         System.out.println("B)4");
         System.out.println("C)5");
         
         String soru19 = soru.next();
         
         if ("A".equals(soru19)){
         System.out.println("Yanlış ! Doğru cevap C");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru19)){
         System.out.println("Yanlış ! Doğru cevap C");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru19)){
         System.out.println("Doğru !");
         puan -= 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         System.out.println("Soru 20");
         
         System.out.println("“Alçak Gönüllü” anlamına gelen kelimenin doğru yazılışı nasıldır ?");
         System.out.println("A)Mütavazi");
         System.out.println("B)Mütevazi");
         System.out.println("C)Mütevazı");
         
         String soru20 = soru.next();
         
         if ("A".equals(soru20)){
         System.out.println("Yanlış ! Doğru cevap C");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("B".equals(soru20)){
         System.out.println("Yanlış ! Doğru cevap C");
         puan -= 5;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         
         if ("C".equals(soru20)){
         System.out.println("Doğru !");
         puan += 10;
         System.out.println("Puan = " +puan);
         System.out.println(" ");
         }
         System.out.println("-------------------------------------");
         System.out.println("|                                   |");
         System.out.println("|  Tamamladığınız için teşekkürler  |");
         System.out.println("|                                   |");
         System.out.println("|         Coder: Menesay            |");
         System.out.println("|         Sorular: Sefaay           |");
         System.out.println("|                                   |");
         System.out.println("|              2021                 |");
         System.out.println("|              JAVA                 |");
         System.out.println("-------------------------------------");
         
        }
     }