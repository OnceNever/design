package cn.seeyourface.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/20 15:24
 * @since 1.1.0
 */
@Slf4j
public class Forwards extends Player{

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        log.info("前锋{}进攻", name);
    }

    @Override
    public void defense() {
        log.info("前锋{}防守", name);
    }
}
