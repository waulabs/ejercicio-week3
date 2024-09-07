package org.alvarowau.model;

import java.math.BigDecimal;
import org.apache.commons.lang3.StringUtils;
public class Product {

    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        setName(name);
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = StringUtils.capitalize(StringUtils.strip(name.toLowerCase()));
        } else {
            this.name = "Sin nombre";
        }
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
