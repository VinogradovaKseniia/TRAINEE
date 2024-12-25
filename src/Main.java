public class Main {
    public static void main(String[] args) {
        {
            Employee employee = new Employee("Иванова Мария Ивановна", "бухгалтер", "masha@yandex.ru", "89210000000", 100000, 45);
            employee.printInfo();
        }

        {
            Employee[] employeeArray = new Employee[]{
                    new Employee("Иванова Мария Ивановна", "бухгалтер", "masha@yandex.ru", "89210000000", 100000, 45),
                    new Employee("Сидоров Сергей Сергеевич", "инженер", "sidorov123@mail.ru", "89031112233", 120000, 29),
                    new Employee("Иванов Иван Иванович", "грузчик", "12345@mail.com", "89000000000", 20000, 21),
                    new Employee("Ким Ян Олегович", "менеджер", "kim3456@gmai.com", "89768889977", 90000, 25),
                    new Employee("Васильева Яна Константиновна", "секретарь", "vasilieva456@ya.ru", "89054565665", 40000, 20)
            };

            for (Employee employee : employeeArray) {
                employee.printInfo();
            }
        }

        Park park = new Park("Диснейленд", "Париж", "10:00 - 22:00");
        Park.Attraction[] attractions = new Park.Attraction[]{
                park.newAttraction("Американские горки", "13:00 - 22:00", 500),
                park.newAttraction("Колесо обозрения", "10:30 - 22:00", 400),
                park.newAttraction("Карусель", "10:00 - 20:00", 200),
        };
        park.setAttractions(attractions);
        park.printInfo();

        Park park2 = new Park("Юниверсал", "Пекин", "11:00 - 00:00");
        Park.Attraction[] attractions2 = new Park.Attraction[]{
                park2.newAttraction("Американские горки детские", "11:00 - 20:00", 700),
                park2.newAttraction("Колесо обозрения", "12:00 - 00:00", 500),
                park2.newAttraction("Свободное падение", "12:00 - 20:00", 700),
                park2.newAttraction("Картинг взрослый", "11:00 - 21:00", 500),
                park2.newAttraction("Карусель", "11:00 - 19:00", 300),
        };
        park2.setAttractions(attractions2);
        park2.printInfo();
    }

}
