package cn.seeyourface.state;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/19 21:09
 * @Version 1.0
 * @Description
 */
@Slf4j
public class AfterNoonState implements State{
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17)
            log.info("当前时间：{}点，下午状态还不错，继续努力！", work.getHour());
        else {
            work.setCurrentState(new EveningState());
            work.writeProgram();
        }
    }
}
