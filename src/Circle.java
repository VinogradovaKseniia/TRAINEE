public class Circle implements Shape {
    private float radius;
    private String fillColor;
    private String borderColor;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float calculatePerimeter() {
        return 2 * (float) Math.PI * radius;
    }

    @Override
    public float calculateSquare() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void setFillColor(String color) {
        fillColor = color;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public void setBorderColor(String color) {
        borderColor = color;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

