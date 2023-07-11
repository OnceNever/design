package cn.seeyourface.factory;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/11 11:38
 * @since 1.1.0
 */
public class Main {

    public static void main(String[] args) {
        IFactory factory = new VolunteerFactory();
        LeiFeng leifeng = factory.createLeiFeng();
        leifeng.buyRice();
        leifeng.sweep();
        leifeng.wash();
    }
}
