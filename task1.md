# Завдання №1

## Завдання 1.1

### Код Shirt.java
```
public class Shirt {

    public int shirtID = 0;
    public String description = "-description required-";
    public char colorCode = 'U';
    public double price = 0;
    public int quantityInStock = 0;

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
```

### Результат виконання

![task-result-1.1](task1.1.png)

---

## Завдання 1.2

### Код Shirt.java
```
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
```

### Результат виконання

![task-result-1.2](task1.2.png)