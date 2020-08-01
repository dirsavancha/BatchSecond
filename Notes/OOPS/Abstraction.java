

Abstraction:-

Def1:-Abstraction is art of hiding implementation details and show the essential details require by user.
Def2:-Abstraction is to extract essential details and enclose the non-essential details.

Note:  Abstraction hides the details at Design level 
       (Encapsulation hides the details at implementation level)

Eg:-

Note :- In java we can achieve Abstraction in two ways:
1. By using Interfaces and (Fully ABstraction)
2. By using Abstract classes(Partial Abstraction)

 Abstract classes:-
 A class which specify the keyword abstract is know as Abstract class which consist of abstract and non-abstract methods.
 A class which contains atleast one abstract method then the class treatd as Abstract class
 
 points to remember:-
 ---------------------
 *Abstract classes contains the constructor(to initilize instance variables)
 *Abstract class can't create an object,only child class can create an object.
 *If a child method not provide any implementation for abstarct method from abstract class then the child class becomes abstract class.
 *A Child class must override all unimplemented methods from its parent class.
 *A child class has not overide the unimplemented methods from its parent class then the child class becomes abstract.
 
 Diffrence between Abstraction and InterfaceAddress
 
Interface:-                                                                                                                      
1.	By default (implicitly) variables are  public static final                                             
2.	All Methods by deault (implictly)are public abstract(If we not specify explictly jvm creates implicitly public abstract)
3.	A overridden method from interface to a class should be with in the scope or same.  
4. Interface can't implemnts abstract class or any other classes.                                                            
5.	Multiple inheritance is possible                              
6. Interface can have parameterized abstract methods            
7. Interfaces will not contain constructors                       



Abstract:-
1.	Any type of variables we can use(Acess specifier)eg: public,default,private,protected,final,static and non static.
2.Explicitly we should provide abstract for a method.
 3.Want to use access specifier or overriden method with in  be declare as public(mandatory).
4. Abstract class can implements interface and can extends other classes.
5.Multiple Inheritance is not possible.
 6.Abstract class can have parameterized methods.
 7.Abstract classes have the constructors to initilize non                                                                   static variables