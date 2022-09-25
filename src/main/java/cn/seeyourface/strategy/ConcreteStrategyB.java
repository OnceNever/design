package cn.seeyourface.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Class ConcreteStrategyB
 * @Author yanglei
 * @Date 2022/9/18 9:47
 * @Version 1.0
 * @Description 策略：打折
 */
@Slf4j
@Data
@AllArgsConstructor
public class ConcreteStrategyB implements Strategy {

    private double discount;

    @Override
    public void AlgorithmInterface(double money, int number) {
        log.info("总计：{}", money * (discount / 10.0) * number);
    }
}
