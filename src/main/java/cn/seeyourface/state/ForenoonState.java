package cn.seeyourface.state;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/19 21:02
 * @Version 1.0
 * @Description
 */
@Slf4j
public class ForenoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12)
            log.info("当前时间：{}点，上午工作，精神百倍！", work.getHour());
        else {
            work.setCurrentState(new NoonState());
            work.writeProgram();
        }
    }
}
