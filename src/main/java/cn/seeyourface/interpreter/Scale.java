package cn.seeyourface.interpreter;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/29 12:31
 * @Version 1.0
 * @Description
 */
public class Scale extends Expression {
    @Override
    protected void execute(String key, double value) {
        String scale = null;
        switch ((int)Math.round(value)) {
            case 1 :
                scale = "低音";
                break;
            case 2 :
                scale = "中音";
                break;
            case 3 :
                scale = "高音";
                break;
        }
        System.out.print(scale + " ");
    }
}
