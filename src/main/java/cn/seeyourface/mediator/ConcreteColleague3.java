package cn.seeyourface.mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/27 13:43
 * @since 1.1.0
 */
@Slf4j
public class ConcreteColleague3 extends Colleague {
    public ConcreteColleague3(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    protected void receive(String message) {
        log.info("{} 接收消息 {}", name, message);
    }

    @Override
    protected void send(String message) {
        log.info("{} 发送消息 {}", name, message);
        mediator.relay(message, this);
    }
}
