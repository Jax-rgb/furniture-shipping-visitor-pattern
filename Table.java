public class Table implements Furniture {
    private final String name;
    private final double size; // volume in m³

    public Table(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visit(this);
    }
}
