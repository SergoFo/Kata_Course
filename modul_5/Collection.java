import java.util.Arrays;
import java.util.Iterator;

public class Collection {
    public static void main(String[] args) {
        java.util.Collection<?> collection = new java.util.Collection<Object>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Object> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(java.util.Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(java.util.Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(java.util.Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(java.util.Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }
        };
        Object object = new Object();
      //  collection.add(object);
        collection.contains(object);
     //   collection.addAll(Arrays.asList(object));
        collection.clear();
        collection.remove(object);
        collection.toArray();
        collection.iterator();
        collection.size();
    }
}
