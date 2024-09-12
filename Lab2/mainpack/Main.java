/*Product: id, Найменування, Виробник, Ціна, Термін зберігання, Кількість.
Скласти масив об'єктів. Вивести:
a) список товарів для заданого найменування;
b) список товарів для заданого найменування, ціна яких не перевищує задану;
c) список товарів, термін зберігання яких більше заданого. 
*/
package mainpack;
import prodpack.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Milk", "DairyCo", 25.5, 7, 100),
            new Product(2, "Bread", "BakeryCo", 12.0, 5, 200),
            new Product(3, "Milk", "FarmFresh", 28.0, 10, 150),
            new Product(4, "Cheese", "DairyCo", 60.0, 30, 50)
        };

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("Enter what you want to do: ");
            System.out.println("1 - Print all products");
            System.out.println("2 - Print all by name");
            System.out.println("3 - Print all by name and lower than a specified price");
            System.out.println("4 - Print all with term of use bigger than a specified value");
            System.out.println("5 - Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("All Products:");
                    for (Product product : products) {
                        product.display();
                    }
                    break;
    
                case 2:
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.println("Products with name '" + name + "':");
                    for (Product product : products) {
                        if (product.getName().equalsIgnoreCase(name)) {
                            product.display();
                        }
                    }
                    break;
    
                case 3:
                    System.out.print("Enter product name: ");
                    String productName = scanner.next();
                    System.out.print("Enter maximum price: ");
                    double maxPrice = scanner.nextDouble();
                    System.out.println("Products with name '" + productName + "' and price <= " + maxPrice + ":");
                    for (Product product : products) {
                        if (product.getName().equalsIgnoreCase(productName) && product.getPrice() <= maxPrice) {
                            product.display();
                        }
                    }
                    break;
    
                case 4:
                    System.out.print("Enter minimum term of Use in days: ");
                    int mintermOfUse = scanner.nextInt();
                    System.out.println("Products with term of Use > " + mintermOfUse + " days:");
                    for (Product product : products) {
                        if (product.gettermOfUse() > mintermOfUse) {
                            product.display();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Good Bye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
        

        scanner.close();
    }
}

