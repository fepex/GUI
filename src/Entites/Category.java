package Entites;

/**
 * Created by aser1 on 19.11.2015.
 */
public class Category {
    private int id;
    private String name;
    private Category parent;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Category(int id,String name,Category category){
        this(id,name);
        this.parent = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getParent() {
        return parent;
    }
}
