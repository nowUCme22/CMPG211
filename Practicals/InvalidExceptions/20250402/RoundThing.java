public class RoundThing {
    // Variables
    private String color;
    private int radius;

    // Default constructor
    public RoundThing() {
        this("", 1);
    }

    // Parameterized constructor
    public RoundThing(String color, int radius) {
        setColor(color);
        setRadius(radius);
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Setter for radius with validation
    public void setRadius(int radius) {
        if (radius >= 0) {  // Corrected condition
            this.radius = radius;
        } else {
            throw new InvalidRadiusException("Radius of " + radius + " is invalid...");
        }
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Getter for radius
    public int getRadius() {
        return radius;
    }

    // toString method
    @Override
    public String toString() {
        return "Color: " + getColor() + " Radius: " + getRadius();
    }

    // Main method for testing
    public static void main(String[] args) {
        RoundThing rt1 = new RoundThing();
        try {
            rt1 = new RoundThing("Red", -1);
        } catch (InvalidRadiusException e) {
            System.out.println(e);
        }
        System.out.println(rt1);
    }
}