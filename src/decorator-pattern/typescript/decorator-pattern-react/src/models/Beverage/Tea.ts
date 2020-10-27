import Beverage from "./Beverage";

class Tea extends Beverage {

    constructor() {
        super();
        this.description = "Tea";
    }

    public getDescription(): string {
        return this.description;
    };

    public getCost(): number {
        return 1.2;
    };
}

export default Tea;