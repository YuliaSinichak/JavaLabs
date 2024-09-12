package prodpack;

public class Product {
    private int id;
    private String name;
    private String manufacturer;
    private double price;
    private int termOfUse; 
    private int quantity;

    public Product(int id, String name, String manufacturer, double price, int termOfUse, int quantity) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.termOfUse = termOfUse;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int gettermOfUse() {
        return termOfUse;
    }

    public void settermOfUse(int termOfUse) {
        this.termOfUse = termOfUse;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Manufacturer: " + manufacturer +
                ", Price: " + price + ", Shelf Life: " + termOfUse + " days, Quantity: " + quantity);
    }
}

