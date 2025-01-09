public class Triangle implements Shape {
    private float a;
    private float b;
    private float c;
    private String fillColor;
    private String borderColor;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public float calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public float calculateSquare() {
        float p = calculatePerimeter() / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
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

    public String getBorderColor() {
        return borderColor;
    }
}
