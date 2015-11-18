package Repository;

import Entites.Category;
import Entites.Product;

import java.util.ArrayList;

public class ProductRepo {
    public static void add(Product product){

    }
    public static ArrayList<Product> getAll(){
        ArrayList<Product> products = new ArrayList<Product>();
        for (int i = 0; i < 20; i++) {
            products.add(new Product(i,"name"+new Integer(i).toString(),400,100,"LOL",new Category(1,"Test"),"sutTest"));
        }
        return products;
    }
}
