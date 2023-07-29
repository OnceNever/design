package cn.seeyourface.interpreter;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/29 12:48
 * @Version 1.0
 * @Description
 */
public class Speed extends Expression {
    @Override
    protected void execute(String key, double value) {
        String speed;
        if (value < 500)
            speed = "慢速";
        else if (value <= 1000)
            speed = "中速";
        else
            speed = "快速";
        System.out.print(speed + " ");
    }
}
