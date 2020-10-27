import Beverage from "./Beverage";

class Chocolate extends Beverage {

    constructor() {
        super();
        this.description = "Chocolate";
    }

    public getDescription(): string {
        return this.description;
    };
    public getCost(): number {
        return 2;
    };
}

export default Chocolate;