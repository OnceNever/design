package cn.seeyourface.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/17 16:58
 * @since 1.1.0
 */
@Slf4j
public class Employee extends Observer {

    public Employee(String name, Observable observable) {
        super(name, observable);
    }

    @Override
    void update() {
        if (observable.getState())
            log.info("{}！员工{}赶紧回到工位上，继续工作！", observable.getAction(), name);
        else
            log.info("{}！员工{}可以开始摸鱼！", observable.getAction(), name);
    }
}
