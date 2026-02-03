public class Shirt {

    public int shirtID = 5;
    public String description = "some description";
    public char colorCode = 'R';
    public double price = 20;
    public int quantityInStock = 10;

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + getShirtColor(colorCode));
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }

    private String getShirtColor(char colorCode) {
        return switch (colorCode) {
            case 'R' -> "red";
            case 'G' -> "green";
            case 'B' -> "blue";
            default -> "unknown";
        };
    }
}