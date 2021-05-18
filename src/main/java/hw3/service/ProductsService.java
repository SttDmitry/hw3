package hw3.service;


import hw3.entities.Product;
import hw3.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {
    private ProductsRepository productsRepository;

    @Autowired
    public void setProductsRepository(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public Product getProductById(int id) {
        Product product = productsRepository.findOneById(id);
        return product;
    }

    public List<Product> getProducts(){
        return productsRepository.listOfProducts();
    }

    public void addProduct(int id, String title, int cost){
        if (productsRepository.addProduct(id, title, cost)){
            System.out.println("Product added!");
        }
    }



    public ProductsService() {
    }
}