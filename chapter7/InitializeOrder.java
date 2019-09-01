public class InitializeOrder {
    public static void main(String[] args) {
        System.out.println("开始初始化一个Beetle");
        Beetle beetle = new Beetle();
    }
}

class Insect {
    private int i = 9;
    protected int j;

    Insect() {
        System.out.println("Insect构造方法");
        System.out.println("i=" + i + ",j=" + j);
        j = 39;
    }

    private static int x1 = printInt("初始化静态变量x1");

    static int printInt(String s) {
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect {
    private int k = printInt("Beetle.k初始化");

    public Beetle() {
        System.out.println("Beetle构造方法");
        System.out.println("k=" + k);
        System.out.println("j=" + j);
    }

    private static int x2 = printInt("初始化Beetle的x2");
}
