package cn.seeyourface.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/28 14:48
 * @since 1.1.0
 */
public class Client {

    public static void main(String[] args) {

        WebsiteFactory factory = new WebsiteFactory();

        Website website1 = factory.getWebsite("商品展示");
        website1.use(new User("小张"));

        Website website2 = factory.getWebsite("商品展示");
        website2.use(new User("小李"));

        Website website3 = factory.getWebsite("商品展示");
        website3.use(new User("小王"));

        Website website4 = factory.getWebsite("博客");
        website4.use(new User("老张"));

        Website website5 = factory.getWebsite("博客");
        website5.use(new User("老李"));

        Website website6 = factory.getWebsite("博客");
        website6.use(new User("老王"));

        factory.getWebsiteInstance();
    }
}
