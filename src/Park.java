public class Park {
    private String name;
    private String city;
    private String openingHours;
    private Attraction[] attractions;

    public Park(String name, String city, String openingHours) {
        this.name = name;
        this.city = city;
        this.openingHours = openingHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public Attraction[] getAttractions() {
        return attractions;
    }

    public void setAttractions(Attraction[] attractions) {
        this.attractions = attractions;
    }

    public void printInfo() {
        System.out.println("Название парка: " + name + ";" + "\nГород: " + city + ";" + "\nЧасы работы: " + openingHours);
        for (Attraction attraction : attractions) {
            attraction.printInfo();
        }
        System.out.println();
    }

    public Attraction newAttraction(String name, String openingHours, int price) {
        return new Attraction(name, openingHours, price);
    }

    public class Attraction {
        private String name;
        private String openingHours;
        private int price;

        public Attraction(String name, String openingHours, int price) {
            this.name = name;
            this.openingHours = openingHours;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOpeningHours() {
            return openingHours;
        }

        public void setOpeningHours(String openingTime) {
            this.openingHours = openingTime;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Название аттракциона: " + name + "," + " Часы работы: " + openingHours + "," + " Цена: " + price + ".");
        }

    }

}
