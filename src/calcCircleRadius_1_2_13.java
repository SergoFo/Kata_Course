class calcCircleRadius_1_2_13 {
    public static void calcCircleRadius(double area) {
        double result = Math.sqrt(area / Math.PI);
        System.out.printf("%.3f", result);
    }
}