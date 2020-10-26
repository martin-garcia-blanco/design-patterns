import Beverage from "./Beverage";

class Coffee extends Beverage {
    public getDescription(): string{
        return "Coffee";
    };
    public getCost(): number{
        return 1;
    };
}

export default Coffee ;