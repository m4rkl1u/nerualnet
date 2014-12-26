package ml.shifu.nerualnet.optimizer;

import ml.shifu.nerualnet.structure.NerualNet;

/**
 * Created by yliu15 on 2014/12/26.
 */
public interface Opimizer {

    public void createOpimizer(NerualNet net);

    public void train(long numberOfStep);
}
