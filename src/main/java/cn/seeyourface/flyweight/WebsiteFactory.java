package cn.seeyourface.flyweight;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/28 14:46
 * @since 1.1.0
 */
@Slf4j
public class WebsiteFactory {

    // key:网站分类  value:具体网站
    private static final Map<String, ConcreteWebsite> MAP = new HashMap<>();

    public Website getWebsite(String key) {
        ConcreteWebsite value = new ConcreteWebsite(key);
        MAP.putIfAbsent(key, value);
        return value;
    }

    public void getWebsiteInstance() {
        log.info("网站实例数：{}", MAP.size());
    }
}
