package java112.employee;
/**
 * @author mbpriebe
 *
 */

public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String ssn;
    private String department;
    private String roomNumber;
    private String phoneNumber;

    /**
	* Returns value of employeeId
	* @return
	*/
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	* Sets new value of employeeId
	* @param
	*/
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	* Returns value of firstName
	* @return
	*/
	public String getFirstName() {
		return firstName;
	}

	/**
	* Sets new value of firstName
	* @param
	*/
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	* Returns value of lastName
	* @return
	*/
	public String getLastName() {
		return lastName;
	}

	/**
	* Sets new value of lastName
	* @param
	*/
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	* Returns value of ssn
	* @return
	*/
	public String getSsn() {
		return ssn;
	}

	/**
	* Sets new value of ssn
	* @param
	*/
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	* Returns value of department
	* @return
	*/
	public String getDepartment() {
		return department;
	}

	/**
	* Sets new value of department
	* @param
	*/
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	* Returns value of roomNumber
	* @return
	*/
	public String getRoomNumber() {
		return roomNumber;
	}

	/**
	* Sets new value of roomNumber
	* @param
	*/
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	/**
	* Returns value of phoneNumber
	* @return
	*/
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	* Sets new value of phoneNumber
	* @param
	*/
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

    /**
	* Create string representation of Employee for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName="
                + firstName + ", lastName=" + lastName + ", ssn=" + ssn
                + ", department=" + department + ", roomNumber=" + roomNumber
                + ", phoneNumber=" + phoneNumber + "]";
	}
}
