
import Beverage from "../Beverage";
import ToppingDecorator from "./ToppingDecorator";

class MilkDecorator extends ToppingDecorator {
    beverage: Beverage;
    constructor(beverage: Beverage) {
        super();
        this.beverage = beverage;
    }

    public getDescription(): string {
        return this.beverage.getDescription() + ", milk";
    };
    public getCost(): number {
        return this.beverage.getCost() + 0.2;
    };
}

export default MilkDecorator;