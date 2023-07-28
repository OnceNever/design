package cn.seeyourface.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/28 14:44
 * @since 1.1.0
 */
@Slf4j
public class ConcreteWebsite extends Website {
    public ConcreteWebsite(String name) {
        super(name);
    }

    @Override
    protected void use(User user) {
        log.info("网站分类：{}，用户：{}", name, user.getName());
    }
}
