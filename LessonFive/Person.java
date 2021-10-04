   class Person {
    private String name;
    private String post;
    private String email;
    private String tel;
    private int salary;
    private int age;

    public Person(String name, String post, String email, String tel, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public String getEmail() {
        return email;
    }

    public String getTel() {
        return tel;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name -'" + name + '\'' +
                ", post -'" + post + '\'' +
                ", email -'" + email + '\'' +
                ", tel -'" + tel + '\'' +
                ", salary = " + salary +
                ", age  = " + age +
                '}';
    }
}
