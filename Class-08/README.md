
## Recap
* Inheritance
* Interfaces
* Abstract classes
* Polymorphism
* Protected variables
* Does a subclass inherits private attributes? ([Answer source](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html))

## We will cover today

* Interfaces
* Another time implementing inheritance (=DDDD)
* Polymorphism  

## Today's problem

![Pedro e Bino](http://metropolitanafm.com.br/wp-content/uploads/2017/05/fd631eea3ca71aae07c46a0a9e74bb02_-pedro-e-bino-meme-pedro-e-bino_1920-1259-1024x671-690x452.jpeg)

"Heavy Load" is a transportation company that is creating a new system for their HR.

The guys from the Picture are Pedro and Bino, they are waiting their delayed salary.

All the errors should be handle, in this case and only today, you can print it out and say "Bino! This is a cilada"


Your job is to create a software capable to register people and their information, there is another team working on the payment checks. They said that any employee class which has implemented the functions bellow will work just fine for their system.

double getGrossWage() // returning the gross salary
String getDiscounts() // returning the discounts and descriptions
double calculateNetWage() // returning the net wage.

![Pedro e Bino](http://cdn.naosalvo.com.br/2017/05/Carga-Pesada-1.jpg)

Since you are a good programmer, you already know that all you need to do with the given information is to create an Interface called "PaymentCheck" where you will define how the classes should be implemented in order to create the payment checks.

You also will use the already good and working Person class (from previous practices) and of course, create a Driver class where you will manage the salary calculations.

The Driver class should have the following methods:
* Constructor with the driver license
* setAditionalNightHours(int hours) that pays 40 euros per additional extra hours
* setGottenFines (double fines) that is deduced from the driver's salary

And of course, Driver must implement the payment check, you don't want them not getting paid.

![Pedro e Bino](http://www.tvhistoria.com.br/images/upload/070916-cargapesada-imagem7.jpg)


## Cool links
[Interfaces (From Oracle)](https://docs.oracle.com/javase/tutorial/java/concepts/interface.html)

[polymorphism (From Oracle)](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)
