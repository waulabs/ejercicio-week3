package org.alvarowau;

import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;
import org.alvarowau.model.Product;

import java.math.BigDecimal;

public class Main {
    private final static Gson GSON = new Gson();

    public static void main(String[] args) {

        Product product1 = new Product("mouse", new BigDecimal("67.9"));
        testProduct(product1);

        Product product2 = new Product("LAPTOP", new BigDecimal("1200.00"));
        testProduct(product2);

        Product product3 = new Product("  tablet  ", new BigDecimal("299.99"));
        testProduct(product3);

        Product product4 = new Product("smartphone@2024", new BigDecimal("799.50"));
        testProduct(product4);

        Product product5 = new Product("NEW GAMING PC", new BigDecimal("1500.00"));
        testProduct(product5);

        Product product6 = new Product("", new BigDecimal("50.00"));
        testProduct(product6);

        Product product7 = new Product(null, new BigDecimal("75.00"));
        testProduct(product7);
    }


    private static String convertString(Product product) {
        return GSON.toJson(product);
    }


    private static Product convertProduct(String json) {
        return GSON.fromJson(json, Product.class);
    }

    // Método para probar la conversión y mostrar resultados
    private static void testProduct(Product product) {
        // Mostrar producto antes de convertir a JSON
        System.out.println("Original Product: " + product);

        // Convertir producto a JSON
        String json = convertString(product);
        System.out.println("JSON Representation: " + json);

        // Convertir JSON de vuelta a un objeto Product
        Product convertedProduct = convertProduct(json);
        System.out.println("Converted Product from JSON: " + convertedProduct);

        System.out.println("----------------------------------------------------");
    }
}
