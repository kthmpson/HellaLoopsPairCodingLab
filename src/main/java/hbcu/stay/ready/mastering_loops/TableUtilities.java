package hbcu.stay.ready.mastering_loops;

public class TableUtilities {

    public static String getSmallMultiplicationTable() {
        String result = "";
        for(int col = 1; col <= 5; col++){
            for(int row = 1; row <= 5; row++){
                result += String.format("%3d |", col * row);
            }
            result += "\n";
        }
        return result;
    }

    public static String getLargeMultiplicationTable() {
        String result = "";
        for(int col = 1; col <= 10; col++){
            for(int row = 1; row <= 10; row++){
                result += String.format("%3d |", col * row);
            }
            result += "\n";
        }
        return result;
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        for(int col = 1; col <= tableSize; col++){
            for(int row = 1; row <= tableSize; row++){
                result += String.format("%3d |", col * row);
            }
            result += "\n";
        }
        return result;
    }
}
