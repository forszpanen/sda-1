package pl.sda.poznan.shop;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductRepositoryTest {

    private Cart cart;
    private ProductRepository productRepository;

    @Before
    public void beforeClass(){
        productRepository = mock(ProductRepository.class);

        cart = new Cart();
        Product p = new Product(1, "Laptop", 1200);
        Product p1 = new Product(1, "Laptop", 1200);
        Product p2 = new Product(1, "Laptop", 1200);

        when(productRepository.countAllProducts()).thenReturn(3);
        when(productRepository.getAllProducts()).thenReturn(Arrays.asList(p, p1, p2));

    }


    @Test
    public void getAllProductsFromDb() throws Exception {
        List<Product> allProducts = productRepository.getAllProducts();
        System.out.println("Works!");
    }

    @Test
    public void addProductToCart() throws Exception {
        List<Product> allProducts = productRepository.getAllProducts();
        cart.addProduct(allProducts.get(0));

        assertEquals(1, cart.getCartSize());
    }

    @Test
    public void testDiscount(){
//        cart.addDiscount(10);
        cart.addProducts(productRepository.getAllProducts());
        assertEquals(3600, cart.sumPrice(), 0);
    }

    @Test
    public void testDiscount2(){
        cart.addProducts(productRepository.getAllProducts());
        cart.addDiscount(10);
        assertEquals(3240, cart.sumPrice(), 0);
    }

}