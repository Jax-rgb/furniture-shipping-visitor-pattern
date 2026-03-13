public class FurnitureShippingCalculator implements ShippingVisitor {

    @Override
    public double visit(Chair chair) {
        // Chairs: lightweight → flat shipping rate (size ignored)
        return 29.99;
    }

    @Override
    public double visit(Table table) {
        // Tables: size-based calculation
        return 49.99 + (table.getSize() * 25.0);
    }

    @Override
    public double visit(Sofa sofa) {
        // Sofas: bulky + distance-based
        return 99.99 + (sofa.getSize() * 15.0) + (sofa.getDistance() * 2.50);
    }
}
