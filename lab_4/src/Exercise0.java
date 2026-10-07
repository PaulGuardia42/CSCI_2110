//Demo class
public class Exercise0 {
    public static void main(String[] args) {
        Grade<String> m1 = new Grade<String>("A");
        Grade<Integer> m2 = new Grade<Integer>(90);
        System.out.println(m1);
        System.out.println(m2);
        m1.setValue("A+");
        m2.setValue(65);
        System.out.println(m1);
        System.out.println(m2);
    }

}