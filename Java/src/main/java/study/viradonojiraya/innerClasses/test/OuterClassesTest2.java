package study.viradonojiraya.innerClasses.test;

public class OuterClassesTest2 {
    private String name = "Outer Danilo";

    private void print() {
        class LocalClass {
            private String name = "Local Danilo";

            public void localPrint() {
                System.out.println(name);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.localPrint();
    }

    public static void main(String[] args) {
        OuterClassesTest2 outerClassesTest2 = new OuterClassesTest2();
        outerClassesTest2.print();
    }
}
