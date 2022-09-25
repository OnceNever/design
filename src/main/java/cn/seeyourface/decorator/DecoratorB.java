package cn.seeyourface.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @Class DecoratorIB
 * @Author yanglei
 * @Date 2022/9/25 9:54
 * @Version 1.0
 * @Description
 */
@Slf4j
public class DecoratorB extends Decorator {

    void show() {
        person.show();
        addBehavior();
        log.info("蓝色牛仔裤");

    }

    private void addBehavior() {
        // 本类的特殊功能
    }
}
