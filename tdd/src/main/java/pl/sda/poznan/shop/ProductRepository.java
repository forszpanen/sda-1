package pl.sda.poznan.shop;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

//Repozytorium do pobierania z bazy
public class ProductRepository {



    public ProductRepository() {
    }

    public List<Product> getAllProducts() {
        //get all Products from db
        throw new NotImplementedException();
    }

    public void addNewProduct(Product p) {
        //add new Product to Database
        throw new NotImplementedException();
    }

    public void removeProduct(Product p) {
        //remove product from Database
        throw new NotImplementedException();
    }

    public int countAllProducts(){
        throw new NotImplementedException();
    }



}
