package secondunit.weight;

import java.util.ArrayList;

class Product {
  private String name;
  private int price;
  private String brand;

  Product() {

  }

  Product(String name, int price, String brand) {
    setName(name);
    setPrice(price);
    setBrand(brand);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;

  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }
}

class ShoppingCart {
  private ArrayList<Product> products;

  public ShoppingCart() {
    this.products = new ArrayList<>();
  }

  public void addProduct(Product product) {
    this.products.add(product);
  }

  public void removeProduct(Product product) {
    this.products.remove(product);
  }

  public boolean containsProduct(Product product) {
    return products.contains(product);
  }

  public int sizeShoppingCart() {
    return products.size();
  }

  public Product getProduct(int index) {
    return products.get(index);
  }

  public ArrayList<Product> getProducts() {
    return products;
  }
}

public class SuperMarket {

  public static void main(String[] args) {
    ShoppingCart shoppingCart = new ShoppingCart();

    for (int i = 1; i <= 10; i++) {
      Product product = new Product("Product " + i, 10 * i, "Brand " + i);
      shoppingCart.addProduct(product);
    }
    printReceipt(shoppingCart);
    getTotal(shoppingCart);
  }

  public static void printReceipt(ShoppingCart shoppingCart) {
    double total = 0.0;

    System.out.println("Receipt:");
    for (Product product : shoppingCart.getProducts()) {
      System.out.println("Product: " + product.getName() + " - Price: " + product.getPrice());
      total += product.getPrice();
    }

    System.out.println("subtotal: " + total);
    System.out.println("iva: " + total * (0.16));
  }

  public static void getTotal(ShoppingCart shoppingCart) {
    double total = 0.0;

    for (Product product : shoppingCart.getProducts()) {
      total += product.getPrice();
    }
    total = total * (1.16);

    System.out.println("Total: " + total);
  }
}
