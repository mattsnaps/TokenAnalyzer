package java112.employee;
/**
 *Represents and Employee.
 *  @author mbpriebe
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
	* @return employeeId
	*/
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	* Sets new value of employeeId
	* @param employeeId Id of employee
	*/
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	* Returns value of firstName
	* @return firstName
	*/
	public String getFirstName() {
		return firstName;
	}

	/**
	* Sets new value of firstName
	* @param firstName first Name
	*/
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	* Returns value of lastName
	* @return lastName last Name
	*/
	public String getLastName() {
		return lastName;
	}

	/**
	* Sets new value of lastName
	* @param lastName last Name
	*/
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	* Returns value of ssn
	* @return ssn
	*/
	public String getSsn() {
		return ssn;
	}

	/**
	* Sets new value of ssn
	* @param ssn Social Security number
	*/
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	* Returns value of department
	* @return department
	*/
	public String getDepartment() {
		return department;
	}

	/**
	* Sets new value of department
	* @param department department name
	*/
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	* Returns value of roomNumber
	* @return roomNumber
	*/
	public String getRoomNumber() {
		return roomNumber;
	}

	/**
	* Sets new value of roomNumber
	* @param roomNumber room number
	*/
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	/**
	* Returns value of phoneNumber
	* @return phoneNumber
	*/
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	* Sets new value of phoneNumber
	* @param phoneNumber phone number
	*/
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

    /**
	* Create string representation of Employee for printing
	* @return String of Employee.
	*/
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName="
                + firstName + ", lastName=" + lastName + ", ssn=" + ssn
                + ", department=" + department + ", roomNumber=" + roomNumber
                + ", phoneNumber=" + phoneNumber + "]";
	}
}
