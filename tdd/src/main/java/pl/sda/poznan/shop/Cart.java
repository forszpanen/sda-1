package pl.sda.poznan.shop;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> productList = new ArrayList<>();
    public void addProduct(Product p){
        productList.add(p);
    }

    public void addProducts(List<Product> p){
        productList.addAll(p);
    }

    public void deleteProduct(Product p){
        productList.remove(p);
    }

    public double sumPrice() {
        double sum = productList.stream().mapToDouble(Product::getPrice).sum();
        return sum;
    }

    public void addDiscount(int percent) {
        productList.forEach(p -> p.setPrice(p.getPrice() - (p.getPrice() * percent / 100)));
    }

    public int getCartSize(){
        return productList.size();
    }


}
