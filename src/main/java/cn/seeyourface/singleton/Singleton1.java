package cn.seeyourface.singleton;

/**
 * <p>
 *     双重锁校验
 * </p>
 *
 * @author yangLei
 * @date 2023/7/24 13:59
 * @since 1.1.0
 */
public class Singleton1 {

    private volatile static Singleton1 singleton1;
    private Singleton1(){}

    public Singleton1 getSingleton1() {
        if (singleton1 == null) {
            synchronized (Singleton1.class) {
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}
