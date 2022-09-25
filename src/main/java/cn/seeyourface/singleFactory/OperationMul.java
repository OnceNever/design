package cn.seeyourface.singleFactory;

/**
 * @Auther: yanglei
 * @Date: 2022/9/17 12:29
 * @Version: V1.0
 * @Description: 乘法操作
 */
public class OperationMul extends Operation {
    @Override
    double calculate() {
        return numberA * numberB;
    }
}
