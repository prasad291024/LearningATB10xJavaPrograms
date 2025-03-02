package Task27thFeb;

public class Q2_StringBufferPerformance {
        public static void main(String[] args) {
            long startTime = System.nanoTime();

            StringBuffer sb = new StringBuffer("Java");
            for (int i = 0; i < 10000; i++) {
                sb.append(" Programming");
            }

            long endTime = System.nanoTime();
            System.out.println("Time taken with StringBuffer: " + (endTime - startTime) + " ns");
        }
    }

}
