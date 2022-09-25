package cn.seeyourface.singleFactory;

/**
 * @Class OperationDiv
 * @Author yanglei
 * @Date 2022/9/17 12:30
 * @Version 1.0
 * @Description
 */
public class OperationDiv extends Operation {
    @Override
    double calculate() {
        if (numberB == 0)
            throw new IllegalArgumentException("numberB must be positive number");
        return numberA / numberB;
    }
}
