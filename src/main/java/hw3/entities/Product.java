package hw3.entities;

public class Product {
    private int id;
    private String title;
    private int cost;

//    public Product(){
//    }
//
//    public Product (int id, String title, int cost){
//        this.id = id;
//        this.title = title;
//        this.cost = cost;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String toString () {
        return "id: " + id + ", " + title + ", cost:" + cost;
    }
}
