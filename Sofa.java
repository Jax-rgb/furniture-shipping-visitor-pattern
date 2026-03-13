public class Sofa implements Furniture {
    private final String name;
    private final double size;      // volume in m³
    private final double distance;  // shipping distance in km (for bulky items)

    public Sofa(String name, double size, double distance) {
        this.name = name;
        this.size = size;
        this.distance = distance;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visit(this);
    }
}
