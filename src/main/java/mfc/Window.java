package mfc;
import java.util.ArrayList;

public class Window {

    ArrayList<Category> ArrayList=new ArrayList<Category>();

    public int category;
    public boolean flag=false;
    public Window(int category){
        this.category=category;
        ArrayList.add(new Category());
        ArrayList.add(new Category());
        ArrayList.add(new Category());
    }

    public void service(int categ){
        MFC_Thread someThread=new MFC_Thread(this,categ);
        someThread.start();
    }

    public int getBadCount(int cat){
        return ArrayList.get(cat).negative;
    }

    public int getAllCount(int cat){
        return ArrayList.get(cat).allCount;
    }
}