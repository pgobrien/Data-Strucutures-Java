
// Implementation of ArrayList
// Patrick O'Brien
public class MyArrayList<T> {

    private T[] internalArray;
    private int capacity;
    private int size;

    // Creates an internal array
    // Initial default capacity 20
    // Unckecked verison of ArrayList
    public MyArrayList() {
        this.setCapacity(20);
        internalArray = (T[]) new Object[this.getCapacity()];
    }

    // set with desired capacity
    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 10 || initialCapacity > 100) {
            throw new IllegalArgumentException("Initial capacity must be between 10 and 100");
        }

        this.setCapacity(initialCapacity);
        internalArray = (T[]) new Object[this.getCapacity()];
    }

    public void add(T element) {
        if (this.getSize() == getCapacity()) {
            T[] temp = (T[]) new Object[this.getCapacity() + 20];
            for (int i = 0; i < this.getInternalArray().length; i++) {
                temp[i] = this.getInternalArray()[i];
            }
            this.setInternalArray(temp);
        }
        this.getInternalArray()[this.getSize()] = element;
        this.setSize(this.getSize() + 1);
    }

    public T get(int index) {
        if (index < 0 || index > this.getSize()) {
            throw new IndexOutOfBoundsException("Index out of Bounds");
        }
        return this.getInternalArray()[index];
    }



    public T[] getInternalArray() {
        return internalArray;
    }

    public void setInternalArray(T[] internalArray) {
        this.internalArray = internalArray;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public static void main(String[] args) {

        MyArrayList<Integer> testList = new MyArrayList<>();
        testList.add(3);
        testList.add(5);

        System.out.println(testList.get(0));
        System.out.println(testList.get(1));

    }
}



