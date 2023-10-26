package mfc;
public class MFC_Thread extends Thread{

    Window window;
    int category;

    public MFC_Thread(Window window, int category){
        this.window=window;
        this.category=category;
    }
    @Override
    public void run() {
        if(window.flag==false & (category==window.category)){
            window.flag=true;
            window.ArrayList.get(category-1).allCount++;
        } else if (window.flag==false & window.category==1) {
            window.flag=true;
            window.ArrayList.get(category-1).allCount++;
        } else{
            window.ArrayList.get(category-1).allCount++;
            window.ArrayList.get(category-1).negative++;
        }
        window.flag=false;
    }



}