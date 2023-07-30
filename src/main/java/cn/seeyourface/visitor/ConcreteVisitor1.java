package cn.seeyourface.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @Author yanglei
 * @Date 2023/7/30 10:51
 * @Version 1.0
 * @Description
 */
@Slf4j
public class ConcreteVisitor1 extends Visitor {
    @Override
    public void visitConcreteElementA(Element elementA) {
        log.info("{} 被 {} 访问", elementA.getClass().getName(), this.getClass().getName());
    }

    @Override
    public void visitConcreteElementB(Element elementB) {
        log.info("{} 被 {} 访问", elementB.getClass().getName(), this.getClass().getName());
    }
}
