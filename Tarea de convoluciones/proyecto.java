public class proyecto {

    public static void main(String[] args) {
        int[] m1 = new int[] {
                -4,
                -3,
                -2,
                -1,
                 1,
                 2,
                 3,
                 4,
                 5,
                 6,
                 7,
                 8,
                 9,
                 10,
                 11,
                 12,};
        int[] m2 = new int[] {
                12,
                11,
                10,
                9,
                8,
                7,
                6,
                5,
                4,
                3,
                2,
                1,
                -1,
                -2,
                -3,
                -4,};
        int grandTotal = 0;
        for (int i = 0; (i < m1.length); i++) {
            int m1Value = m1[i];
            int vectorSum = 0;
            for (int j = 0; (j < m2.length); j++) {
                int m2Value = m2[j];
                System.out.println("Vector:("+ m1Value + ")("+ m2Value +")");
                vectorSum = (vectorSum 
                            + (m1Value * m2Value));
            }
            grandTotal = (grandTotal + vectorSum);
            System.out.println("Vector V("+(i + 1)+") Result: "+vectorSum);
        }
        System.out.println("Grand Total Result: "+grandTotal);
    }
}