import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int weight;

    public Product(String name, double price, int weight) {
        this.name = ValidateUtils.validateString(name,"Default");
        this.price =  ValidateUtils.validateDouble( price,0.0);
        this.weight = (int) ValidateUtils.validateInteger( weight,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidateUtils.validateString(name,"Default");;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = ValidateUtils.validateDouble( price,0.0);;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = (int) ValidateUtils.validateInteger( weight,0);;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && weight == product.weight && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
