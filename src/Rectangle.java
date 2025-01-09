public class Rectangle implements Shape {
    private float width;
    private float height;
    private String fillColor;
    private String borderColor;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float calculatePerimeter() {
        return (width + height) * 2;
    }

    @Override
    public float calculateSquare() {
        return width * height;
    }

    @Override
    public void setBorderColor(String color) {
        borderColor = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public void setFillColor(String color) {
        fillColor = color;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }
}
