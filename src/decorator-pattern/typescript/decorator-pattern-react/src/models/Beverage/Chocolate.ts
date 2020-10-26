import Beverage from "./Beverage";

class Chocolate extends Beverage {
    public getDescription(): string{
        return "Chocolate";
    };
    public getCost(): number{
        return 2;
    };
}

export default Chocolate ;