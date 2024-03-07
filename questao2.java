public static int fibonacci(int seriesLength) {
    if (seriesLength == 1 || seriesLength == 2) {
        return 1;
    } else {
        return fibonacci(seriesLength - 1) + fibonacci(seriesLength - 2);
    }
}

public static void main(String args[]) {
    int number = 4101;
    int i = 1;
    while (i > 0) {
        int fibnumber = fibonacci(i);
        if (fibnumber != number) {
            if (fibnumber > number) {
                System.out.println("Não pertence a Sequência de Fibonacci");
                break;
            } else {
                i++;
            }
        } else {
            System.out.println("Número é Fibonacci");
            break;
        }

    }
}
