单例模式
===

## 1. 单例模式的定义
单例模式(Singleton Pattern)：单例模式确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例，这个类称为单例类，它提供全局访问的方法。

## 2. 单例模式的实现
单例模式的实现有多种方式，如下：
- 懒汉式，线程不安全
- 懒汉式，线程安全
- 饿汉式
- 双检锁/双重校验锁
- 登记式/静态内部类
- 枚举

### 2.1 懒汉式，线程不安全
```java
public class Singleton {
    private static Singleton instance;
    private Singleton (){}
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### 2.2 懒汉式，线程安全
```java
public class Singleton {
    private static Singleton instance;
    private Singleton (){}
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### 2.3 饿汉式
```java
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton (){}
    public static Singleton getInstance() {
        return instance;
    }
}
```

### 2.4 双检锁/双重校验锁
```java
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
```

### 2.5 登记式/静态内部类
```java
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
```

### 2.6 枚举
```java
public enum Singleton {
    INSTANCE;
    public void whateverMethod() {
    }
}
```

## 3. 单例模式的优缺点
### 3.1 优点
- 在内存中只有一个实例，减少了内存开销。
- 可以避免对资源的多重占用。
- 设置全局访问点，严格控制访问。
- 有利于 GC 优化。

### 3.2 缺点
- 没有接口，扩展困难。
- 如果要扩展单例对象，只有修改代码，没有其他途径，违背了开闭原则。
- 在并发测试中，单例模式不利于代码调试。在调试过程中，如果单例中的代码没有执行完，也不能模拟生成一个新的对象。
- 单例模式的功能代码通常写在一个类中，如果功能设计不合理，则很容易违背单一职责原则。

## 4. 单例模式的使用场景
- 需要频繁实例化然后销毁的对象。
- 创建对象时耗时过多或者耗费资源过多，但又经常用到的对象。
- 有状态的工具类对象。
- 频繁访问数据库或文件的对象。