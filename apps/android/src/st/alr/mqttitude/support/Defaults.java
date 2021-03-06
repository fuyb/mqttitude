
package st.alr.mqttitude.support;

import st.alr.mqttitude.R;
import android.content.Context;

public class Defaults {
    public static final String BUGSNAG_API_KEY = "f3302f4853372edcdd12dfcc102a3578";
    public static final String VALUE_REPO_URL = "http://github.com/binarybucks/mqttitude";
    public static final String VALUE_ISSUES_MAIL = "issues@mqttitude.org";
    public static final String VALUE_TWITTER_URL = "http://twitter.com/mqttitude";
    public static final String BITCOIN_ADDRESS = "1DYpxrXRLQe5eLnT2FncyxjuQGBgWjtX2t";
    
    public static final String INTENT_ACTION_PUBLISH_LASTKNOWN = "st.alr.mqttitude.intent.PUB_LASTKNOWN";
    public static final String INTENT_ACTION_PUBLICH_PING = "st.alr.mqttitude.intent.PUB_PING";
    public static final String INTENT_ACTION_LOCATION_CHANGED = "st.alr.mqttitude.intent.LOCATION_CHANGED";
    public static final String INTENT_ACTION_FENCE_TRANSITION = "st.alr.mqttitude.intent.FENCE_TRANSITION";

    public static final int NOTIFCATION_ID = 1338;

    // TODO: Move to Preferences
    public static final String VALUE_TOPIC_PUB_BASE = "mqttitude/%s/%s";
    public static final String VALUE_TOPIC_WAYPOINTS_PART = "/waypoints";
    public static final String VALUE_TOPIC_SUB = "mqttitude/+/+";
    public static final String VALUE_BROKER_HOST = "192.168.8.2";
    public static final String VALUE_BROKER_PORT = "8883";
    public static final String VALUE_BACKGROUND_UPDATES_INTERVAL = "15";
    public static final String VALUE_QOS = "0";

    public static final int VALUE_BROKER_SECURITY_NONE = 0;
    public static final int VALUE_BROKER_SECURITY_SSL = 1;
    public static final int VALUE_BROKER_SECURITY_SSL_CUSTOMCACRT = 2;
    public static final int VALUE_BROKER_AUTH_ANONYMOUS = 0;
    public static final int VALUE_BROKER_AUTH_USERNAME = 1;

    public static final boolean VALUE_BACKGROUND_UPDATES = false;
    public static final boolean VALUE_NOTIFICATION_ENABLED = true;
    public static final boolean VALUE_RETAIN = true;
    public static final boolean VALUE_TICKER_ON_PUBLISH = true;



    public static class TransitionType {
        public static String toString(int type, Context c) {
            int id;
            switch (type) {
                case 0:
                    id = R.string.transitionEnter;
                    break;
                case 1:
                    id = R.string.transitionLeave;
                    break;
                case 2:
                    id = R.string.transitionBoth;
                    break;
                default:
                    id = R.string.transitionEnter;
            }
            return c.getString(id);
        }
    }

    public static class State {
        public static enum ServiceBroker {
            INITIAL, CONNECTING, CONNECTED, DISCONNECTING, DISCONNECTED, DISCONNECTED_USERDISCONNECT, DISCONNECTED_DATADISABLED, DISCONNECTED_ERROR
        }

        public static String toString(ServiceBroker state, Context c) {
            int id;
            switch (state) {
                case CONNECTED:
                    id = R.string.connectivityConnected;
                    break;
                case CONNECTING:
                    id = R.string.connectivityConnecting;
                    break;
                case DISCONNECTING:
                    id = R.string.connectivityDisconnecting;
                    break;
                case DISCONNECTED_USERDISCONNECT:
                    id = R.string.connectivityDisconnectedUserDisconnect;
                    break;
                case DISCONNECTED_DATADISABLED:
                    id = R.string.connectivityDisconnectedDataDisabled;
                    break;
                case DISCONNECTED_ERROR:
                    id = R.string.error;
                    break;
                default:
                    id = R.string.connectivityDisconnected;

            }
            return c.getString(id);
        }

        public static enum ServiceLocator {
            INITIAL, PUBLISHING, PUBLISHING_WAITING, PUBLISHING_TIMEOUT, NOTOPIC, NOLOCATION
        }

        public static String toString(st.alr.mqttitude.support.Defaults.State.ServiceLocator state, Context c) {
            int id;
            switch (state) {
                case PUBLISHING:
                    id = R.string.statePublishing;
                    break;
                case PUBLISHING_WAITING:
                    id = R.string.stateWaiting;
                    break;
                case PUBLISHING_TIMEOUT:
                    id = R.string.statePublishTimeout;
                    break;
                case NOTOPIC:
                    id = R.string.stateNotopic;
                    break;
                case NOLOCATION:
                    id = R.string.stateLocatingFail;
                    break;
                default:
                    id = R.string.stateIdle;
            }

            return c.getString(id);
        };

    }

}
