import React, { useState } from "react";
import Beverage from "../../models/Beverage/Beverage";
import {
  allBeverages,
  beveragesMap,
  BeverageTypes,
} from "../../models/Beverage/BeverageTypes";
import {
  allBeverageToppings,
  BeverageDecoratorTypes,
} from "../../models/Beverage/decorators/BeverageDecoratorTypes";
import MilkDecorator from "../../models/Beverage/decorators/MilkDecorator";
import MochaDecorator from "../../models/Beverage/decorators/MochaDecorator";
import SoyDecorator from "../../models/Beverage/decorators/SoyDecorator";
import Select from "../Select";

const chooseTopping = (
  topping: BeverageDecoratorTypes,
  beverage: Beverage
): Beverage => {
  switch (topping) {
    case "milk":
      return new MilkDecorator(beverage);
    case "soy":
      return new SoyDecorator(beverage);
    default:
      return new MochaDecorator(beverage);
  }
};

const BeverageSelector: React.FC = () => {
  const [beverage, setBeverage] = useState<Beverage>();
  const [selectBeverage, setSelectBeverage] = useState<BeverageTypes>(
    BeverageTypes.coffee
  );
  const [selectTopping, setSelectTopping] = useState(
    BeverageDecoratorTypes.milk
  );

  const handleBeverage = (): void => {
    if (!selectBeverage) return;
    setBeverage(beveragesMap.get(selectBeverage));
  };

  const handleTopping = (): void => {
    if (!beverage) return;
    setBeverage(chooseTopping(selectTopping, beverage));
  };

  return (
    <>
      <h1>Beverages</h1>
      <div>
        <Select
          name="Beverages"
          items={allBeverages}
          getter={selectBeverage}
          setter={setSelectBeverage}
        />
        <button onClick={handleBeverage}>Add Beverage</button>
      </div>
      <div>
        <Select
          name="Toppings"
          items={allBeverageToppings}
          getter={selectTopping}
          setter={setSelectTopping}
        />
        <button onClick={handleTopping}>Add Topin</button>
      </div>
      {beverage && (
        <div>
          <p>{beverage.getDescription()}</p>
          <p>{beverage.getCost()}</p>
        </div>
      )}
    </>
  );
};

export default BeverageSelector;
