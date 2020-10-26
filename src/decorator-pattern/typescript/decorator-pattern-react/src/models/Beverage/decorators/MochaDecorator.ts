
import Beverage from "../Beverage";
import ToppingDecorator from "./ToppingDecorator";

class MochaDecorator extends ToppingDecorator {
    beverage: Beverage;
    constructor(beverage: Beverage){
        super();
        this.beverage= beverage;
    }

    public getDescription(): string{
        return this.beverage.getDescription()+", mocha";
    };
    public getCost(): number{
        return this.beverage.getCost()+0.8;
    };
}

export default MochaDecorator ;