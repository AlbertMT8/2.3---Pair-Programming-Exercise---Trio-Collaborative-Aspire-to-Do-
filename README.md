# Simple Lunch Items Java Program

This Java program models a simple lunch menu system, featuring individual items such as drinks, salads, and sandwiches, along with a special combo option called a "Trio."

## Classes Overview

### 1. `MenuItem`
- Represents a generic menu item with a name and price.
- **Methods**:
  - `getName()`: Returns the name of the menu item.
  - `getPrice()`: Returns the price of the menu item.
  - `toString()`: Returns a string representation of the item with formatted price.

### 2. `SimpleLunchItem`
- Extends `MenuItem` and serves as a base class for specific types of lunch items like `Drink`, `Salad`, and `Sandwich`.

### 3. `Drink`
- Represents a drink item.
- **Constructor**:
  - Accepts a name and price for the drink.

### 4. `Salad`
- Represents a salad item with an additional attribute for dressing.
- **Constructor**:
  - Accepts a name, dressing type, and price for the salad.
- **Methods**:
  - `getName()`: Overrides to include the dressing type in the name.

### 5. `Sandwich`
- Represents a sandwich item with an additional attribute for bread type.
- **Constructor**:
  - Accepts a name, bread type, and price for the sandwich.
- **Methods**:
  - `getName()`: Overrides to include the bread type in the name.

### 6. `Trio`
- Represents a combo meal consisting of a sandwich, salad, and drink.
- **Constructor**:
  - Accepts a `Sandwich`, `Salad`, and `Drink` as its components.
- **Methods**:
  - `getName()`: Returns the names of the sandwich, salad, and drink in a single string.
  - `getPrice()`: Calculates the price by summing the two highest-priced items in the trio.

## Usage Example

In the `main` method of the `Trio` class, a few sample items and trios are created and displayed:

```java
Sandwich burger = new Sandwich("Cheeseburger", "bun", 2.75);
Salad spinachSalad = new Salad("Spinach Salad", "italian", 1.25);
Drink orange = new Drink("Orange Soda", 1.25);

Trio trio1 = new Trio(burger, spinachSalad, orange);
System.out.println(trio1);
