import java.util.Iterator;
import java.util.List;

public class MyArrayList<E> implements MyCollection<E> {
    private E[] values;
//    private int elems;

    public MyArrayList() {
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElemAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElemAfterIndex);
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyArrayIterator<>(values);
    }

//    @Override
//    public void bubbleSort(List<Integer> e) {
//        int n = e.size();
//        for (int i = 0; i < n - 1; i++) {
//            boolean swapped = false;
//            for (int j = 0; j < n - i - 1; j++) {
//                if (e.get(j) > e.get(j + 1)) {
//                    int temp = e.get(j);
//                    e.set(j, e.get(j + 1));
//                    e.set(j + 1, temp);
//                    swapped = true;
//                }
//            }
//            if (!swapped) break;
//        }
//    }
}
