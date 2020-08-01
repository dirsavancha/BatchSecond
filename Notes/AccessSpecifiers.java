Access Specifiers or Modifiers:

Def:-Modifiers in java are Reserved keywords which we can add for variables ,methods and classes in order to change their respective level of scope.
eg:
public class A{
	private int i=100;
	
	protected void m1(){
		
	}
	void m2(){
		
	}
}
Modifiers are classified in two two groups:
1.Access Modifiers
2.Non-Access  Modifiers
1.Access Modifiers:--
Accesss Modifiers are  keywords is used to provide diffrent level of access to the classes,method and variables.
They are :
1.private: Scope is with in the class
2.default : scope is with in the class and only with in the package
3.protected : Scope is with in the class , with in the package and with in the subclass(parent child relation)
4.public : scope is any where(overall world)

                                              private      default      protected    public

with-in-class -------------------------->     YES          YES             YES        YES

with-in-package-subclass---------------->     NO           YES             YES        YES

with-in-package-with-out-subclass------->     NO           YES             YES        YES

another package-with subclass----------->     NO           NO              YES        YES

another package without subclass-------->     NO           NO              NO         YES


2.Non-Access  Modifiers:
 These are classified as
 1.static: Used to create static variable ,methods.It is independent from the class object,it means static variable ,method can be called using class name.variable name or class name.method name.
 2.final: is a keyword ,in java variable ,methods and classes can have the final keyword.Once final is declared we cant reinitilized the variable and we cant override the final method and we cant inherit the final class.
 3.abstract : can be used for class and method(if we declared as abstract then method or class should not ne final).
 4.synchronized:The synchronized keyword used to indicate that a method can be accessed by only one thread at a time.
 5.transient. :it is applicable for variable  used in serilization and deserialization
 6.volatile:used for only private or object type instance variables , used for thread related