public class MyItem {
    private int id;
    private int quantity;
    private int price;
    private String description;

    MyItem(String desc, int quantity, int price) {
        this.description = desc;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDataStr() {
        return String.format("'%s',%d,%d", this.description, this.quantity, this.price);
    }

    public String getFormattedData() {
        return String.format("ID: %d\nDescription: %s\nQuantity: %d\nPrice: %d", this.id, this.description,
                this.quantity, this.price);
    }
}
