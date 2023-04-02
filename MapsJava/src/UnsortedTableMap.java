import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class UnsortedTableMap<K,V> extends AbstractMap<K,V> {
    //ArrayList table with MapEntry
    private final ArrayList<MapEntry<K,V>> table = new ArrayList<>( );
    //Empty Constructor
    public UnsortedTableMap() {
    }
    //find Index function
    private int findIndex(K key){

        // loop through table get (arraylist get) index and getKey and compare with key
        return -1;
    }
    @Override
    public int size() {
        //get arraylist size
        return 0;
    }

    @Override
    public V get(K key) {
        //use find index and store it in j

        //if j==1 return null
        //return get value of the index table
        return null;
    }

    @Override
    public V put(K key, V value) {
        //use find index and store it in j

        //if j==-1

            //create a new entry and add to arraylist


        //return get value and set value to value
         return null;

    }

    @Override
    public V remove(K key) {
        //use find index and store it in j


        //store value to be removed in answer

        //if j not equal n-1

            //table.set pass index and table get n-1
        //remove table at n-1
        return null;
    }
    private class EntryIterator implements Iterator<Entry<K,V>> {
        private int j=0;
        public boolean hasNext( ) { return j < table.size( ); }
        public Entry<K,V> next( ) {

            if (j == table.size( )) throw new NoSuchElementException( );
            return table.get(j++);
        }
        public void remove( ) { throw new UnsupportedOperationException( ); }

    }

    private class EntryIterable implements Iterable<Entry<K,V>> {
        public Iterator<Entry<K,V>> iterator( ) { return new EntryIterator( ); }
    }
    public Iterable<Entry<K,V>> entrySet( ) { return new EntryIterable( ); } }

