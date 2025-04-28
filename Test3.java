package Com.Oops.inheritance;

class AAA {
    int i = 20; // Instance variable

    static void m1() {
        System.out.println("m1()-A");
    }
}

class BBB extends AAA {
    int i = 30; // Instance variable in child class

    static void m2() {
        // super.m1(); // ❌ Not allowed because `m1()` is static
        System.out.println("m2()-B");
    }

    void m3() { // Non-static method
        System.out.println("Super i = " + super.i); // Refers to AAA's `i`
        System.out.println("Local i = " + this.i); // Refers to BBB's `i`
        System.out.println("M3()-B");
        
        super.m1();      // ✅ Allowed (because calling static method via parent class)   
    }
}

public class Test3 {
    public static void main(String[] args) {
        BBB obj = new BBB(); // Creating an object of BBB
        obj.m3(); // Calling m3();       
    }
}



