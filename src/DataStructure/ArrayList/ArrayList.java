package DataStructure.ArrayList;

public class ArrayList {
    private int size = 0;
    private Object[] elementData = new Object[100];

    public boolean addFirst(Object element){
        return add(0, element);
    }
    public boolean addLast(Object element) {
        elementData[size] = element;
        size++;
        return true;
    }

    public boolean add(int index, Object element) {
        for(int i = size - 1; i >= index; i--){
            elementData[i+1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }
    /* 12강 */
    public String toString(){
        String str = "[";
        for(int i = 0; i < size; i++){
            str += elementData[i]; //[5, 10, 15, 20, 30, 40, ]
            if(i < size -1 ){
                str += ",";
            }
        }
        return str + "]";
    }

    /* 13강 remove */
    public Object remove(int index) {
        Object removed = elementData[index];

        for(int i = index + 1; i < size -1; i++){
            elementData[i-1] = elementData[i];
        }
        size--;
        elementData[size] = null;
        //return값이 있다. 삭제한 element에 저장되어있었던 값
        return removed;
    }

    /* 14강 removeFirst, removeLast */
    public Object removeFirst(){
        return remove(0);
    }
    public Object removeLast(){
        return remove(size - 1);
    }
    /* 15강 get */
    public Object get(int index){
        return elementData[index];
    }
}
