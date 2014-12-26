package ml.shifu.nerualnet.function;

/**
 * Created by yliu15 on 2014/12/26.
 */
public class ActivationLinear implements ActivationFunction {


    @Override
    public void activate(double[] d, int start, int size) {

    }

    @Override
    public double derivate(double b, double a) {
        return 1;
    }

    @Override
    public double activate(double d) {
        return d;
    }
}
