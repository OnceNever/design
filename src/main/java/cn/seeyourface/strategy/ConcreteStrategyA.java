package cn.seeyourface.strategy;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Class ConcreteStrategyA
 * @Author yanglei
 * @Date 2022/9/18 9:46
 * @Version 1.0
 * @Description 策略：实收，无优惠
 */
@Slf4j
@Data
public class ConcreteStrategyA implements Strategy {

    @Override
    public void AlgorithmInterface(double money, int number) {
        log.info("总计：{}", money * number);
    }
}
