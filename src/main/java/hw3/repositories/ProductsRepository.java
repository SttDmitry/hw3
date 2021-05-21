package hw3.repositories;

import hw3.entities.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductsRepository {

    List<Product> products = new ArrayList<>(Arrays.asList());


    public Product findOneById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return products.get(i);
            }
        }
        return null;
    }

    public List<Product> listOfProducts () {
        return products;
    }

//    public boolean addProduct(int id, String title, int cost) {
//        Product product = new Product(id, title, cost);
//        if (findOneById(id) == null) {
//            products.add(product);
//            return true;
//        }
//        return false;
//    }

    public void addProductToList (Product product){
        products.add(product);
    }
}
