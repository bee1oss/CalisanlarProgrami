
package calisanlarprogrami;

import java.util.Scanner;


public class CalisanlarProgrami {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calisanlar Programina Hosgaldiniz...");
        String islemler = "Islemler...\n"
                + "1.Yazilimci Islemleri\n"
                + "2.Yonetici Islemleri\n"
                + "Cikis icin q tusuna basin...";
        System.out.println("**********************");
        System.out.println(islemler);
        System.out.println("");
        System.out.println("**********************");
        while(true){
            System.out.print("Islemi seciniz:");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan Cikiliyor...");
                break;
            }
            else if(islem.equals("1")){
                /*System.out.print("Ad:");
                String ad = scanner.nextLine();
                
                System.out.print("Soyad:");
                String soyad = scanner.nextLine();
                
                System.out.print("Id:");
                String id = scanner.nextLine();
                
                System.out.print("Diller:");
                String diller = scanner.nextLine();*/
                
                Yazilimci yazilimci = new Yazilimci("Begench", "Hajyyev", "a12", "Python,Java,PHP,Ruby,Swift,C++");
                yazilimci.bilgileriGoster();
                String yazilimci_islem = "1.Format at\n"
                        + "2.Bilgileri goster\n"
                        + "Cikis icin q'ya basin...";
                System.out.println(yazilimci_islem);
                while(true){
                    
                    System.out.print("Yazilimci islemleri seciniz:");
                    String y_islem = scanner.nextLine();
                    if(y_islem.equals("q")){
                        System.out.println("Yazilimci islemlerinden cikiliyor...");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        String isletim_sistemi = scanner.nextLine();
                        System.out.print("Islemtinsistemi:");
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if(y_islem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }
                    else{
                        System.out.println("Gecersiz Yazilimci izlemi...");
                    }
                }
            }
            else if(islem.equals("2")){
                Yonetici yonetici = new Yonetici("Ferhat","Zibidi","2131as",1);
                String yonIslem = "Yonetici Islemleri\n"
                        + "1.Zam Yap/n"
                        + "2.Bilgileri Goster\n"
                        + "Islemden cikmak icin q'ya basin...";
                System.out.println(yonIslem);
                while(true){
                    
                    System.out.print("Yonetici islemleri seciniz:");
                    String yslem = scanner.nextLine();
                    if(yslem.equals("q")){
                        System.out.println("Yonetici islemlerinden cikiliyor...");
                        break;
                    }
                    else if(yslem.equals("1")){
                        System.out.print("Zam miktari:");
                        int yapzam = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(yapzam);
                        
                    }
                    else if(yslem.equals("2")){
                        yonetici.bilgileriGoster();
                    }
                    else{
                        System.out.println("Gecersiz Yazilimci izlemi...");
                    }
                }
            }
            else{
                System.out.println("Gecersiz islem...");
            }
        }
    }
    
}
