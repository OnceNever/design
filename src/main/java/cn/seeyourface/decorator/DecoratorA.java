package cn.seeyourface.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @Class DecoratorImpl
 * @Author yanglei
 * @Date 2022/9/25 9:51
 * @Version 1.0
 * @Description
 */
@Slf4j
public class DecoratorA extends Decorator {

    private String state;

    void show() {
        person.show();
        state = "state";
        log.info("白色体恤");
    }

}
