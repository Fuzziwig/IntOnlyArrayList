package input;

public class IntOnlyArrayList {

    private int intarray[];

    public IntOnlyArrayList(){
    }

    public int get(int index) {
        try {
            return this.intarray[index];
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public void add(int value) {
        try {
            if (this.intarray == null) {
                this.intarray = new int[1];
                this.intarray[0] = value;
                return;
            }
            int length = this.intarray.length;
            //making larger array for the new value to be added
            int newintarray[] = new int[length + 1];
            //copy existing values into the new array
            System.arraycopy(this.intarray, 0, newintarray, 0, length);
            //new extended array assigned to intarray
            this.intarray = newintarray;
            //assigning value to new intarray
            this.intarray[length] = value;
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void remove(int index){
        try {
            int length = this.intarray.length;
            //making smaller array
            int newintarray[] = new int[length - 1];
            int tracker = 0;
            for (int i = 0; i < length; i++) {
                if (i == index) {
                    continue;
                }
                newintarray[tracker] = this.intarray[i];
                tracker++;
            }
            //new smaller array assigned to intarray
            this.intarray = newintarray;
        }
        catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
        }

    }

    public int size(){
        if (this.intarray==null) { return -1; }
        else return this.intarray.length;
    }

    public void clear(){
        this.intarray = null;
    }

    public void add(int index, int value){
        try {
            if (this.intarray == null) {
                this.intarray = new int[1];
                this.intarray[0] = value;
                return;
            }
            int length = this.intarray.length;
            int newintarray[] = new int[length+1];
            if (index==0) {
                newintarray[0] = value;
                System.arraycopy(this.intarray, 0, newintarray, 1, length);
            }
            else if (index==length) {
                newintarray[length] = value;
                System.arraycopy(this.intarray, 0, newintarray, 0, length);
            }
            else {
                    System.arraycopy(this.intarray, 0, newintarray, 0, index);
                    newintarray[index] = value;
                    System.arraycopy(this.intarray, index, newintarray, index+1, length-index);
            }
            this.intarray = newintarray;
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

}
