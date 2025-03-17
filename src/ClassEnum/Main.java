package ClassEnum;

public class Main {
    public static void main(String[] args) {
        IS course = IS.AI;
        System.out.println(course);
        System.out.println(course == IS.Sec);
        System.out.println(course.ordinal());
        System.out.println(IS.AI.ordinal());
        System.out.println(IS.Sec.ordinal());
        IS[] co= new IS[2];
        co[0] = IS.AI;
        co[1] = IS.Sec;
        System.out.println(co[0].ordinal());
        System.out.println(co[1].ordinal());
        System.out.println(co[0].compareTo(co[1]));
        System.out.println(co[1].compareTo(co[0]));
    }
}
