import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductControllerTest {

    private ProductController productController;
    private ProductRepository productRepository;

    @Before
    public void initialize(){
        productRepository = mock(ProductRepository.class);
        productController = new ProductController();

        Product p = new Product(1, "Laptop", 3500);
        Product p1 = new Product(2, "Telefon", 2300);
        Product p2 = new Product(2, "Telewizor", 1500);
        Product p3 = new Product(2, "Ekspres do kawy", 4000);

        when(productRepository.countAllProducts()).thenReturn(4);
        when(productRepository.getAllProducts()).thenReturn(Arrays.asList(p, p1, p2, p3));

    }

    @Test
    public void getAllProductsFromDB() throws Exception{
        List<Product> allProducts = productRepository.getAllProducts();
        System.out.println("Works!");
    }

    @Test
    public void sumPrice() throws Exception {
        productController.addProducts(productRepository.getAllProducts());
        assertEquals(11300, productController.sumPrice(), 0);
    }

    @Test
    public void addDiscount() throws Exception {
        productController.addProducts(productRepository.getAllProducts());
        productController.addDiscount(10);
        assertEquals(10170, productController.sumPrice(), 0);
    }

}
