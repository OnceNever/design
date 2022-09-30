package cn.seeyourface.proxy;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2022/9/30 10:14
 * @since 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        final String girlName = "ruHua";
        Girl girl = new Girl(girlName);

        Proxy proxy = new Proxy(girl);

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
