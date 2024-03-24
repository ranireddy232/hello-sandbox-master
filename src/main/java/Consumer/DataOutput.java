package Consumer;

import java.util.Date;

public class DataOutput {
    private Date date;
    private String outputMessage;

    public DataOutput(String message, Date date) {
        this.outputMessage = message;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOutputMessage() {
        return outputMessage;
    }

    public void setOutputMessage(String outputMessage) {
        this.outputMessage = outputMessage;
    }
}
