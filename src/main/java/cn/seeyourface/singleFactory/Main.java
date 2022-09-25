package cn.seeyourface.singleFactory;


import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * @Class Main
 * @Author yanglei
 * @Date 2022/9/17 12:41
 * @Version 1.0
 * @Description
 */
@Slf4j
public class Main {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            log.info("请输入第一个数字：");
            double numberA = scanner.nextDouble();
            log.info("请输入第二个数字：");
            double numberB = scanner.nextDouble();
            log.info("请输入操作符：");
            String operate = scanner.next();
            Operation operation = OperationFactory.create(operate);
            operation.setNumberA(numberA);
            operation.setNumberB(numberB);
            double calculate = operation.calculate();
            log.info("结果：" + calculate);
        } catch (Exception e) {
            log.error("Error for scanning:" + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
