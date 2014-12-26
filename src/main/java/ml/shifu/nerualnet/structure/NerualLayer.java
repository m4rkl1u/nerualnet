package ml.shifu.nerualnet.structure;

import ml.shifu.nerualnet.function.ActivationFunction;
import ml.shifu.nerualnet.function.ActivationLinear;

/**
 * Created by yliu15 on 2014/12/26.
 */
public class NerualLayer {

    private Neuron[] nodes;

    public NerualLayer(int numberOfNodes){

        createNodes(new ActivationLinear(), numberOfNodes);
    }

    public void createNodes(ActivationFunction function, int numberOfNodes) {
        this.nodes = new Neuron[numberOfNodes];

        for(int i = 0 ; i < numberOfNodes; i ++) {
            nodes[i] = new Neuron(function);
        }
    }
}
