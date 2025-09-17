public class NumberProcessor {
    private int[] numbers;

    public NumberProcessor(String[] args) {
        numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
    }

    public int max() {
        int max = numbers[0];
        for (int n : numbers) {
            if (n > max)
                max = n;
        }
        return max;
    }

    public int min() {
        int min = numbers[0];
        for (int n : numbers) {
            if (n < min)
                min = n;
        }
        return min;
    }

    public int sum() {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    public double average() {
        return (double) sum() / numbers.length;
    }

    public double median() {
        return (max() + min()) / 2.0;
    }

    public void showResults() {
        System.out.println("Min = " + min());
        System.out.println("Max = " + max());
        System.out.println("Sum = " + sum());
        System.out.println("[A]<MAX+MIN>/2 = " + median());
        System.out.println("[B]Average = " + average());

        if (average() > median()) {
            System.out.println("A less than B");
        } else if (average() < median()) {
            System.out.println("B less than A");
        } else {
            System.out.println("A is equal to B");
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter numbers as arguments.");
            return;
        }

        try {
            NumberProcessor np = new NumberProcessor(args);
            np.showResults();
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter only whole numbers.");
        }
    }
}
