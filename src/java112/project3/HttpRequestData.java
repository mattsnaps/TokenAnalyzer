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
	* @return remote computer name
	*/
	public String getRemoteComputer() {
		return remoteComputer;

	}

	/**
	* Sets new value of remoteComputer
	* @param remoteComputer comuter name
	*/
	public void setRemoteComputer(String remoteComputer) {
		this.remoteComputer = remoteComputer;
	}

	/**
	* Returns value of remoteComputerAddress
	* @return remote computer address
	*/
	public String getRemoteComputerAddress() {
		return remoteComputerAddress;
	}

	/**
	* Sets new value of remoteComputerAddress
	* @param remoteComputerAddress computer address
	*/
	public void setRemoteComputerAddress(String remoteComputerAddress) {
		this.remoteComputerAddress = remoteComputerAddress;
	}

	/**
	* Returns value of httpMethod
	* @return http method
	*/
	public String getHttpMethod() {
		return httpMethod;
	}

	/**
	* Sets new value of httpMethod
	* @param httpMethod http method
	*/
	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}

	/**
	* Returns value of requestURI
	* @return requestURI
	*/
	public String getRequestURI() {
		return requestURI;
	}

	/**
	* Sets new value of requestURI
	* @param requestURI URI
	*/
	public void setRequestURI(String requestURI) {
		this.requestURI = requestURI;
	}

	/**
	* Returns value of requestURL
	* @return Request URL
	*/
	public StringBuffer getRequestURL() {
		return requestURL;
	}

	/**
	* Sets new value of requestURL
	* @param requestURL URL
	*/
	public void setRequestURL(StringBuffer requestURL) {
		this.requestURL = requestURL;
	}

	/**
	* Returns value of requestProtocol
	* @return request protocol
	*/
	public String getRequestProtocol() {
		return requestProtocol;
	}

	/**
	* Sets new value of requestProtocol
	* @param requestProtocol reques tProtocol
	*/
	public void setRequestProtocol(String requestProtocol) {
		this.requestProtocol = requestProtocol;
	}

	/**
	* Returns value of serverName
	* @return Server Name
	*/
	public String getServerName() {
		return serverName;
	}

	/**
	* Sets new value of serverName
	* @param serverName server name
	*/
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	/**
	* Returns value of serverPortNumber
	* @return server port number
	*/
	public int getServerPortNumber() {
		return serverPortNumber;
	}

	/**
	* Sets new value of serverPortNumber
	* @param serverPortNumber port number
	*/
	public void setServerPortNumber(int serverPortNumber) {
		this.serverPortNumber = serverPortNumber;
	}

	/**
	* Returns value of serverLocale
	* @return server locale
	*/
	public Locale getServerLocale() {
		return serverLocale;
	}

	/**
	* Sets new value of serverLocale
	* @param serverLocale locale
	*/
	public void setServerLocale(Locale serverLocale) {
		this.serverLocale = serverLocale;
	}

	/**
	* Returns value of queryString
	* @return queryString
	*/
	public String getQueryString() {
		return queryString;
	}

	/**
	* Sets new value of queryString
	* @param queryString String
	*/
	public void setQueryString(String queryString) {
		this.queryString = queryString;
	}

	/**
	* Returns value of queryParameter
	* @return query parameter
	*/
	public String getQueryParameter() {
		return queryParameter;
	}

	/**
	* Sets new value of queryParameter
	* @param queryParameter parameter
	*/
	public void setQueryParameter(String queryParameter) {
		this.queryParameter = queryParameter;
	}

	/**
	* Returns value of userAgent
	* @return userAgent
	*/
	public String getUserAgent() {
		return userAgent;
	}

	/**
	* Sets new value of userAgent
	* @param userAgent user Agent
	*/
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
}
