package homework6;

public class RubberArray {
    private int[] array;

    public RubberArray() {
        array = new int[0];
    }

    public void add(int value) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length]=value;
        array = newArray;
    }

    public void add(int index, int value) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index, newArray, index + 1,array.length - index);
        newArray[index] = value;
        array = newArray;
    }

    public void addAll(int index, int[] array){
        int[] newArray = new int[this.array.length + array.length];
        System.arraycopy(this.array, 0, newArray, 0, index);
        System.arraycopy(array, 0, newArray, index, array.length);
        System.arraycopy(this.array, index , newArray, index + array.length ,this.array.length - index);
        this.array = newArray;
    }

    public void addAll(int[] array){
        int[] newArray = new int[this.array.length + array.length];
        System.arraycopy(this.array, 0, newArray, 0, this.array.length);
        System.arraycopy(array, 0, newArray, this.array.length, array.length);
        this.array = newArray;
    }

    public int get(int index) {
        return array[index];
    }

    public void remove(int index) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        array = newArray;
    }

    public boolean contains(int value) {
        for (int arrays: array) {
           if(arrays == value) {
               return true;
           }
        }
        return false;
    }

    public int indexOf(int value) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i;
            }
        }
        return - 1;
    }

    public void clear() {
        int[] newArray = new int[0];
        array = newArray;
    }

    public int size() {
        return array.length;
    }

    public boolean isEmpty() {
        if(array.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if(i < array.length -1){
                sb.append( ", ");
            }

        }
        return sb.append("]").toString();
    }
}
