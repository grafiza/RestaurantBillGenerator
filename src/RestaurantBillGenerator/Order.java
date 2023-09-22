package RestaurantBillGenerator;

public class Order {
    private static int count=999;
    private int orderCode;
    private Dish dish;
    private int numberOfDish;
    private double orderPrice;

    //yemek ve adedini kullanarak order objemiz oluşsun


    public Order(Dish dish, int numberOfDish) {
        count++;
        this.orderCode=count;
        this.dish = dish;
        this.numberOfDish = numberOfDish;
    }
public void setOrderPrice(){
        this.orderPrice=this.dish.getPrice()*this.numberOfDish;
}

    public void setNumberOfDish(int numberOfDish) {
        this.numberOfDish = numberOfDish;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public Dish getDish() {
        return dish;
    }

    public int getNumberOfDish() {
        return numberOfDish;
    }

    public double getOrderPrice() {
        return orderPrice;
    }
}
