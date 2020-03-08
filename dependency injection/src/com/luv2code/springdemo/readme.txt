In this project a simple example of dependency injection is implemented
At first we implement Inversion of control.
In IoC, custom-written portions(the XML file in our case) of a computer program receive the flow of control from a generic framework
The Coach interface has all the methods the will be implemented by the BasketBallcoach and TrackCoach class.
the XML creates objects from BBC and TRC and return it to the MyApp.java class based on the bean id and class associated to it.
This way the control of creating objects and managing them is out-source making this APP more configurable


NEXT we have implemented dependency injection
The Coaches class is depended on the FotuneService class to provide todays fortune
Again we have out-source it.
The object of fortune is created in the XML file and that object is injected in then injected to coach classes using their constructors making it constructor injection.  