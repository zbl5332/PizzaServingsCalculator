# PizzaServingsCalculator
**Pizza Servings Calculator GUI**

A GUI to calculate the number of servings that a circular pizza of a certain diameter will make. The GUI will have the following appearance:

![PizzaServingsCalculatorInitial](https://github.com/zbl5332/PizzaServingsCalculator/blob/bb2561d726924a10645ceffbe683d32e22f98a98/PizzaServingsCalculatorInitial.png)

It includes the following features:

* The frame title must say 'Pizza Servings Calculator'.
* A grid layout will be used for the GUI.
* The JLabel title of the GUI will say 'Pizza Servings Calculator' and be in red and will be placed in  grid slot 1.
* A JLabel of 'Enter the size of the pizza in inches: ' will be placed in grid slot 2 followed by a JTextField where the pizza size will be entered and have a width of 4.
* A JButton will be placed in grid slot 3 and will contain 'Calculate Servings'.
* A JLabel, initially blank, will be placed in grid slot 4.

To execute the GUI, enter a pizza size in the JTextField and click the Calculate Servings button. The Calculate Servings button handler will then execute and calculate the number of servings and display it as shown in the following image:

![PizzaServingsCalculatorFinal](https://github.com/zbl5332/PizzaServingsCalculator/blob/bb2561d726924a10645ceffbe683d32e22f98a98/PizzaServingsCalculatorFinal.png)

The number of servings will be calculate using the following formula:

         servings = (size / 8)**2

and displayed to two decimal places. Used the Double.parseDouble(textField.getText() ) to get the string value from the JTextField and parse it to a double. This formula assumes that an 8 inch pie makes 1 serving. Based on the area of an 8" pie as one serving, the number of servings will vary with the ratio of the radius of the new pie to the 8" pie squared. Therefore, a 16" pie would give you a ratio of 16/8 or 2 squared which is 4 servings.

Line 2 of the GUI contains two GUI components but each cell of a grid can only contain one component. This is where JPanels come in for GUI design. A JPanel is a container that simply holds other components, so we can use a JPanel as the component for line 2.

The layout of the frame to a 4 line grid layout used a setLayout statement

Once the servings have been calculated, they are displayed in the JLabel in grid slot 4 as shown.

Set the size of the GUI to (350, 300). This should give it the appearance as shown above. The class that represents the GUI should extend JFrame.
