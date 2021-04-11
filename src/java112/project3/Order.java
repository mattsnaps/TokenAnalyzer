package java112.project3;
import java.time.*;
import java.time.LocalDateTime;

/**
 * @author mbpriebe
 */
public class Order {

    private String type;
    private String status;
    private LocalDateTime time;

    public Order() {
        type = "None";
        status = "None";
    }

	/**
	* Returns value of type
	* @return
	*/
	public String getType() {
		return type;
	}

	/**
	* Sets new value of type
	* @param
	*/
	public void setType(String type) {
		this.type = type;
	}

	/**
	* Returns value of status
	* @return
	*/
	public String getStatus() {
		return status;
	}

	/**
	* Sets new value of status
	* @param
	*/
	public void setStatus(String status) {
		this.status = status;
	}

    /**
	* Returns value of status
	* @return
	*/
	public LocalDateTime getTime() {
		return time;
	}

	/**
	* Sets new value of status
	* @param
	*/
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
}
