import java.util.Scanner;

public class Menu {
    private ProductManager element;

    public ProductManager getElement() {
        return element;
    }

    public void setElement(ProductManager element) {
        this.element = element;
    }

    public Menu(ProductManager element) {
        this.element = element;
    }
    public void menu(){
        boolean check = true;
        while (check){
            System.out.println(" Nhấn 1:Để thêm mới sản phẩm: \n Nhấn 2:Để sửa sản phẩm: \n Nhấn 3:Để xoá sản phẩm: \n Nhấn 4:Để hiển thị danh sách sản phẩm: \n Nhấn 5:Để thoát!");
            Scanner scanner =new Scanner(System.in);
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    element.addProduct();
                    break;
                case 2:
                    element.editProduct();
                    break;
                case 3:
                    element.deleteProduct();
                    break;
                case 4:
                    element.showProduct();
                    break;
                case 5:
                    check = false;
//                default:
//                    break;
            }
//            if (input == 5){
//                break;
//            }
        }
    }
}
