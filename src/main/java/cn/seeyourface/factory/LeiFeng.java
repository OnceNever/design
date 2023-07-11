package cn.seeyourface.factory;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/11 11:21
 * @since 1.1.0
 */
@Slf4j
@Data
public class LeiFeng {

    private final String name;

    public void sweep(){
        log.info(name + "扫地");
    }

    public void wash(){
        log.info(name + "洗衣");
    }

    public void buyRice(){
        log.info(name + "买米");
    }
}
