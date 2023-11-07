import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Random;

public class Toy {

    public int id;
    public int weigth;
    public String name;

    public Toy(int id, int weigth, String name) {
        this.id = id;
        this.weigth = weigth;
        this.name = name;
    }

    private PriorityQueue<Toy> pqToys;
    public Toy(){
        pqToys = new PriorityQueue<>((toy1, toy2) -> Integer.compare(toy2.weigth, toy1.weigth));
    }

    public void put (String toyString) {
        String[] fields = toyString.split(" ");
        Toy toy = new Toy(Integer.parseInt(fields[0]), Integer.parseInt(fields[1]), fields[2]);
        pqToys.add(toy);
    }

    public int get() {
        Random random = new Random();
        int random_first = random.nextInt(10);
        if (random_first < 2)
            return 1;
        else if (2 <= random_first && random_first < 4)
            return 2;
        return 3;

    }

    public void writeToFile(String fName, int count){

        try{
            FileWriter writer = new FileWriter(fName);

            for (int index = 0; index < count; index++) {
                writer.write(Integer.toString(get()));
            }
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}