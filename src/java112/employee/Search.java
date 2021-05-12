package java112.employee;
import java.util.*;
/**
 * Represents a search for employee info.
 * @author mbpriebe
 *
 */

public class Search {
    private String searchType;
    private String searchTerm;
    private ArrayList<Employee> results;
    private Boolean response;

    /**
     * Constructor Class
     *
     */
    public Search() {
        results = new ArrayList<Employee>();
    }

    /**
	* Returns value of searchType
	* @return searchType
	*/
	public String getSearchType() {
		return searchType;
	}

	/**
	* Sets new value of searchType
	* @param searchType type of search
	*/
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	/**
	* Returns value of searchTerm
	* @return searchTerm
	*/
	public String getSearchTerm() {
		return searchTerm;
	}

	/**
	* Sets new value of searchTerm
	* @param searchTerm term search for
	*/
	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}

	/**
	* Returns value of results
	* @return results
	*/
	public ArrayList<Employee> getResults() {
		return results;
	}

	/**
	* Sets new value of results
	* @param results results in resultSet
	*/
	public void setResults(ArrayList<Employee> results) {
		this.results = results;
	}

	/**
	* Returns value of response
	* @return response
	*/
	public Boolean isResponse() {
		return response;
	}

	/**
	* Sets new value of response
	* @param response are there any results tru/false
	*/
	public void setResponse(Boolean response) {
		this.response = response;
	}

    /**
     * Add employee to an Arraylist.
     * @param employee employee info
     */
    public void addFoundEmployee(Employee employee) {
        results.add(employee);
    }

}
