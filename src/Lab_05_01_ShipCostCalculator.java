public class Lab_05_01_ShipCostCalculator {
    public Lab_05_01_ShipCostCalculator() {
    }
    public static void  main(String[] args) {
        int itemCost = 107;
        double shippingCost = itemCost * 0.02;
        double  finalCost = shippingCost + itemCost;
        if (itemCost >= 100) {
            System.out.println("Your shipping is free, your cost is: $" + itemCost);
        }else if (itemCost < 100){
            System.out.println("Your shipping cost is: $" + shippingCost + " your total cost is: $" + finalCost);
        }
    }
}