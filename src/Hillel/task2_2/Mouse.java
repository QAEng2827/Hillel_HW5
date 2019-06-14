package Hillel.task2_2;

public class Mouse {
    int mouseNumber;
 //   int i =1;



    public Mouse(int i) {

        mouseNumber = i++;
        this.mouseNumber = mouseNumber;
    }
    public void hop(){
        System.out.println("Now mice #"+mouseNumber+" is hopping");
    }
}
