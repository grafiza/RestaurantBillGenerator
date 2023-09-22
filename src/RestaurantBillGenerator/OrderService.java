package RestaurantBillGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderService {
    Scanner scan=new Scanner(System.in);
    public List<Order> orderList = new ArrayList<Order>();

    public void createOrder( DishService dishService) {
        int dishCode=-1;
        do {
            System.out.println("Lütfen ürün kodunu giriniz. (Çıkış için :0)");
            dishCode=scan.nextInt();// bu code ile dish objesini bulmamız gerekiyor
            //Order
            Dish dish=dishService.findDishByCode(dishCode);
            if(dish!=null){
                System.out.println("Adet Giriniz");
                int number=scan.nextInt();
                //bu yemek daha önce sipariş edilmiş mi
                
            }
            System.out.println("");
        }while(dishCode!=0);
    }

}
