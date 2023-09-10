class Test_calcCircleRadius {
    public static void calcCircleRadius(double area) {
        double result = Math.sqrt(area / Math.PI);
        System.out.printf("%.3f", result);
    }
}