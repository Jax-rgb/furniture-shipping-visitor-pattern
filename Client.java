public class Client {
    public static void main(String[] args) {
        // Create different furniture items
        Furniture chair = new Chair("Ergonomic Office Chair", 0.4);
        Furniture table = new Table("Oak Dining Table", 2.5);
        Furniture sofa = new Sofa("3-Seater Leather Sofa", 6.0, 120.0);

        // Create the visitor (shipping calculator)
        ShippingVisitor shippingCalculator = new FurnitureShippingCalculator();

        // Test shipping cost calculation using Visitor pattern
        System.out.println("=== Furniture Shipping Cost Calculator ===");
        System.out.printf("%s shipping cost: $%.2f%n", chair.getName(), chair.accept(shippingCalculator));
        System.out.printf("%s shipping cost: $%.2f%n", table.getName(), table.accept(shippingCalculator));
        System.out.printf("%s shipping cost: $%.2f%n", sofa.getName(), sofa.accept(shippingCalculator));
      
    }
}
