package cn.seeyourface.bridge;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/24 15:30
 * @since 1.1.0
 */
public class Client {

    public static void main(String[] args) {
        MobilePhone apple = new Apple();
        apple.setSoftware(new WeChat());
        apple.run();

        apple.setSoftware(new MeiTuan());
        apple.run();

        MobilePhone huaWei = new Huawei();
        huaWei.setSoftware(new WeChat());
        huaWei.run();

        huaWei.setSoftware(new MeiTuan());
        huaWei.run();
    }
}
