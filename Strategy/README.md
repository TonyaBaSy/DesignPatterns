策略模式
=======
### 共享名词
共享名词代表着一套解决方案(一种策略)，比如“西红柿炒鸡蛋”，就是餐饮行业的一个共享名词，听到这个词以后，作为餐饮方就会给顾客做这一道菜，可以把这专有名词看做一个策略。

### 策略
1. 变化抽离：将多变的鸭子飞行抽象成一个策略接口，**鸭子拥有这个接口的变量，根据需要 setter 不同的实现**，通过调用公共的方法，来实现不同鸭子的飞行方式。
2. 扩展接口：通过对飞行接口进行不同的实现，来添加多彩的飞行方式。这样**面向接口编程**，是的扩展起来更加便捷。

### 为什么要用组合
鸭子和飞行之间是组合关系，为什么非要是组合呢？

首先，**构造飞行接口被各个鸭子实现**的方式是不行的，因为飞行接口没有实现，需要它的鸭子子类去实现，每个鸭子自己实现一套飞行接口，那么代码没有复用。

然后，我们又想在父类 Duck 中构造一个**实现了的** fly 的方法，让子类去继承。但是这就强加给了子类一个方法，也就是说子类没有选择权，**必须继承**。

最后，我们想“飞行”可以单独拿出来**独立成块**，用组合的方式给各个鸭子赋予飞行技能，因为组合方式选择的主动权在子类。

>   接口，就是一个框子，需求和实现分离
>   继承，是一种强关系，子类**必须继承**父类的所有
>   组合，是一种弱关系，子类可以对“资源”根据需要自行选择

### “有一个”和“是一个”
“鸭子**有一个**飞行的接口变量，红鸭子**是一个**鸭子。”

*   “有一个”指的是组合关系
*   “是一个”指的是继承关系

>   组合关系比继承关系的耦合程度要低，更易于扩展。