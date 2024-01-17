public class MeberDTO {
    private static int nextId = 1;
    private int id;
    private String name;
    private int age;
    private String phone;

    public MeberDTO(String name, int age, String phone) {
        this.id = MeberDTO.nextId++;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public MeberDTO(int id, String name, int age, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        MeberDTO.nextId = nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "MeberDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
