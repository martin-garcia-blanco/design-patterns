import Beverage from "../Beverage";

abstract class ToppingDecorator extends Beverage {
    public abstract getDescription(): string;
    public abstract getCost(): number;
}

export default ToppingDecorator;