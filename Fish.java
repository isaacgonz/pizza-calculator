public class Fish 
{
    public static void main(String[] args)
    {
        int fishCaught = 20;
        int fishSold = 10;
        int fishLeftover = 0;
        
        String youHave = "You have ";
        String fishLeft = " fish left over.";
        String youHad = "You had ";
        String fishStart = " fish to start.";
        String youSold = "You sold ";
        String fish = " fish.";
        
        fishLeftover = fishCaught - fishSold;
        
        String fishLeftOverIs = "The fish left over is ";
        //String phrase2 = "";
            
        System.out.println(fishLeftOverIs + fishLeftover);
        
        //The fish left over is 10.
        System.out.println(youHave + fishLeftover + fishLeft);
        
        //You had 20 fish to start.
        System.out.println(youHad + fishCaught + fishStart);
        
        //You sold 10 fish.
        System.out.println(youSold + fishSold + fish);
    }
}
