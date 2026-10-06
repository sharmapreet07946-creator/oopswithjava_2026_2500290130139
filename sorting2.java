import java.util.*;
class Product{
    int productID;
    String name;
    int price;

    Product(int productID,String name,int price){
        this.productID=productID;
        this.name=name;
        this.price=price;
    }

}
class productComparator implements Comparator<Product>{
    public int compare(Product p1,Product p2){
            if(p1.price!=p2.price){
                return p2.price-p1.price;

            }
            else{
                return p1.name.compareTo(p2.name);
            }
    }
}
public class sorting2{
    public static void main(String[] args){
        ArrayList<Product> products=new ArrayList<>();
        products.add(new Product(11,"Laptop",80000));
        products.add(new Product(12,"Phone",40000));
        products.add(new Product(13,"Charger",8000));
        products.add(new Product(14,"AC",8000));
        Collections.sort(products,new productComparator());
        for(Product p:products){
        System.out.println(p.productID+" "+p.name+" "+p.price);
    }
    }
}