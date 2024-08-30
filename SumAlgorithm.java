/**
 * SumAlgorithm
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class SumAlgorithm {

    public static class Record{
        private final String name;
        private final int quantity;

        public Record(String name, int quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    /**
     * @return
     */
    public static List<Record> getAll() {
        return Arrays.asList(
            new Record("RADIO", 3),
            new Record("TV", 3),
            new Record("RADIA", 2),
            new Record("DVD", 4),
        );
    }

    public static void printData(String message, List<Record> data) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        
    }
}