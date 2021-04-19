import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        ProductManager manager = new ProductManager(products);
        Menu menu = new Menu(manager);
        menu.menu();
    }
}
