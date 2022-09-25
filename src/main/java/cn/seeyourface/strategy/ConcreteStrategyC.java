package cn.seeyourface.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Class ConcreteStrategyC
 * @Author yanglei
 * @Date 2022/9/18 9:47
 * @Version 1.0
 * @Description 策略：满减
 */
@Slf4j
@Data
@AllArgsConstructor
public class ConcreteStrategyC implements Strategy {

    private double full;
    private double rebate;

    @Override
    public void AlgorithmInterface(double money, int number) {
        log.info("总计：{}", (money - (int)(money / full) * rebate) * number);
    }
}
