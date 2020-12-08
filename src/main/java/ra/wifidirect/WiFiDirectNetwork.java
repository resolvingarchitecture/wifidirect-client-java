package ra.wifidirect;


import ra.common.Envelope;
import ra.common.messaging.MessageProducer;
import ra.common.network.Network;
import ra.common.network.NetworkService;
import ra.common.service.ServiceStatusObserver;

import java.util.Properties;
import java.util.logging.Logger;


public final class WiFiDirectNetwork extends NetworkService {

    public static Logger LOG = Logger.getLogger(WiFiDirectNetwork.class.getName());

    private Thread taskRunnerThread;

    public WiFiDirectNetwork() {
        super(Network.WiFi);
//        taskRunner = new TaskRunner(1, 1);
    }

    public WiFiDirectNetwork(MessageProducer messageProducer, ServiceStatusObserver observer) {
        super(Network.WiFi, messageProducer, observer);
//        taskRunner = new TaskRunner(1, 1);
    }

    /**
     * Sends UTF-8 content to a Radio Peer using Software Defined Radio (SDR).
     * @param envelope Envelope containing data.
     *                 To DID must contain base64 encoded Radio destination key.
     * @return boolean was successful
     */
    @Override
    public Boolean sendOut(Envelope envelope) {
        LOG.info("Sending Radio Message...");

        return true;
    }

    @Override
    public boolean start(Properties properties) {

//        taskRunnerThread = new Thread(taskRunner);
//        taskRunnerThread.setDaemon(true);
//        taskRunnerThread.setName("WiFiDirectSensor-TaskRunnerThread");
//        taskRunnerThread.start();
        return true;
    }

    @Override
    public boolean pause() {
        return false;
    }

    @Override
    public boolean unpause() {
        return false;
    }

    @Override
    public boolean restart() {
        return false;
    }
}
