package cn.seeyourface.state;

import lombok.Data;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/19 20:59
 * @Version 1.0
 * @Description
 */
@Data
public class Work {

    private State currentState;
    private Double hour;
    private Boolean finishedWork = false;

    public Work() {
        currentState = new ForenoonState();
    }

    public void writeProgram() {
        currentState.writeProgram(this);
    }
}
