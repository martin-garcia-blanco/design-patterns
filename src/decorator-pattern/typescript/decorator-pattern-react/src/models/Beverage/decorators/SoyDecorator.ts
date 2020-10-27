
import Beverage from "../Beverage";
import ToppingDecorator from "./ToppingDecorator";

class SoyDecorator extends ToppingDecorator {
    beverage: Beverage;
    constructor(beverage: Beverage) {
        super();
        this.beverage = beverage;
    }

    public getDescription(): string {
        return this.beverage.getDescription() + ", soy";
    };
    public getCost(): number {
        return this.beverage.getCost() + 0.5;
    };
}

export default SoyDecorator;