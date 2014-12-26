package ml.shifu.nerualnet.structure;

import ml.shifu.nerualnet.function.ActivationFunction;
import ml.shifu.nerualnet.function.ActivationLinear;

/**
 * Created by yliu15 on 2014/12/26.
 */
public class Neuron {

    private ActivationFunction activationFunction;

    public Neuron(){
        this.activationFunction = new ActivationLinear();
    }

    public Neuron(ActivationFunction function) {
        this.activationFunction = function;
    }

    public double output(double[] weights, double[] inputs) {
        double rt = 0.0;

        assert weights.length == inputs.length;

        for (int i = 0 ; i < weights.length; i ++){
            rt += (weights[i] * inputs[i]) ;
        }

        return activationFunction.activate(rt);
    }
}
