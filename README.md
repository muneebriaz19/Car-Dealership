# Car Dealership

A console application for managing a car dealership: keeping track of the vehicles
in stock and the sales made. I wrote this in 2021 as a university project while
learning Java, and it is here as a record of that work rather than as an example of
how I write code today.

## What it does

- Add cars to the inventory and view what is in stock
- Record a sale and update the inventory
- [add or correct whatever the program actually does, one or two more lines]

## Built with

Java, no external libraries. The project was created in NetBeans, so it builds with
Ant through the included `build.xml`.

## Running it

Open the project in NetBeans and run it, or from the command line:

```
cd "car dealership"
ant run
```

## What I would change today

Everything runs through the console with the logic and the input handling mixed
together, and there are no tests. If I rebuilt it now I would separate the domain
classes from the menu code, persist the inventory instead of losing it when the
program exits, and write tests for the sales logic.
