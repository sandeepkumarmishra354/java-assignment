public class MyItem {
    private int id;
    public int quantity;
    public int price;
    public String description;

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

    public String getDataStr() {
        return String.format("'%s',%d,%d", this.description, this.quantity, this.price);
    }

    public String getFormattedData() {
        return String.format("ID: %d\nDescription: %s\nQuantity: %d\nPrice: %d", this.id, this.description,
                this.quantity, this.price);
    }
}
