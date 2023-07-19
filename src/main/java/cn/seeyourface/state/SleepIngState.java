package cn.seeyourface.state;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/19 21:12
 * @Version 1.0
 * @Description
 */
@Slf4j
public class SleepIngState implements State{
    @Override
    public void writeProgram(Work work) {
        log.info("当前时间：{}点，不行了，睡着了！", work.getHour());
    }
}
