package cn.seeyourface.observer;


/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/17 16:29
 * @since 1.1.0
 */
public interface Observable {

        void addObserver(Observer observer);

        void removeObserver(Observer observer);

        void notifyObserver();

        Boolean getState();

        void setState(Boolean state);

        String getAction();
}
