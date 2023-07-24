package cn.seeyourface.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/24 15:13
 * @since 1.1.0
 */
@Slf4j
public abstract class MobilePhone {

    protected Software software;

    public void setSoftware(Software software) {
        this.software = software;
    }

    public abstract void run ();
}
