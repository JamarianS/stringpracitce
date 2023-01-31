public class Chocolate {
    public static void main(String[]args){
        int numBags = 9;
        int eachBag = 2;
        int totalChocolate;
        int newEachBag = 3;
        int newNumBags;

        totalChocolate = numBags * eachBag;
        newNumBags = totalChocolate / newEachBag;

        System.out.println("You will need " + newNumBags + "  bags if you add three chocolate to each bag instead of two ");


    }
}
