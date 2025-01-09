public class Main {
    public static void main(String[] args) {

        //  Task 1

        Dog dog1 = new Dog("Бобик");
        dog1.run(501);
        dog1.swim(10);

        Cat cat1 = new Cat("Маруся");
        cat1.run(300);
        cat1.swim(20);

        System.out.println();

        Cat[] cats = new Cat[]{
                new Cat("Барсик"),
                new Cat("Рыжик"),
                new Cat("Клеопатра")};

        Bowl bowl = new Bowl();
        bowl.addFood(120);

        for (Cat cat : cats) {
            cat.eat(bowl);
            cat.printInfo();
        }

        System.out.println();

        System.out.println("Собак создано: " + Dog.getCount());
        System.out.println("Котов создано: " + Cat.getCount());
        System.out.println("Животных создано: " + Animal.getCount());
        System.out.println();

        // Task 2

        Rectangle rectangle = new Rectangle(2, 3);
        rectangle.setFillColor("голубой");
        rectangle.setBorderColor("синий");

        Triangle triangle = new Triangle(20, 20, 30);
        triangle.setFillColor("желтый");
        triangle.setBorderColor("оранжевый");

        Circle circle = new Circle(20);
        circle.setFillColor("белый");
        circle.setBorderColor("черный");

        Shape[] shapes = new Shape[]{rectangle, triangle, circle};
        for (Shape shape : shapes) {
            System.out.println("Периметр: " + shape.calculatePerimeter());
            System.out.println("Площадь: " + shape.calculateSquare());
            System.out.println("Цвет заливки: " + shape.getFillColor());
            System.out.println("Цвет границы: " + shape.getBorderColor());
        }
    }
}