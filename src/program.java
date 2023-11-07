public class program {
	public static void main(String[] args){

        Toy toy = new Toy();
        toy.put("1 2 конструктор");
        toy.put("2 2 робот");
        toy.put("3 6 кукла");
        toy.writeToFile("toys.txt", 10);

    }
}
