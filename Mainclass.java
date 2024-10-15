// define a class product with properties product id, name, and price
// define another class supplier that has an array of products
// in main class create a supplier. Add, remove and display supplier's products
import java.util.*;
class Product{
    private int id;
    private String name;
    private float price;
    public Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public void displayProduct(){
        System.out.println("Id: " + id + " name: " + name + " price: " + price) ;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
class Supplier{
    private Product productlist[];
    public Supplier(){
        productlist = new Product[10];
    }
    public void addProduct(Product p1){
        int i=0;
        while (i<productlist.length && productlist[i]!=null){
            i++;
        }
        productlist[i] =p1;
    }
    public void display(){
        int i=0;
        while (productlist[i]!=null && i< productlist.length){
            productlist[i].displayProduct();
            i++;
        }
    }
    public void removeProduct(int id){
        int i=0;
        boolean found = false;
        while (i< productlist.length && productlist[i]!=null){
            if (productlist[i].getId()==id){
                found = true;
                break;
            }
            i++;
        }
        if (found==true){
            for (int j=i;j< productlist.length-1;j++){
                productlist[j] = productlist[j+1];
            }
            System.out.println(id + " removed");
        }
        else {
            System.out.println("Invalid Id");
        }
    }
    public ArrayList<Product> convert(){
        int i=0;
        boolean found = false;
        ArrayList<Product> uniqueproduct = new ArrayList<>();
//        uniqueproduct.add(productlist[0]);
        while (i< productlist.length && productlist[i]!=null){
            for (int j=0;j< uniqueproduct.size();j++){
                if (productlist[i].getName().equalsIgnoreCase((uniqueproduct.get(j).getName()))){
                    found = true;
                }
            }
            if (found==false){
                uniqueproduct.add(productlist[i]);
            }
            i++;
            found = false;
        }
        return uniqueproduct;
    }
}
public class Mainclass {
    public static void main(String[] args) {

        Supplier s1 = new Supplier();
        Product p1 = new Product(10, "Computer", 30);
        Product p2 = new Product(20, "Computer", 60);
        s1.addProduct(p1);
        s1.addProduct(new Product(11, "Phone", 60));
        s1.addProduct(new Product(21, "Phone", 10000));
        s1.addProduct(p2);

        ArrayList<Product> conversion = s1.convert();
        for (int i=0;i<conversion.size();i++){
            conversion.get(i).displayProduct();
        }
    }
}
