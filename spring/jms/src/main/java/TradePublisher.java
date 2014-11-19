import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

public class TradePublisher {
    private JmsTemplate jmsTemplate = null;
    private String destinationName = null;

    public void publish(final String trade){
        getJmsTemplate().send(destinationName,new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage m = session.createTextMessage();
                m.setText("Trade stuff :" + trade);
                return m;
            }
        });
    }

    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }
}
