package lesson12;

public enum City {

    KYIV(50, 80),
    LVIV (60, 60) {
        public void availablePostServices() {
            System.out.println("We can deliver via following post services: Ukrposhta, NP, Meest Express");
        }
    },
    KHARKIV(60){
        public void availablePostServices() {
            System.out.println("We can deliver via following post services: Ukrposhta, NP, Intime");
        }
    },
    ODESA(50),
    DNIPRO(55);

    private int postCost;
    private int currierCost;

    City(int postCost) {
        this.postCost = postCost;
    }

    City(int postCost, int currierCost) {
        this.postCost = postCost;
        this.currierCost = currierCost;
    }

    public int getPostCost() {
        return postCost;
    }

    public int getCurrierCost() {
        return currierCost;
    }

    public void availablePostServices() {
        System.out.println("We can deliver via following post services: Ukrposhta, NP");
    }
}
