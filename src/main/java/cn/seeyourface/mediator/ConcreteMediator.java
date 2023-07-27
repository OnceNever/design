package cn.seeyourface.mediator;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/27 11:43
 * @since 1.1.0
 */
@Slf4j
public class ConcreteMediator extends Mediator {
    private final List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague))
            colleagues.add(colleague);
    }

    @Override
    public void relay(String message, Colleague colleague) {
        // 中介者转发通知
        log.info("中介者转发{}消息：{}", colleague.name, message);
        colleagues.stream().filter(c -> !Objects.equals(c, colleague)).forEach(co -> co.receive(message));
    }
}
