模板方法模式
===

## 1. 模式定义
模板方法模式定义了一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

## 2. 模式结构
模板方法模式包含如下角色：
- AbstractClass: 抽象类
- ConcreteClass: 具体子类
- TemplateMethod: 模板方法
- PrimitiveOperation: 基本方法
- HookOperation: 钩子方法
...

## 3. 模式分析
模板方法模式是通过把不变的行为搬移到超类，去除子类中的重复代码来体现它的优势。模板方法模式就是提供了一个很好的代码复用平台。

## 4. 实例
```java
public abstract class AbstractClass {
    public void TemplateMethod() {
        PrimitiveOperation1();
        PrimitiveOperation2();
        PrimitiveOperation3();
    }

    protected abstract void PrimitiveOperation1();

    protected abstract void PrimitiveOperation2();

    protected abstract void PrimitiveOperation3();
}
```

```java