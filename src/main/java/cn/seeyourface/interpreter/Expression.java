package cn.seeyourface.interpreter;

import cn.hutool.core.util.StrUtil;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/29 12:21
 * @Version 1.0
 * @Description
 */
public abstract class Expression {

    // 解释
    protected void interpret(PlayContext context) {
        if (StrUtil.isEmpty(context.getText()))
            return;
        String key = context.getText().substring(0, 1);
        context.setText(context.getText().substring(2));
        double value = Double.parseDouble(context.getText().substring(0, context.getText().indexOf(" ")));
        context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));
        execute(key, value);
    }

    // 执行
    protected abstract void execute(String key, double value);
}
