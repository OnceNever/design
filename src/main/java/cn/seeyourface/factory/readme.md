工厂模式
===
简单工厂模式 vs 工厂模式
简单工厂模式：一个工厂类根据传入的参量决定创建出那一种产品类的实例。简单工厂模式是工厂模式家族中最简单实用的模式。
工厂模式：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。

工厂模式的优点
1. 一个调用者想创建一个对象，只要知道其名称就可以了。
2. 扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
3. 屏蔽产品的具体实现，调用者只关心产品的接口。
4. 典型的解耦框架。高层模块只需要知道产品的抽象类，其他的实现类都不用关心。
5. 工厂模式符合“开闭原则”。
6. 工厂模式符合“单一职责原则”。
7. 工厂模式符合“依赖倒转原则”。

工厂模式的缺点
1. 每增加一个产品，就要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。