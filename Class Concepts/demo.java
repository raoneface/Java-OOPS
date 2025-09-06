// Overloading Method 
class Overloaddemo{
    void test(){
        System.out.println("No parameter");
    }
    void test(int t){
        System.out.println("t : "+t);
    }
}
public class demo{
    public static void main(String[] args) {
        Overloaddemo obj1 = new Overloaddemo();
        obj1.test(12);
        obj1.test();

    }
}