
package calisanlarprogrami;


public class Calisan {
    private String ad;
    private String soyad;
    private String id;

    public Calisan(String ad, String soyad, String id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }

    public void bilgileriGoster(){
        
        System.out.println("Calisan Bilgilari...");
        System.out.println("Ad:" + ad);
        System.out.println("Soyad:" + soyad);
        System.out.println("Id:" + id);
    }
    
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
