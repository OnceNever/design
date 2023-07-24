package cn.seeyourface.singleton;

/**
 * <p>
 *     静态内部类
 * </p>
 *
 * @author yangLei
 * @date 2023/7/24 14:12
 * @since 1.1.0
 */
public class Singleton2 {
    private static class SingletonHolder {
        private static final Singleton2 INSTANCE = new Singleton2();
    }
    private Singleton2() {}
    public static Singleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
