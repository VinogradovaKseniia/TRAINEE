public class Employee {
    private String fullName;
    private String job;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String job, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJob() {
        return job;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName + ";" + "\nВозраст: " + age + ";" + "\nEmail: " + email + ";" + "\nТелефон: " + phone + ";" + "\nДолжность: " + job + ";" + "\nЗаработная плата: " + salary + ";");
        System.out.println();
    }

}
