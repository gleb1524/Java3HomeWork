import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> box;

    public Box() {

        this.box = new ArrayList<>();
    }

    public Box(T...box){
        this.box = new ArrayList<>(Arrays.asList(box));
    }

    public float getWeightBx(){
       return box.size()*box.get(0).getWeightFr();
    }


    public void putFruitInBox(T fruit, int value){
        for (int i = 0; i < value; i++) {
            box.add(fruit);
        }
    }

    public boolean compare(Box<?> boxCompare){
        return Math.abs(this.getWeightBx()-boxCompare.getWeightBx())<0.0001;
    }

    public void dropOfFruit(Box<T> boxAccept){
        if(this == boxAccept){
            System.err.println("The current box cannot be == to the accept box");
        }else {
            boxAccept.box.addAll(this.box);
            this.box.clear();
        }
    }

    public static void main(String[] args) {

    Box<Apple> appleList = new Box<>();
    Box<Apple> appleBox = new Box<>();
    appleBox.putFruitInBox(new Apple(), 2);
    appleList.putFruitInBox(new Apple(), 1);
    Box<Orange> orangeList  = new Box<>();
    orangeList.putFruitInBox(new Orange(), 2);
    appleList.dropOfFruit(appleBox);

    System.out.println(orangeList.compare(appleBox));
    }
}
