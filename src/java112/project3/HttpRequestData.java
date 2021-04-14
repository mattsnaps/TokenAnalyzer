package java112.project3;
import java.util.*;

/**
 *
 * @author mbpriebe
 */

public class HttpRequestData {
    private String remoteComputer;
    private String remoteComputerAddress;
    private String httpMethod;
    private String requestURI;
    private StringBuffer requestURL;
    private String requestProtocol;
    private String serverName;
    private int serverPortNumber;
    private Locale serverLocale;
    private String queryString;
    private String queryParameter;
    private String userAgent;



	/**
	* Returns value of remoteComputer
	* @return
	*/
	public String getRemoteComputer() {
		return remoteComputer;

	}

	/**
	* Sets new value of remoteComputer
	* @param
	*/
	public void setRemoteComputer(String remoteComputer) {
		this.remoteComputer = remoteComputer;
	}

	/**
	* Returns value of remoteComputerAddress
	* @return
	*/
	public String getRemoteComputerAddress() {
		return remoteComputerAddress;
	}

	/**
	* Sets new value of remoteComputerAddress
	* @param
	*/
	public void setRemoteComputerAddress(String remoteComputerAddress) {
		this.remoteComputerAddress = remoteComputerAddress;
	}

	/**
	* Returns value of httpMethod
	* @return
	*/
	public String getHttpMethod() {
		return httpMethod;
	}

	/**
	* Sets new value of httpMethod
	* @param
	*/
	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}

	/**
	* Returns value of requestURI
	* @return
	*/
	public String getRequestURI() {
		return requestURI;
	}

	/**
	* Sets new value of requestURI
	* @param
	*/
	public void setRequestURI(String requestURI) {
		this.requestURI = requestURI;
	}

	/**
	* Returns value of requestURL
	* @return
	*/
	public StringBuffer getRequestURL() {
		return requestURL;
	}

	/**
	* Sets new value of requestURL
	* @param
	*/
	public void setRequestURL(StringBuffer requestURL) {
		this.requestURL = requestURL;
	}

	/**
	* Returns value of requestProtocol
	* @return
	*/
	public String getRequestProtocol() {
		return requestProtocol;
	}

	/**
	* Sets new value of requestProtocol
	* @param
	*/
	public void setRequestProtocol(String requestProtocol) {
		this.requestProtocol = requestProtocol;
	}

	/**
	* Returns value of serverName
	* @return
	*/
	public String getServerName() {
		return serverName;
	}

	/**
	* Sets new value of serverName
	* @param
	*/
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	/**
	* Returns value of serverPortNumber
	* @return
	*/
	public int getServerPortNumber() {
		return serverPortNumber;
	}

	/**
	* Sets new value of serverPortNumber
	* @param
	*/
	public void setServerPortNumber(int serverPortNumber) {
		this.serverPortNumber = serverPortNumber;
	}

	/**
	* Returns value of serverLocale
	* @return
	*/
	public Locale getServerLocale() {
		return serverLocale;
	}

	/**
	* Sets new value of serverLocale
	* @param
	*/
	public void setServerLocale(Locale serverLocale) {
		this.serverLocale = serverLocale;
	}

	/**
	* Returns value of queryString
	* @return
	*/
	public String getQueryString() {
		return queryString;
	}

	/**
	* Sets new value of queryString
	* @param
	*/
	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	/**
	* Returns value of queryParameter
	* @return
	*/
	public String getQueryParameter() {
		return queryParameter;
	}

	/**
	* Sets new value of queryParameter
	* @param
	*/
	public void setQueryParameter(String queryParameter) {
		this.queryParameter = queryParameter;
	}

	/**
	* Returns value of userAgent
	* @return
	*/
	public String getUserAgent() {
		return userAgent;
	}

	/**
	* Sets new value of userAgent
	* @param
	*/
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
}
