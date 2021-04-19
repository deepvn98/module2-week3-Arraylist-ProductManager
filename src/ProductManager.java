import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> products;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ProductManager(ArrayList<Product> products) {
        this.products = products;
    }

//thêm sản phẩm
    public void addProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Product id: ");
        String id = scanner.nextLine();
        System.out.print("Enter product name : ");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        System.out.print("Enter Product price: ");
        Scanner scanner2 = new Scanner(System.in);
        double price = scanner2.nextDouble();
        Product product = new Product(id,name,price);
        products.add(product);
    }
//Sửa sản phẩm tìm theo tên
    public void editProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm bạn muốn sửa: ");
        String name = scanner.nextLine();
        int cout = 0;
        for (int i = 0; i<products.size(); i++) {
            if (products.get(i).getName().equals(name)){
                cout++;
                System.out.println("Sửa Sản phẩm thứ "+cout+" cùng với tên bạn tìm!");
                Scanner scanner1 = new Scanner(System.in);
                System.out.print("Enter new product ID: ");
                String id = scanner1.nextLine();
                Scanner scanner2 = new Scanner(System.in);
                System.out.print("Enter new Product Name: ");

                String newName = scanner2.nextLine();
                Scanner scanner3 = new Scanner(System.in);
                System.out.print("Enter new product Price: ");

                double price = scanner3.nextDouble();
                Product product = new Product(id,newName,price);
                products.set(i,product);

            }
        }
    }
    public void deleteProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm bạn muốn xoá: ");
        String name = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)){
                products.remove(i);
                i--;
            }
        }
    }
    public void showProduct(){
        for (Product o: products) {
            System.out.println(o.toString());
        }
    }
}
