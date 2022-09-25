package cn.seeyourface.singleFactory;

/**
 * @Auther: yanglei
 * @Date: 2022/9/17 12:28
 * @Version: V1.0
 * @Description: TODO
 */
public class OperationSub extends Operation {
    @Override
    double calculate() {
        return numberA - numberB;
    }
}
