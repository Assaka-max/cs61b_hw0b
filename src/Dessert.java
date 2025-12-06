public class Dessert {
    public int flavor;
    public int price;
    static int numDesserts = 0;

    public Dessert(int flavor, int price){
        this.flavor = flavor;
        this.price = price;
        numDesserts++;
    }

    public void printDessert(){
        System.out.print("" + this.flavor + ' ' + this.price + ' ' + Dessert.numDesserts);
    }

    public static void main(String[] args){
        System.out.println("I love dessert!");
    }
}
