package cn.seeyourface.singleFactory;

import lombok.Data;

/**
 * 运算类
 */
@Data
public abstract class Operation {
    double numberA;
    double numberB;

    abstract double calculate();
}
