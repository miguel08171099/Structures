public interface Cua<E> {
    public void push(E e) throws ExcepcioCuaCompleta;
    public E pop() throws ExcepcioCuaBuida;
    public int size();
}
