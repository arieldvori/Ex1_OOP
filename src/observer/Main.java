package observer;

public class Main {
    public static void main(String[] args) {
        GroupAdmin test = new GroupAdmin();
        ConcreteMember member1=new ConcreteMember();
        test.append("pls work");
        test.register(member1);
        System.out.println(member1.toString());



        System.out.println(test);
    }
}