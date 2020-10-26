import React from "react";

interface SelectProps {
  name: string;
  getter: any;
  setter: any;
  items: string[];
}

const Select: React.FC<SelectProps> = ({ name, getter, setter, items }) => {
  return (
    <select
      name={name}
      value={getter}
      onChange={(e) => {
        setter(e.target.value);
      }}
    >
      {items &&
        items.map((item) => (
          <option value={item} key={item}>
            {item}
          </option>
        ))}
    </select>
  );
};

export default Select;
