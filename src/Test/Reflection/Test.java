package Test.Reflection;

class Test {
    private String s;

    public Test() {
        s = "Gunay";
    }

    public void method1() {
        System.out.println("The String is " + s);
    }

    public void method2(int n) {
        System.out.println("The number is " + n);
    }

    public void method3(){
        System.out.println("Private method !");
    }
}


