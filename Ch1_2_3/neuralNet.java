package org.neuroph.samples.mnist.learn;

import java.io.IOException;

import org.neuroph.eval.Evaluation;
import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.learning.error.MeanSquaredError;
import org.neuroph.nnet.ConvolutionalNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.events.LearningEvent;
import org.neuroph.core.events.LearningEventListener;
import org.neuroph.nnet.comp.Dimension2D;
import org.neuroph.nnet.learning.BackPropagation;
import org.neuroph.nnet.learning.ConvolutionalBackpropagation;
import org.neuroph.samples.convolution.mnist.MNISTDataSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utility class which can be used from command prompt to train ConvolutionalNetwork
 */
public class neuralNet {

    private static Logger LOG = LoggerFactory.getLogger(CnnMNIST.class);


    /**
     * @param args Command line parameters used to initialize parameters of convolutional network
     *             [0] - maximal number of epochs during learning
     *             [1] - learning error stop condition
     *             [2] - learning rate used during learning process
     *             [3] - number of feature maps in 1st convolutional layer
     *             [4] - number of feature maps in 2nd convolutional layer
     *             [5] - number of feature maps in 3rd convolutional layer
     */
    public static void main(String[] args) {
        try {
            int maxIter = 10000; // Integer.parseInt(args[0]);
            double maxError = 0.01; //Double.parseDouble(args[1]);
            double learningRate = 0.2; //  Double.parseDouble(args[2]);

            int layer1 = Integer.parseInt(args[3]);
            int layer2 = Integer.parseInt(args[4]);
            int layer3 = Integer.parseInt(args[5]);

            LOG.info("{}-{}-{}", layer1, layer2, layer3);

            String putanja = "C:\\Users\\jecak_000\\Documents\\Neuroph\\neuroph_novaVerzija\\neurophNoviPull\\neuroph-2.9\\Samples\\";
            String labelName = putanja.concat(MNISTDataSet.TRAIN_LABEL_NAME);
            String trainImage = putanja.concat(MNISTDataSet.TRAIN_IMAGE_NAME);
            String testLabel =  putanja.concat(MNISTDataSet.TEST_LABEL_NAME);
            String testImage  = putanja.concat(MNISTDataSet.TEST_IMAGE_NAME);
            DataSet trainSet = MNISTDataSet.createFromFile(labelName,trainImage, 100);
            DataSet testSet = MNISTDataSet.createFromFile(testLabel,testImage, 100);

            Dimension2D inputDimension = new Dimension2D(32, 32);
            Dimension2D convolutionKernel = new Dimension2D(5, 5);
            Dimension2D poolingKernel = new Dimension2D(2, 2);

            ConvolutionalNetwork convolutionNetwork = new ConvolutionalNetwork.Builder()
                    .withInputLayer(32, 32, 1)
                    .withConvolutionLayer(5, 5, layer1)
                    .withPoolingLayer(2, 2)
                    .withConvolutionLayer(5, 5, layer2)
                    .withPoolingLayer(2, 2)
                    .withConvolutionLayer(5, 5, layer3)
                    .withFullConnectedLayer(10)
                    .build();

            ConvolutionalBackpropagation backPropagation = new ConvolutionalBackpropagation();
            backPropagation.setLearningRate(learningRate);
            backPropagation.setMaxError(maxError);
            backPropagation.setMaxIterations(maxIter);
            backPropagation.addListener(new LearningListener(convolutionNetwork, testSet));
            backPropagation.setErrorFunction(new MeanSquaredError());

            convolutionNetwork.setLearningRule(backPropagation);
            convolutionNetwork.learn(trainSet);

            Evaluation.runFullEvaluation(convolutionNetwork, testSet);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static class LearningListener implements LearningEventListener {

        private final NeuralNetwork neuralNetwork;
        private DataSet testSet;

        public LearningListener(NeuralNetwork neuralNetwork, DataSet testSet) {
            this.testSet = testSet;
            this.neuralNetwork = neuralNetwork;
        }


        long start = System.currentTimeMillis();

        public void handleLearningEvent(LearningEvent event) {
            BackPropagation bp = (BackPropagation) event.getSource();
            LOG.info("Epoch no#: [{}]. Error [{}]", bp.getCurrentIteration(), bp.getTotalNetworkError());
            LOG.info("Epoch execution time: {} sec", (System.currentTimeMillis() - start) / 1000.0);
            // neuralNetwork.save(bp.getCurrentIteration() + "_MNIST_CNN-MIC.nnet");

            start = System.currentTimeMillis();
            //  if (bp.getCurrentIteration() % 5 == 0)
            //      Evaluation.runFullEvaluation(neuralNetwork, testSet);
        }

    }


}