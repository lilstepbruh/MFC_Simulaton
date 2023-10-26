package mfc;
import java.util.Random;

public class MFC {

    public static void main(String[] args) {

        Window winOne=new Window(1);
        Window winTwo=new Window(2);
        Window winThree=new Window(3);

        for(int i=0;i<5000;i++){
            int categ=new Random().nextInt(1,4);
            int windowNumber=new Random().nextInt(1,4);
            if(windowNumber==1){
                winOne.service(categ);
            }
            if(windowNumber==2){
                winTwo.service(categ);
            }
            if(windowNumber==3){
                winThree.service(categ);
            }
        }



        int a=0;
        for (int i=0;i<3;i++){
            a++;
            System.out.println("Процент ушедших из "+a+" категории "+((float)(winOne.getBadCount(i)+winTwo.getBadCount(i)+winThree.getBadCount(i))/(float)(winOne.getAllCount(i)+winTwo.getAllCount(i)+winThree.getAllCount(i)))*100);
        }
    }

}
