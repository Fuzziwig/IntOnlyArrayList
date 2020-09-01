package input;

public class Main {

    public static void main(String[] args) {
        //testing intonlyarraylist class
        IntOnlyArrayList liste = new IntOnlyArrayList();
        makeTestList(liste);
        liste.clear();
        System.out.println("list cleared");
        System.out.println("size is "+liste.size());
        System.out.println();
        makeTestList(liste);
        printTestList(liste);
        //testing add
        System.out.println("adding number at beginning");
        liste.add(0,45777);
        printTestList(liste);
        liste.remove(0);

        System.out.println("adding number at end");
        liste.add(7,45777);
        printTestList(liste);
        liste.remove(7);

        System.out.println("adding number at middle-ish");
        liste.add(3,45777);
        printTestList(liste);
        liste.remove(3);

    }

    public static void makeTestList(IntOnlyArrayList liste){
        System.out.println("making testlist");
        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);
        liste.add(10);
        liste.add(11);
        System.out.println("size is "+liste.size());
    }

    public static void printTestList(IntOnlyArrayList liste){
        for (int i = 0; i<liste.size(); i++){
            System.out.println(liste.get(i));
        }
        System.out.println();
    }

}
