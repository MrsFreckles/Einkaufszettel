# Einkaufsliste

Einkaufsliste is a simple Java console application that allows users to manage a shopping list. Users can add items, remove items, and view the current list.

## Features

- Add items to the shopping list
- Remove items from the shopping list
- View the current shopping list
- Exit the application

## Requirements

- Java 8 or higher

## Usage

1. Compile the Java files:
    ```sh
    javac src/*.java
    ```

2. Run the application:
    ```sh
    java -cp src Main
    ```

3. Use the following commands in the console:
    - `add <item>`: Adds an item to the shopping list
    - `remove <item>`: Removes an item from the shopping list
    - `list`: Displays the current shopping list
    - `exit`: Exits the application

## Example

```sh
> add Milk
Added Milk to the list.
> add Bread
Added Bread to the list.
> list
~~~ Shopping List ~~~
- Milk
- Bread
> remove Milk
Removed Milk from the list.
> list
~~~ Shopping List ~~~
- Bread
> exit
```

## License

This project is licensed under the MIT License.
```
