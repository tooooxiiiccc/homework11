public class ifelse {
    public static void main(String[] args) {
        int age = 35;
        String haircolor = "Brown";
        if (age <= 18 || age >= 34) {
            haircolor = "Red";
        } else if (age > 18 && age <= 25) {
            haircolor = "Green";
        } else if (age > 25 && age <= 45) {
            haircolor = "Blue";
        } else if (age > 45 && age <= 80) {
            haircolor = "Yellow";
        }
        System.out.println(haircolor);
    }
}
