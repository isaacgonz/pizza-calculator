import java.util.Scanner;

public class CicisCalc
{
    public static void main(String[] args)
    {   int pepperoni = 10;
        int cheese = 10;
        int meatLovers = 10; 
        
        int answerPeople = 0; 
        int personDining = 20;
        
        int drinksPrice = 5;
        int answerDrinks = 0;
        
        int pit;
        int cod;
        int outcome;
        Scanner stringsUser = new Scanner(System.in);        
        Scanner inputFromuser = new Scanner(System.in);        
        Scanner inputChar = new Scanner(System.in);

        String greeting = "Welcome to cicis";
        String quesDiningin = "Dine in or to go"; 
        String answerDining ;
        String peopleEatingin = "How many people will be eating";
        String doYouWantbev = "do you want a beverage";
        String answerWantbev ;
        String numbDrinks = "How many drinks";
        String pizzaType = "What type of pizza do you want";
        String answerPizzatype ;
        String isThatall = "Will that be all";
        String answerIsall ;
        
        
        System.out.println(greeting);
        System.out.println(quesDiningin);
        answerDining = stringsUser.nextLine();
        
        if (answerDining.equals("dine in") || answerDining.equals("Dine in") || answerDining.equals("DINE IN"))
        {
            System.out.println(peopleEatingin);
            answerPeople = inputFromuser.nextInt();
            System.out.println(doYouWantbev);
            answerWantbev = stringsUser.nextLine();
            
            
            if (answerWantbev.equals("Yes") || answerWantbev.equals("yes") || answerWantbev.equals("YES"))
            {
                System.out.println(numbDrinks);
                answerDrinks = inputFromuser.nextInt();
            }
            else if (answerWantbev.equals("No") || answerWantbev.equals("NO") || answerWantbev.equals("no"))
            {
                System.out.println("Ok, not a problem.");
                
            }
                else 
            {
                System.out.println("wrong input");
            }
            
            pit = personDining * answerPeople;
            cod = answerDrinks * drinksPrice;
            outcome = pit + cod;
            
            System.out.println(isThatall);
            answerIsall = stringsUser.nextLine();
            
            if (answerIsall.equals("Yes") || answerIsall.equals("yes") || answerIsall.equals("YES"))
            {
                System.out.println("You wanted " + answerPeople + " people dining in with " + answerWantbev + " drinks.");
                System.out.println ("total outcome is " + outcome +".");
            }
            else 
            {
                System.out.println("wrong input");}
        }
        else if(answerDining.equals ("to go") || answerDining.equals("togo") || answerDining.equals("To go") || answerDining.equals("TO GO") || answerDining.equals("TOGO"))
        {
           System.out.println("What type of pizza?");
            System.out.println("A: Pepperoni \nB: Cheese \nC: Meat lovers");
           String pizzaLetter = stringsUser.nextLine();
        
            System.out.println("How many pizzas do you want?");
            int numbPizzas = inputFromuser.nextInt();
            
            int totalCost = numbPizzas * 10;
            System.out.println("your total is " + totalCost);
     
        }
       else 
       {
           System.out.println("wrong input");
           
       }
     
     
    }
}
