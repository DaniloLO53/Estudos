package study.viradonojiraya.innerClasses.test;

public class OuterClassesTest1 {
    private static String name = "Danilo";

    class Inner {
        private final String INNER_NAME = "INNER";
        private int innerId;

        public Inner(int innerId) {
            this.innerId = innerId;
        }

        public static void staticInnerMethod() {
            System.out.println("Static Inner method");
        }

        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this);
        }
    }

    public void playWithInner() {
        Inner inner = new Inner(1);

        OuterClassesTest1 outerClassesTest1 = new OuterClassesTest1();
        OuterClassesTest1.Inner inner2 = outerClassesTest1.new Inner(2);
    }

    public static void main(String[] args) {
    }
}
