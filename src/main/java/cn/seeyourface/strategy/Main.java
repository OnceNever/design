package cn.seeyourface.strategy;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * @Class Main
 * @Author yanglei
 * @Date 2022/9/18 10:29
 * @Version 1.0
 * @Description
 */
@Slf4j
public class Main {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            log.info("请输入商品单价：");
            double price = scanner.nextDouble();
            log.info("请输入商品数量：");
            int number = scanner.nextInt();
            log.info("请输入促销类型：1 - 无优惠，2 - 打折，3 - 满减");
            int type = scanner.nextInt();
            Context context = new Context(DiscountEnum.getType(type));
            context.calculate(price, number);
        } catch (Exception e) {
            log.error("Error    scanning: " + e.getMessage());
        }
    }
}
