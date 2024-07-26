package DataStructure.ArrayList;

public class ArrayList {
    private int size = 0;
    private Object[] elementData = new Object[100]; // 내부적으로 사용하는 배열이 값이 fix 되어있다. 배열의 한계를 넘어서면 x


    public boolean add(int index, Object element) {
        // 엘리먼트 중간에 데이터를 추가하기 위해서는 끝의 엘리먼트부터 index의 노드까지 뒤로 한칸씩 이동시켜야 합니다.
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
        // index에 노드를 추가합니다.
        elementData[index] = element;
        // 엘리먼트의 숫자를 1 증가 시킵니다.
        size++;
        return true;
    }

    public boolean addLast(Object element) {
        elementData[size] = element;
        size++;
        return true;
    }

    public boolean addFirst(Object element){
        return add(0, element);
    }

    public Object remove(int index) {
        // 엘리먼트를 삭제하기 전에 삭제할 데이터를 removed 변수에 저장합니다.
        Object removed = elementData[index];
        // 삭제된 엘리먼트 다음 엘리먼트부터 마지막 엘리먼트까지 순차적으로 이동해서 빈자리를 채웁니다.
        for (int i = index + 1; i <= size - 1; i++) {
            elementData[i - 1] = elementData[i];
        }
        // 크기를 줄입니다.
        size--;
        // 마지막 위치의 엘리먼트를 명시적으로 삭제해줍니다.
        elementData[size] = null;
        return removed;
    }

    public String toString(){
        String str = "[";
        for(int i=0; i < size; i++){
            str += elementData[i];
            if(i < size-1){
                str += ",";
            }
        }
        return str + "]";
    }

    public Object removeFirst(){
        return remove(0);
    }

    public Object removeLast(){
        return remove(size-1);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public int size() {
        return size;
    }

    /* 16강 */
    public int indexOf(Object o) {
        for(int i = 0; i < size; i++){
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1; //찾는 값이 없다
    }

    /* 17강 */
    public ListIterator listIterator() {
        return new ListIterator();

    }

    public class ListIterator{
        private int nextIndex = 0;
        public Object next(){
            // Object returnData = elementData[nextIndex];
            //nextIndex++;
            //return returnData;
            return elementData[nextIndex++];
        }

        public boolean hasNext() {
            return nextIndex < size();
        }
        /* 18강 previous hasPrevious */
        public Object previous(){
            return elementData[--nextIndex];
        }

        public boolean hasPrevious() {
            return nextIndex > 0;
        }

        public void add(Object element) {
            ArrayList.this.add(nextIndex++, element);
        }

        public void remove(Object element) {
            ArrayList.this.remove(nextIndex-1);
            nextIndex--;
        }
    }

}
