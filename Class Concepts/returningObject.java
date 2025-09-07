// Returning Objects
class Test {
    int a;

    Test(int value) {
        a = value;
    }

    Test incByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}

public class returningObject {
    public static void main(String[] args) {
        Test temp1 = new Test(10);
        Test temp2;
        temp2 = temp1.incByTen();
        System.out.println("temp1.a: " + temp1.a);
        System.out.println("temp2.a: " + temp2.a);
    }
}