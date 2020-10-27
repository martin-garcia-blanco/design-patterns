import Beverage from "./Beverage";

class Coffee extends Beverage {

    constructor() {
        super();
        this.description = "Coffee";
    }

    public getDescription(): string {
        return this.description;
    };
    public getCost(): number {
        return 1;
    };
}

export default Coffee;