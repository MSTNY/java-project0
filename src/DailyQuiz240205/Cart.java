package DailyQuiz240205;

public class Cart {
    Product[] products;

    Cart(Product[] products) {
        this.products = products;
    }

    int getDeliveryChargeByWeight(double totalWeight) {
        int deliveryChargeByWeight = 0;
        if (totalWeight < 3) {
            deliveryChargeByWeight += 1000;
        } else if (totalWeight < 10) {
            deliveryChargeByWeight += 5000;
        } else {
            deliveryChargeByWeight += 10000;
        }
        return deliveryChargeByWeight;
    }

    public int calculateDeliveryCharge() {

        double totalWeight = 0;
        int totalPrice = 0;
        int totalDiscountAmount = 0;
        for (Product product : products) {
            totalWeight += product.getWeight();
            totalPrice += product.getPrice();
            totalDiscountAmount += product.getDiscountAmount();
        }

        int deliveryCharge = getDeliveryChargeByWeight(totalWeight);
        int finalPrice = totalPrice - totalDiscountAmount;
        if (finalPrice >= 100000) {
            return 0;
        } else if (finalPrice >= 30000) {
            deliveryCharge -= 1000;
        }
        return deliveryCharge;
    }
}
