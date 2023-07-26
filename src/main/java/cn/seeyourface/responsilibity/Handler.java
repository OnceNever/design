package cn.seeyourface.responsilibity;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/26 17:28
 * @since 1.1.0
 */
public abstract class Handler {

    protected Handler successor;

    // 设置继承者
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    protected abstract void handlerRequest(int days);
}
