public class MyListClass {

    private Object[] data;
    private int count;

    public MyListClass(){

    }

    public MyListClass(Object[] data, int count) {
        this.data = new Object[10];
        this.count = 0;
    }

    public void add(Object obj){
        this.data[count]= obj;
        count++;
    }

    public Object[] getData(){
        return data;
    }
}
