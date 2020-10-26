import Beverage from "./Beverage";

class Tea extends Beverage {
    public getDescription(): string{
        return "Tea";
    };
    public getCost(): number{
        return 1.2;
    };
}

export default Tea ;