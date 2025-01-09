public interface Shape {
    default float calculatePerimeter() {
        return 0;
    }

    default float calculateSquare() {
        return 0;
    }

    void setFillColor(String color);

    String getFillColor();

    void setBorderColor(String color);

    String getBorderColor();
}
