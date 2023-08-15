class Algo8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, 2, 1, -9, 6};
        
        // Union of sets
        System.out.print("Union of numA and numB {");
        for (int i = 0; i < numA.length; i++) {
            boolean foundInNumB = false;
            for (int j = 0; j < numB.length; j++) {
                if (numA[i] == numB[j]) {
                    foundInNumB = true;
                    break;
                }
            }
            if (!foundInNumB) {
                System.out.print(numA[i] + ", ");
            }
        }
        
        // Add the elements from numB that are not in numA
        for (int i = 0; i < numB.length; i++) {
            boolean foundInNumA = false;
            for (int j = 0; j < numA.length; j++) {
                if (numB[i] == numA[j]) {
                    foundInNumA = true;
                    break;
                }
            }
            if (!foundInNumA) {
                System.out.print(numB[i] + ", ");
            }
        }
        
        System.out.println("\b".repeat(2) + "}");
    }
}
