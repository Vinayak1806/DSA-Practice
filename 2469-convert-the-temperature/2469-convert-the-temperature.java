
class Solution {
    public double[] convertTemperature(double celsius) {
        double[] res = new double[2];

        double kelvin = celsius + 273.15;
        double fen = celsius * 1.80 + 32.00;

        res[0] = kelvin;
        res[1] = fen;

        return res;
    }
}
