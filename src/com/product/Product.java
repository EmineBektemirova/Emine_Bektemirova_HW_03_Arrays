package com.product;

public class Product {
    String name;
    int cost;
    String description;
    String category;
    ProductColor color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (cost != product.cost) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (description != null ? !description.equals(product.description) : product.description != null) return false;
        if (category != null ? !category.equals(product.category) : product.category != null) return false;
        return color == product.color;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + cost;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", color=" + color +
                '}';
    }

    public Product(String name, int cost, String description, String category, ProductColor color) {
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.category = category;
        this.color = color;
    }


    public ProductColor getProductColor() {

        return color;
    }

    public int getCost() {
        return cost;
    }

    public String getCategory() {

        return category;
    }
}