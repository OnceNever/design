package cn.seeyourface.state;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/19 21:07
 * @Version 1.0
 * @Description
 */
@Slf4j
public class NoonState implements State{
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13)
            log.info("当前时间：{}点，饿了，吃午饭，犯困，午休！", work.getHour());
        else {
            work.setCurrentState(new AfterNoonState());
            work.writeProgram();
        }
    }
}
