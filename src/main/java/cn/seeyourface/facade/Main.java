package cn.seeyourface.facade;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/14 15:36
 * @since 1.1.0
 */
public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
