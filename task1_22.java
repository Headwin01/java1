//task 1.22
class PrintSpiral {
    private final String[][] matrix;
    private final int numberOfSegments;
    private final int dimension;
    private int xCoordinate;
    private int yCoordinate;
    public PrintSpiral(int n) {
        numberOfSegments = n;
        dimension = numberOfSegments/2 + 4 + numberOfSegments % 2;
        xCoordinate = dimension / 2;
        yCoordinate = dimension / 2;
        matrix = new String[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            String[] row = new String[dimension];
            Arrays.fill(row, ".");
            matrix[i] = row;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input n: ");
        int n = input.nextInt();
//        for (int n = 2; n < 100 ; n++) {
        PrintSpiral printSpiral = new PrintSpiral(n);
        printSpiral.process();
//        }
    }
    private void process() {
        int max = 0;
        int sum = 0;
        boolean exit = false;
        do {
            ++max;
            int remainder = max % 4;
            sum += max;
            if (sum >= numberOfSegments) {
                max = numberOfSegments - sum + max;
                exit = true;
            }
            switch (remainder) {
                case 0:
                    setMatrixElements(-1, 0, max);
                    break;
                case 1:
                    setMatrixElements(0, -1, max);
                    break;
                case 2:
                    setMatrixElements(1, 0, max);
                    break;
                case 3:
                    setMatrixElements(0, 1, max);
                    break;
                default:
                    throw new IllegalArgumentException("Error occurred");
            }
        } while (!exit);
        for (int j = 0; j < dimension; j++) {
            System.out.println((Arrays.toString(matrix[j]).replace(",", "").replace("]", "")
                    .replace("[", "")));
        }
    }
    private void setMatrixElements(int deltaX, int deltaY, int max) {
        for (int i = 0; i < max; i++) {
            matrix[yCoordinate][xCoordinate] = "Y";
            xCoordinate += deltaX;
            yCoordinate += deltaY;
        }
    }
}
