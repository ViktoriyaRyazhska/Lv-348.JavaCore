package third_lesson;

public class Product {
    private String name;
    private float price;
    private int quantity;

    public Product(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Price: " +price + ", Quantity: " + quantity+ ".";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {

        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void getMostExpensive(Product fPr, Product sPr, Product tPr, Product foPr, Product fiPr) {

        if (fPr.getPrice() > sPr.getPrice() && fPr.getPrice() > tPr.getPrice() && fPr.getPrice() > foPr.getPrice() && fPr.getPrice() > fiPr.getPrice()) {
            System.out.println("Name: " + fPr.getName() + ", Quantity: " + fPr.getQuantity());
        }
        if (sPr.getPrice() > fPr.getPrice() && sPr.getPrice() > tPr.getPrice() && sPr.getPrice() > foPr.getPrice() && sPr.getPrice() > fiPr.getPrice()) {
            System.out.println("Name: " + sPr.getName() + ", Quantity: " + sPr.getQuantity());
        }
        if (tPr.getPrice() > sPr.getPrice() && tPr.getPrice() > fPr.getPrice() && tPr.getPrice() > foPr.getPrice() && tPr.getPrice() > fiPr.getPrice()) {
            System.out.println("Name: " + tPr.getName() + ", Quantity: " + tPr.getQuantity());
        }
        if (foPr.getPrice() > sPr.getPrice() && foPr.getPrice() > tPr.getPrice() && foPr.getPrice() > fPr.getPrice() && foPr.getPrice() > fiPr.getPrice()) {
            System.out.println("Name: " + foPr.getName() + ", Quantity: " + foPr.getQuantity());
        }
        if (fiPr.getPrice() > sPr.getPrice() && fiPr.getPrice() > tPr.getPrice() && fiPr.getPrice() > foPr.getPrice() && fiPr.getPrice() > fPr.getPrice()) {
            System.out.println("Name: " + fiPr.getName() + ", Quantity: " + fiPr.getQuantity());
        }
    }
    public static void getMostQuantity(Product fPr, Product sPr, Product tPr, Product foPr, Product fiPr){
        if (fPr.getQuantity() > sPr.getQuantity() && fPr.getQuantity() > tPr.getQuantity()&& fPr.getQuantity() > foPr.getQuantity() && fPr.getQuantity() > fiPr.getQuantity()) {
            System.out.println("Name: " + fPr.getName());
        }
        if (sPr.getQuantity() > fPr.getQuantity() && sPr.getQuantity() > tPr.getQuantity() && sPr.getQuantity() > foPr.getQuantity() && sPr.getQuantity() > fiPr.getQuantity()) {
            System.out.println("Name: " + sPr.getName());
        }
        if (tPr.getQuantity() > sPr.getQuantity() && tPr.getQuantity() > fPr.getQuantity() && tPr.getQuantity() > foPr.getQuantity() && tPr.getQuantity() > fiPr.getQuantity()) {
            System.out.println("Name: " + tPr.getName());
        }
        if (foPr.getQuantity() > sPr.getQuantity() && foPr.getQuantity() > tPr.getQuantity() && foPr.getQuantity() > fPr.getQuantity() && foPr.getQuantity() > fiPr.getQuantity()) {
            System.out.println("Name: " + foPr.getName());
        }
        if (fiPr.getQuantity() > sPr.getQuantity() && fiPr.getQuantity() > tPr.getQuantity() && fiPr.getQuantity() > foPr.getQuantity() && fiPr.getQuantity() > fPr.getQuantity()) {
            System.out.println("Name: " + fiPr.getName());
        }
    }
}
