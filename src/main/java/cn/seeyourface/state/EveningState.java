package cn.seeyourface.state;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/19 21:11
 * @Version 1.0
 * @Description
 */
@Slf4j
public class EveningState implements State{
    @Override
    public void writeProgram(Work work) {
        if (work.getFinishedWork()) {
            work.setCurrentState(new RestState());
            work.writeProgram();
        } else {
            if (work.getHour() < 21) {
                log.info("当前时间：{}点，加班哦，疲累至极！", work.getHour());
            } else {
                work.setCurrentState(new SleepIngState());
                work.writeProgram();
            }
        }
    }
}
