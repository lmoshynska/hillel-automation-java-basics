package lesson12;

public class Delivery {

    public String deliveryOptions(City city) {
        String deliveryOptions;
        switch(city) {
            case KYIV:
            case LVIV: deliveryOptions = "Post, Currier"; break;
            case ODESA:
            case DNIPRO:
            case KHARKIV: deliveryOptions = "Post"; break;
            default: return  "We don't deliver to this city";
        }
        return deliveryOptions;
    }

    public void printDeliveryOptions(City city){
        System.out.println("Delivery options for " + city + " are: " + deliveryOptions(city));
    }

    public void deliveryCost(City city) {
        if(deliveryOptions(city).contains("Currier")) {
            System.out.println("Cost of delivery to " + city + " is " + city.getCurrierCost() + " UAH by currier " +
                    "and " + city.getPostCost() + " UAH by post");
        } else {
            System.out.println("Cost of delivery to " + city + " is " + city.getPostCost() + " UAH by post");
        }
    }

    public void getDeliveryService(City city) {
        city.availablePostServices();
    }

    public boolean isDeliverable(City city) {
        for(City cityToDeliver : City.values()) {
            if(cityToDeliver == city) {
                System.out.println("We deliver to " + city);
                return true;
            }
        }
        System.out.println("We don't deliver to this city");
        return false;
    }

    public void listAllOptionsForDelivery(City city) {
        if(isDeliverable(city)) {
            printDeliveryOptions(city);
            deliveryCost(city);
            getDeliveryService(city);
        }
    }
}
