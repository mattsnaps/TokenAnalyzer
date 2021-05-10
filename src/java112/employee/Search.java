package java112.employee;
import java.util.*;
/**
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
	* @return
	*/
	public String getSearchType() {
		return searchType;
	}

	/**
	* Sets new value of searchType
	* @param
	*/
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	/**
	* Returns value of searchTerm
	* @return
	*/
	public String getSearchTerm() {
		return searchTerm;
	}

	/**
	* Sets new value of searchTerm
	* @param
	*/
	public void setSearchTerm(String searchTerm) {
		this.searchTerm = searchTerm;
	}

	/**
	* Returns value of results
	* @return
	*/
	public ArrayList<Employee> getResults() {
		return results;
	}

	/**
	* Sets new value of results
	* @param
	*/
	public void setResults(ArrayList<Employee> results) {
		this.results = results;
	}

	/**
	* Returns value of response
	* @return
	*/
	public Boolean getResponse() {
		return response;
	}

	/**
	* Sets new value of response
	* @param
	*/
	public void setResponse(Boolean response) {
		this.response = response;
	}

    /**
     * [addFoundEmployee description]
     * @param employee [description]
     */
    public void addFoundEmployee(Employee employee) {
        results.add(employee);
    }

}
