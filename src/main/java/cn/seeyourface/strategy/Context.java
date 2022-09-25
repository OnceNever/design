package cn.seeyourface.strategy;

import lombok.Data;

/**
 * @Class Context
 * @Author yanglei
 * @Date 2022/9/18 9:48
 * @Version 1.0
 * @Description
 */
@Data
public class Context {

    Strategy strategy;

    public Context(DiscountEnum discountEnum) {
        switch (discountEnum) {
            case NONE :
                strategy = new ConcreteStrategyA();
                break;
            case DISCOUNT :
                strategy = new ConcreteStrategyB(discountEnum.getDiscount());
                break;
            case REBATE :
                strategy = new ConcreteStrategyC(discountEnum.getFull(), discountEnum.getRebate());
                break;
            default :
                throw new UnsupportedOperationException("Unknown discount enum: " + discountEnum);
        }
    }

    public void calculate(double money, int number) {
        strategy.AlgorithmInterface(money, number);
    }
}
