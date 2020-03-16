package ar.com.ada.sb.api.di.service;

import ar.com.ada.sb.api.di.model.dto.Product;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service("productService")
public class ProductService {
    // gestionan logica de aplicacion
    public Product saveNewProduct(Product product) throws Exception {
        if(product == null)
            throw new Exception("Product can't be null");
        long id = new Random().nextLong() % (100 - 10) + 10;
        product.setId(id);

        return null;
    }
}
