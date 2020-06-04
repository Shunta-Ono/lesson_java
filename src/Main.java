class ThisSampleClass {
    private String str = "engineer";
    public void print(String str) {
        System.out.println("str=" + str);
        System.out.println("this.str=" + this.str);
    }
}

public class Main {
    public static void main(String[] args) {
        String str = "samurai";
        ThisSampleClass sc = new ThisSampleClass();
        sc.print(str);
    }
}