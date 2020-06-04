public class App {
    static int num;
    static void method(){
        num++;
    }
    static void methodB(){
        num++;
    }
    public static void main(String[] args){
        method(); methodB();
        System.out.println(num);
    }
}
