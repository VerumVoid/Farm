import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Farm {
    private ArrayList<Flower> flowers;

    /**
     * Plants a flower, cant plant flowers of more then 5 types
     * @param flower
     */
    public void plant(Flower flower){
        HashSet<String> temp = new HashSet<>();
        for(Flower f: flowers){
            temp.add(f.getName());
        }
        temp.add(flower.getName());
        if(temp.size() > 5){
            return;
        }
        flowers.add(flower);
    }

    /**
     * Waters a flower
     * @param flower
     */
    public void water(Flower flower){

    }

    /**
     * Removes a flower
     * @param flower
     */
    public void gather(Flower flower){
        flowers.remove(flower);
    }
}
