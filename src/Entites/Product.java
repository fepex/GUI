package Entites;

/**
 * Created by aser1 on 19.11.2015.
 */
public class Product {
    private int id;
    private String name;
    private int price;
    private int weight;
    private String manufacturer;
    private Category category;
    private String subCategory;

    public Product(String name, int price, int weight, String manufacturer, Category category, String subCategory) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.category = category;
        this.subCategory = subCategory;
    }

    public Product(int id, String name, int price, int weight, String manufacturer, Category category, String subCategory) {
        this(name,price,weight,manufacturer,category,subCategory);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Category getCategory() {
        return category;
    }

    public String getSubCategory() {
        return subCategory;
    }
}
