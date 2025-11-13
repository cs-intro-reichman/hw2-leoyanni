public class CalcPi {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);   

        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            double term = 1.0 / (2 * i + 1); 
            if (i % 2 == 1) term = -term;    
            sum += term;
        }
        double approxPi = 4.0 * sum;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + approxPi);
    }
}
