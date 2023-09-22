package RestaurantBillGenerator;

public class Dish {//POJO class
    private int code;
    private String name;
    private double price;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }



    public Dish(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }
}
