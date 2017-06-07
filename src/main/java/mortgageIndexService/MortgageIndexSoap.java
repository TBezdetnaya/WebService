
package mortgageIndexService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "MortgageIndexSoap", targetNamespace = "http://www.webserviceX.NET/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MortgageIndexSoap {


    /**
     * Get Current month ARM indexes
     *
     * @return
     *     returns com.mortgageIndexService.MonthlyIndex
     */
    @WebMethod(operationName = "GetCurrentMortgageIndexMonthly", action = "http://www.webserviceX.NET/GetCurrentMortgageIndexMonthly")
    @WebResult(name = "GetCurrentMortgageIndexMonthlyResult", targetNamespace = "http://www.webserviceX.NET/")
    @RequestWrapper(localName = "GetCurrentMortgageIndexMonthly", targetNamespace = "http://www.webserviceX.NET/", className = "com.mortgageIndexService.GetCurrentMortgageIndexMonthly")
    @ResponseWrapper(localName = "GetCurrentMortgageIndexMonthlyResponse", targetNamespace = "http://www.webserviceX.NET/", className = "com.mortgageIndexService.GetCurrentMortgageIndexMonthlyResponse")
    public MonthlyIndex getCurrentMortgageIndexMonthly();

    /**
     * Get Current week ARM indexes
     *
     * @return
     *     returns com.mortgageIndexService.WeeklyIndex
     */
    @WebMethod(operationName = "GetCurrentMortgageIndexByWeekly", action = "http://www.webserviceX.NET/GetCurrentMortgageIndexByWeekly")
    @WebResult(name = "GetCurrentMortgageIndexByWeeklyResult", targetNamespace = "http://www.webserviceX.NET/")
    @RequestWrapper(localName = "GetCurrentMortgageIndexByWeekly", targetNamespace = "http://www.webserviceX.NET/", className = "com.mortgageIndexService.GetCurrentMortgageIndexByWeekly")
    @ResponseWrapper(localName = "GetCurrentMortgageIndexByWeeklyResponse", targetNamespace = "http://www.webserviceX.NET/", className = "com.mortgageIndexService.GetCurrentMortgageIndexByWeeklyResponse")
    public WeeklyIndex getCurrentMortgageIndexByWeekly();

    /**
     * Get ARM indexes by Month
     *
     * @param month
     * @param year
     * @return
     *     returns com.mortgageIndexService.MonthlyIndex
     */
    @WebMethod(operationName = "GetMortgageIndexByMonth", action = "http://www.webserviceX.NET/GetMortgageIndexByMonth")
    @WebResult(name = "GetMortgageIndexByMonthResult", targetNamespace = "http://www.webserviceX.NET/")
    @RequestWrapper(localName = "GetMortgageIndexByMonth", targetNamespace = "http://www.webserviceX.NET/", className = "com.mortgageIndexService.GetMortgageIndexByMonth")
    @ResponseWrapper(localName = "GetMortgageIndexByMonthResponse", targetNamespace = "http://www.webserviceX.NET/", className = "com.mortgageIndexService.GetMortgageIndexByMonthResponse")
    public MonthlyIndex getMortgageIndexByMonth(
            @WebParam(name = "Month", targetNamespace = "http://www.webserviceX.NET/")
                    int month,
            @WebParam(name = "Year", targetNamespace = "http://www.webserviceX.NET/")
                    int year);

    /**
     * Get ARM indexes by Week
     *
     * @param month
     * @param year
     * @param day
     * @return
     *     returns com.mortgageIndexService.WeeklyIndex
     */
    @WebMethod(operationName = "GetMortgageIndexByWeek", action = "http://www.webserviceX.NET/GetMortgageIndexByWeek")
    @WebResult(name = "GetMortgageIndexByWeekResult", targetNamespace = "http://www.webserviceX.NET/")
    @RequestWrapper(localName = "GetMortgageIndexByWeek", targetNamespace = "http://www.webserviceX.NET/", className = "com.mortgageIndexService.GetMortgageIndexByWeek")
    @ResponseWrapper(localName = "GetMortgageIndexByWeekResponse", targetNamespace = "http://www.webserviceX.NET/", className = "com.mortgageIndexService.GetMortgageIndexByWeekResponse")
    public WeeklyIndex getMortgageIndexByWeek(
            @WebParam(name = "Day", targetNamespace = "http://www.webserviceX.NET/")
                    int day,
            @WebParam(name = "Month", targetNamespace = "http://www.webserviceX.NET/")
                    int month,
            @WebParam(name = "Year", targetNamespace = "http://www.webserviceX.NET/")
                    int year);


}
