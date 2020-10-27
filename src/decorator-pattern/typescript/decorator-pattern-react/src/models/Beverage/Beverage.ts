abstract class Beverage {
    description: string = "Unknown beverage";

    public getDescription(): string{
        return this.description;
    };
    
    public abstract getCost(): number;
}

export default Beverage;