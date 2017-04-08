## Eric's Make change Homework Project

The ChangeMaker class will let the user input a cost of an item and how much the person has received.
If the amount paid is less than the price, program will print out a message insufficient fund and end the program.
If not, the program will print out total change due and kind of bills and coins needed to pay them back.
program will check starting from most significant bill ($20) to least significant coin (1cent). 
When it checks it it first subtract $20 from the amount and this continues till the amount becomes negative. If it becomes less than 0, we add 20 back and pass it to the next biggest bill ($10). Everytime it loops, we have a counter to keep track of how much we have to give back. We print out the counter and the bill. After 1 cent is calculated, the Scanner is closed and the program is done running.

