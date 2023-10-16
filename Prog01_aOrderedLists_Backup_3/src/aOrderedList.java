public class aOrderedList {
    final int SIZEINCREMENTS = 20;
    private Car[] oList;
    private int numObjects;

    public aOrderedList() {
        oList = new Car[SIZEINCREMENTS];
        numObjects = 0;

    }

    void add(Car newCar) {
        oList[numObjects] = newCar;
        numObjects++;
    }
    public String toString() {
        String retString = "";
        for (int i = 0; i < oList.length; i++) {
            retString += oList[i].toString() + "\n";
        }

        return retString;
    }

}
