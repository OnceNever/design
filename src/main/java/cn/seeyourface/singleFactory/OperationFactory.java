package cn.seeyourface.singleFactory;

/**
 * @Class OperationFactory
 * @Author yanglei
 * @Date 2022/9/17 12:35
 * @Version 1.0
 * @Description
 */
public class OperationFactory {

    private static final String ADD = "+";
    private static final String SUB = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";

    public static Operation create(String operate) {
        switch (operate) {
            case ADD :
                return new OperationAdd();
            case SUB :
                return new OperationSub();
            case MULTIPLY :
                return new OperationMul();
            case DIVIDE :
                return new OperationDiv();
            default :
                throw new IllegalArgumentException("Unknown operation: " + operate);
        }
    }
}
