package cn.seeyourface.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/17 17:10
 * @since 1.1.0
 */
@Slf4j
public class Manager extends Observer{

    public Manager(String name, Observable observable) {
        super(name, observable);
    }

    @Override
    void update() {
        if (observable.getState())
            log.info("{}！经理{}赶紧回到办公室，继续工作！", observable.getAction(), name);
        else
            log.info("{}！经理{}可以开始喝茶！", observable.getAction(), name);
    }

}
