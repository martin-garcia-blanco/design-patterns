# Strategy

**_The Decorator Pattern_** attaches additional responsabilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

![Strategy pattern example](https://refactoring.guru/images/patterns/diagrams/decorator/structure-2x.png)

## How it works

Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.

This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

We are demonstrating the use of decorator pattern via following example in which we will decorate a shape with some color without alter shape class.
