package cn.seeyourface.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @author yangLei
 * @date 2023/7/17 17:11
 * @since 1.1.0
 */
public class Boss implements Observable {

    private Boolean state;
    private String action;
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public Boolean getState() {
        return state;
    }

    @Override
    public void setState(Boolean state) {
        this.state = state;
        if (state) {
            action = "老板来了";
        } else {
            action = "老板走了";
        }
        notifyObserver();
    }

    @Override
    public String getAction() {
        return action;
    }
}
