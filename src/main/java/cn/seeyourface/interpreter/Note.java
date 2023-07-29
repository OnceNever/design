package cn.seeyourface.interpreter;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/29 12:28
 * @Version 1.0
 * @Description
 */
public class Note extends Expression {
    @Override
    protected void execute(String key, double value) {
        String note = null;
        switch (key) {
            case "C" :
                note = "1";
                break;
            case "D" :
                note = "2";
                break;
            case "E" :
                note = "3";
                break;
            case "F" :
                note = "4";
                break;
            case "G" :
                note = "5";
                break;
            case "A" :
                note = "6";
                break;
            case "B" :
                note = "7";
                break;
        }
        System.out.print(note + " ");
    }
}
