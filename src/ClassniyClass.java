public class ClassniyClass {
    private int age;

    public int getAge() {
        return age;
    }
    public int AgeCount(int b) {
        return AgeIncrement(b);
    }
    private int AgeIncrement(int a) {
        this.age = a;
        return a + 1;
    }
}
