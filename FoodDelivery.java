import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int veganMenus = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenMenus * 10.35;
        double fishPrice = fishMenus * 12.40;
        double veganPrice = veganMenus * 8.15;

        double menusPrice = chickenPrice + fishPrice + veganPrice;
        double dessertPrice = 0.2 * menusPrice;
        double deliveryPrice = 2.50;

        double finalPrice = menusPrice + dessertPrice + deliveryPrice;

        System.out.println(finalPrice);
    }
}
