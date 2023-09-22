package RestaurantBillGenerator;

import java.util.Scanner;

public class RestaurantBillGenerator {
    /*
Proje: Restaurant Fiş Üretme Uygulaması(BillGenerator)
       1-Bir restaurantın online sipariş sisteminde hesabı
       yazdıran uygulama tasarlayınız.

       2-Restauranttaki yiyecekler bir listte tutulsun.
         Yiyeceklerin kodu, ismi ve ücreti olsun.

       3-Yiyecek menüsünü gösterme, sipariş oluşturma/iptal ve hesap
         oluşturma için seçim menüsü gösterilsin.

       4-Yiyecek menü:Listedeki yiyecekler menü şeklinde listelensin
         Sipariş girme:Yiyeceğin kodu ve istenilen adet girilerek sipariş oluşturulsun
                       Her sipariş için kod üretilsin(başlangıç 1000 artarak devam eder)
                       Her bir yiyecek siparişi için tutar hesaplansın

         Sipariş iptal:Sipariş kodu girilerek sipariş silinsin
         Hesap oluşturma: Tutarları ile birlikte tüm siparişleri ve
                          toplam tutarı gösteren bir hesap fişi yazdırılsın.
*/

    public static void main(String[] args) {
        getSelectionMenu();
    }
    //1. adım Seçim menüsü
    private static void getSelectionMenu() {
        DishService ds=new DishService();
        Scanner scan=new Scanner(System.in);
        int select=-1;
        while(select!=0){
            System.out.println("-".repeat(30));
            System.out.println("******* Lezzet Rastaurant Sipariş Uygulaması *******");
            System.out.println("1-Menü");
            System.out.println("2-Sipariş Gir");
            System.out.println("3-Sipariş İptal");
            System.out.println("4-Hesap Oluştur");
            System.out.println("0-Çıkış");
            System.out.println("Seçiminiz");
            select=scan.nextInt();
            System.out.println("-".repeat(30));

            switch (select){
                case 1:
                    ds.showMenu();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("İyi Günler");
                    break;
                default:
                    System.out.println("Hatalı Giriş");
                    break;
            }
        }

    }
}
