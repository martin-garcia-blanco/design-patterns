import Beverage from "./Beverage";
import Chocolate from "./Chocolate";
import Coffee from "./Coffee";
import Tea from "./Tea";

export enum BeverageTypes {
    coffee = "coffee",
    tea = "tea",
    chocolate = "chocolate"
}

export const allBeverages = Object.keys(BeverageTypes);

export const beveragesMap: Map<string, Beverage> = new Map([
    ["coffee", new Coffee()],
    ["tea", new Tea()],
    ["chocolate", new Chocolate()]
]); 
