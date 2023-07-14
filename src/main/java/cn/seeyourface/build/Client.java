package cn.seeyourface.build;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/14 17:47
 * @since 1.1.0
 */
public class Client {

    public static void main(String[] args) {
        Director direct = new Director();

        ProductBuilder phoneBuilder = new PhoneBuilder();
        direct.build(phoneBuilder);

        ProductBuilder carBuilder = new CarBuilder();
        direct.build(carBuilder);
    }
}
