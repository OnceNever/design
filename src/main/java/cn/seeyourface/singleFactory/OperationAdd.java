package cn.seeyourface.singleFactory;

/**
 * @Auther: yanglei
 * @Date: 2022/9/17 12:25
 * @Version: V1.0
 * @Description: 加法操作
 */
public class OperationAdd extends Operation {
    @Override
    double calculate() {
        return numberA + numberB;
    }
}
