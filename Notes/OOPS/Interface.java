Interface:


In java Interface is similar to class which contains only constants(Variables) and group of abstarct methods(without body) and non-abstract methods(from java 8).
--Through interface we can acheviev fully abstraction.


Rules to be followed:
--------------------
1.variables must be public static final(if we not provide JVM will provides internally);
2.Abstract methods should declare as public abstract .(JVM consider as public abstract internally).
3.default and static methods should provide body declaration(fromjava 8)




Points to remember:
------------------
*Interface doesn't contain the constructors(bec constructor usage is to initilize instance variables,but in interface all varials are public static final we cant re initilize means it will not change.so we will not have constructor in interface)
*We can acheive multiple inheritance through interfaces.
*We can't instantiate interface,we can create object for its implemntation class.
*By default variables in interface are public static final
*By default methods in interfaces are public abstract
*should maintain same  method level scope (eg: public)in implementation class.
*A default method(which is having method body) internally JVM consider it as Only public method, not public abstract(bec it have method declaration).
*A method which is declared with body it is mandate provide default acces it will not consider any other specifier."In Java 8 introduced".
*A method is declared without body if it is not declared any specifier internally it create as public abstract. 
* we can create static method with body declaration,bydefault jvm consider as public method.  "In Java 8 introduced".
*A class implements default method then the method should declared as public.


How would the java devolpers manage the  multiple inheritance (default methods introduced from java 8) from diffrent interfaces or if a class and interface have the same methods?

Ans:Well, such fear was clear, so the following rules applied when more than one interface had the same method and a class implements the two of them.

level of access default methods:-
classes > interfaces
children > parent
else select or override implementation

1.If the class contains method which is already present in an interface with default method,then the class invokes the class method only.(if rquire parent method then you want write interface.super.method()     ).classes > interfaces
2.If two interfaces have same default methods with an relation then there will be a confliict to call parent method in to a class.(we can call child interface method   children > parent)
3.We can explicit call for the parent default method from an implement class as interface_name.super.method_Name.


Note:- The implementation class not provide method implementaion for all abstract classes in intrface then theclass become abstract class.


** Default methods in interfaces help us to introduce new functonality without breaking the contract of the implentation class

** Static methods inn interface help us to call by interfacename.methodname in its implementation class.
*8Static methods cant override 

