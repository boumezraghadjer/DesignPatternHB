package singletone;


public class EnumDemo {
    public static void main(String[] args) {
        SingletoneEnum singleton = SingletoneEnum.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }
}