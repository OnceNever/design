package cn.seeyourface.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 *     追求者，被代理类
 * </p>
 *
 * @author yangLei
 * @date 2022/9/30 10:07
 * @since 1.0.0
 */
@Slf4j
public class Pursuit implements IGiveGift {

    Girl girl;
    public Pursuit(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
       log.info("送洋娃娃");
    }

    @Override
    public void giveFlowers() {
        log.info("送花");
    }

    @Override
    public void giveChocolate() {
        log.info("送巧克力");
    }
}
