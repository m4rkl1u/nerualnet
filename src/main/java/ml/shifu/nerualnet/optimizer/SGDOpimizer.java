package ml.shifu.nerualnet.optimizer;

import ml.shifu.nerualnet.structure.NerualNet;

/**
 * Created by yliu15 on 2014/12/26.
 */
public class SGDOpimizer implements Opimizer{

    private NerualNet net;

    @Override
    public void createOpimizer(NerualNet net) {
        this.net = net;
    }

    @Override
    public void train(long numberOfStep) {

    }
}
