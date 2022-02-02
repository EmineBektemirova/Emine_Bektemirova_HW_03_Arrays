package com.product;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Product product = new Product("Products",
                100,
                "Clothes",
                "Great",
                ProductColor.red);

        Product dress = new Product("Dress",
                150,
                "For women",
                "Base",
                ProductColor.green);

        Product coat = new Product("Coat",
                200,
                "For men",
                "Great",
                ProductColor.blue);

        Product bag = new Product("Women bag",
                100,
                "Fashion",
                "Lux",
                ProductColor.red);


        Product [] products = {product, dress, coat, bag};

        Product [] withProductColorRed = new Product[products.length];
        Product [] withProductColorBlue = new Product[products.length];
        Product [] withProductColorGreen = new Product[products.length];
        Product [] withGreatInCategoryCount = new Product[products.length];
        Product [] moreThan100Count = new Product[products.length];

        for (int i = 0; i < products.length; i++) {

            if (products[i].getProductColor().equals(ProductColor.blue)) {
                withProductColorBlue[i] = products[i];
            }
            if (products[i].getProductColor().equals(ProductColor.red)) {
                withProductColorRed[i] = products[i];
            }
            if (products[i].getProductColor().equals(ProductColor.green)) {
                withProductColorGreen[i] = products[i];
            }
            if (products[i].getCategory().matches("(.*)Great(.*)")) {
                withGreatInCategoryCount = products ;
            }
            if (products[i].getCost() > 100) {
                moreThan100Count[i] = products[i];
            }
        }

        System.out.println("All products " + Arrays.toString(products));
        System.out.println("Product color is blue: " + Arrays.toString(withProductColorBlue));
        System.out.println("Product color is red: " + Arrays.toString(withProductColorRed));
        System.out.println("Product color is green: " + Arrays.toString(withProductColorGreen));
        System.out.println("Great products: " + Arrays.toString(withGreatInCategoryCount));
        System.out.println("Products cost > 100: " + Arrays.toString(moreThan100Count));

    }

}
