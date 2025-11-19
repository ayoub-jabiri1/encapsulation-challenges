import java.util.ArrayList;

public class Command {
    private int id;
    private ArrayList<Product> products = new ArrayList<>();

    Command(int id) {
        this.id = id;
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }

    public void calcTotal() {
        double total = 0;

        for (int i = 0; i < this.products.size(); i++) {
            double productUnitPrice = this.products.get(i).getUnitPrice();
            int productQuantity = this.products.get(i).getQuantity();

            total += productUnitPrice * productQuantity;
        }

        System.out.println("The total: " + total);
    }
}
