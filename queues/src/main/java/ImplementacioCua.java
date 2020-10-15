import java.util.Queue;

public class ImplementacioCua<E> implements Cua<E> {
    private E[] data;
    private int p;

    public ImplementacioCua(int len) {
        this.data = (E[])new Object[len];
        this.p = 0;
    }

    public void push(E e){
        if (this.estaPle()) throw new ExcepcioCuaCompleta();
        this.data [this.p++] = e;
    }
    public E pop() throws ExcepcioCuaBuida{
        if (this.estaBuit()) throw new ExcepcioCuaBuida;
        E ret = this.data[0];
        for (int i=0; i<this.p; i++){
            this.data[i] = this.data[i+1];
        }
        this.p--;
        return ret;
    }
    private boolean estaPle(){
        return this.p == this.data.length;
    }
    private boolean estaBuit(){
        return this.p == 0;
    }

    public int size() {
        return this.p;
    }
}
