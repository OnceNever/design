package cn.seeyourface.command;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/25 10:43
 * @since 1.1.0
 */
@Slf4j
public class Barbecuer {

    public void bakeMutton () {
        log.info("烤肉串");
    }

    public void bakeChickenWing () {
        log.info("烤鸡翅");
    }
}
