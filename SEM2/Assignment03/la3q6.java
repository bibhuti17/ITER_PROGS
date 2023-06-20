package SEM2.Assignment03;

public class la3q6 {
    public static void main(String[] args) {
        Box<String> s1 = new Box<String>("Hello");
        Box<String> s2 = new Box<String>("Coders!");
        System.out.println(s1.getType());
        System.out.println(s2.getType());

        Box<Integer> i1 = new Box<Integer>(99);
        Box<Integer> i2 = new Box<Integer>(76);
        System.out.println(i1.getType());
        System.out.println(i2.getType());

        Box<Object> o1 = new Box<Object>(9);
        Box<Object> o2 = new Box<Object>("Coders!");
        System.out.println(o1.getType());
        System.out.println(o2.getType());
    }
}
class Box<T> {
    T type;
    Box (T type) {
        this.type = type;
    }


    public T getType() {
        return this.type;
    }
}