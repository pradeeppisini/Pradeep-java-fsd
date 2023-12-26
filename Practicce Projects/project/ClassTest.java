package InnerClasses;
public class ClassTest {
	public static void main(String[] args) {
        // Create an instance of OuterClass
        OuterClass.InnerClass inner = new OuterClass().new InnerClass();

        // Call methods on inner class instance
        inner.method1();
        inner.method2();
    }
}

class OuterClass {
    private int outerVar = 10;

    class InnerClass {
        private int innerVar = 20;

        void method1() {
            System.out.println("Method1 called from InnerClass. Outer variable accessed: " + outerVar);
        }

        void method2() {
            System.out.println("Method2 called from InnerClass. Inner variable accessed: " + innerVar);
        }
    }
}

