// Case Study 6. Product Price System
// An online shopping system stores:
// •	Product ID 
// •	Product name 
// •	Price 
// Requirement:
// The Product class should implement Comparable<Product> and products should be sorted by price from lowest to highest.
// Example:
// Mouse       500
// Keyboard   1000
// Headphone  2000
// Laptop    50000

import java.util.*;

class Product implements Comparable<Product>{
    int productID;
    String name;
    int price;
    Product(int productID,String name,int price){
         this.productID=productID;
         this.name=name;
         this.price=price;
    }
    public int compareTo(Product p){
        return this.price-p.price;
    }
}
public class sorting6{
    public static void main(String[] args){
        ArrayList<Product>products=new ArrayList<>();
        products.add(new Product(1,"Laptop",20000));
        products.add(new Product(2,"Computer",200));
        products.add(new Product(3,"Charger",2000));
        products.add(new Product(4,"CPU",80000));
        products.add(new Product(5,"Car",1000000));
        Collections.sort(products);
        for(Product p:products){
            System.out.println(p.productID+" "+p.name+" "+p.price);
        }
    }
}