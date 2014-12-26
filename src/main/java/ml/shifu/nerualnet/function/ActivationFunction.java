package ml.shifu.nerualnet.function;

/**
 * Created by yliu15 on 2014/12/26.
 */
public interface ActivationFunction {

    void activate(double[] d, int start, int size);

    double derivate(double b, double a);

    double activate(double d);
}
