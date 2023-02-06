import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double shippingPrice;
        double totalPrice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of your item: ");
        int price = Integer.parseInt(sc.nextLine());
        if(price < 100){
            shippingPrice = price * 0.02;
            totalPrice = shippingPrice + price;
            System.out.println("Your item is less than $100, so shipping is: " + shippingPrice + " and your total price is " + totalPrice);
        }else{
            totalPrice = price;
            System.out.println("Your item is more than $100, so shipping is free and your total price is " + totalPrice);
        }

    }
}