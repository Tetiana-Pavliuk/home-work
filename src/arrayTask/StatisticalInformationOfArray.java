package arrayTask;

class StatisticalInformationOfArray {
    public static void main(String[] args) {
        int[] data = {206, 430, 73, 30, 293, 322, 42, 36, 447, 229};
        double sum = 0;
        double arithmeticMean;
        double countOfRepetition = 0;
        double median;
        double mode = 0;
        double dispersion;
        double standardDeviation;

        //Array sorting
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        //Sum calculating for arithmeticMean
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }

        //Mode calculating
        for (int i = 0; i < data.length; i++) {
            int result = data[i];
            int c = 0;
            for (int j = 0; j <= data.length - 1; j++) {
                if (result == data[j]) {
                    c++;
                }
            }
            if (c > countOfRepetition) {
                countOfRepetition = c;
                mode = data[i];
            }
        }

        arithmeticMean = sum / data.length;
        double sumOfDeviationSquares = 0;
        for (int i = 0; i < data.length; i++) {
            double deviationSquares = (data[i] - arithmeticMean) * (data[i] - arithmeticMean);
            sumOfDeviationSquares += deviationSquares;
        }
        dispersion = sumOfDeviationSquares / data.length;
        standardDeviation = Math.sqrt(dispersion);
        median = (data[data.length / 2] + data[(data.length / 2 - 1)]) / 2;

        //Displaying the results
        System.out.println("Arithmetic Mean = " + arithmeticMean);
        System.out.println("Median = " + median);
        System.out.println("Mode = " + mode);
        System.out.println("Standard Deviation = " + standardDeviation);
        System.out.print("Sorted array: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
