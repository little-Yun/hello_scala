一、 较java区别
    
    1、Scala中没有原生类的说法，所有数据类型都是对象
    2、anything 是所有对象的父对象，等同于java -》 object
    3、Scala没有void类型，使用unit进行表示，为：()
    4、数据类型声明：可以用强制类型，也可以用var/val 直接进行声明， 若不指定数据类型会自动转换
    5、常量声明使用val, 变量声明使用var
    
二、元组

    1、和Python的中的元组名称一样，但是这里没有涉及到步长、切片概念，通过 元组(index) 或者 元组._1 获取值
    2、元组里的数据不允许被修改
    3、Scala元组是有长度限制的，单个元组对象只能放22个元素，没搞懂为啥要限制它
    4、Scala元组内容是无法动态添加的，只能在初始化的时候进行赋值，或者重新另起一个元组对象进行操作
 
    
三、方法和函数
    
    1、Scala 方法可以不指定返回值类型，由最后一行代码自动判断返回值类型
    2、Scala 入参可有可无，举例: def test = {}
    3、Scala 方法可指定参数名进行传参，也就是可以不按照参数顺序传递
    4、Scala 可变参数与java String .... params 效果差不多
    5、Scala 闭包函数与java 全局变量调用方式差不多，声明在方法体之外
    
四、字符串

    1、Scala的字符串占位符与值类型相关，且必须严格遵守约定，否则会提示类型不匹配问题
    2、占位符具体类型，%s-代表字符串 %d-代表double %f-代表浮点型
    
    
五、数组

    1、Scala的数组相对java来说还是有点不一样的，上面提到的步长在这里终于出现了，具体如下：
       val array = Array.range(10, 20, 2) 输入结果为：10 12	14	16	18
       Array.rangge 方法参数解释：10 为起点，20 为终点， 2为步长也就是元素间的递增长度, 还是和Python有点不一样
       
六、集合
    
    1、Scala中的集合使用的是java.util 包下的内容
    2、使用方法基本上与java一致
    3、Scala map可以转换为list，使用apply方法传下标进行获取，获取后的对象为List
    4、Scala 对象可以通过 ！= None 进行判空，字符串可以通过StirngUtils.isEmpty 或者 equals("None") 进行判断
    
七、类和对象

    1、Scala中抽象方法必须使用override来进行修饰
    2、子类重写父类抽象方法时可以不使用override关键字
    3、Scala也是实行单继承的
    4、私有方法通过private进行声明，同样构造方法也是可以私有的
    5、伴生对象，与类名字相同，可以访问类的私有属性和方法
    
八、Trait
    
    1、相当于java中的接口interface,但是在实际使用的过程中，感觉这个更像抽象类
    2、Trait中可以声明方法，也可以实现方法。
    3、当trait中存在已实现的方法，那在子类实现的过程中，该方法是可以不需要实现的
    
九、异常
    
    1、Scala异常处理和java有点像，但是catch后面没有具体exception的声明，需要在catch内部里面进行处理
    2、Scala异常处理需要使用case 匹配机制进行
    3、Scala异常也是可以增加finally的， 不能说这个异常和java的很像，只能说是一模一样
    
          
       
            
      
