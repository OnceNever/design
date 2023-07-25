package cn.seeyourface.command;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/25 11:00
 * @since 1.1.0
 */
@Slf4j
public class Waiter {
    private final List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
        log.info("新增订单：{}，时间：{}", command.getClass().getName(), new Date());
    }

    public void removeCommand(Command command) {
        commandList.remove(command);
        log.info("取消订单：{}，时间：{}", command.getClass().getName(), new Date());
    }

    public void notice() {
        Iterator<Command> iterator = commandList.iterator();
        while (iterator.hasNext()) {
            Command command = iterator.next();
            command.executeCommand();
            iterator.remove();
            log.info("订单{}制作完成", command.getClass().getName());
        }
    }
}
