# JavaClone
JavaClone

Java克隆 ： 

深克隆  浅克隆的区别

被拷贝对象 A 
新对象 B

1-->浅克隆 ：  遇到基本数据类型，直接从A拷贝数值给B；
              遇到引用数据类型，直接把A或者A里面的引用数据类型的内存地址引用拷贝给B；
              
2-->深克隆：   遇到基本数据类型，直接从A拷贝数值给B；
              遇到引用数据类型，需要在被拷贝对象A以及被拷贝对象A中的其他对象中重写父类Object的clone()方法；
              并且通过super.clone()获取新的拷贝对象。
              例如 ： 
              @Override
              public Object clone() throws CloneNotSupportedException
              {
                  Person person = null;
                  person = (Person) super.clone();
                  return person;
              }
