package cn.seeyourface.responsilibity;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/26 17:28
 * @since 1.1.0
 */
public abstract class Manager {

    protected final String name;
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    // 设置继承者
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    protected abstract void handlerRequest(Request request);
}
