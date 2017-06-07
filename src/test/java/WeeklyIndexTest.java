import com.sun.xml.internal.ws.fault.ServerSOAPFaultException;
import mortgageIndexService.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.JaxWsHandlerResolver;



import static org.testng.Assert.assertEquals;

/**
 * Created by tanya on 31.05.2017.
 */
public class WeeklyIndexTest {
    private MortgageIndexSoap mortgageIndexSoap;

    private String expectedSixMonthTreasuryBill= "4.89";
    private String expectedOneYearConstantMaturityTreasury ="5.62";
    private String expectedThreeYearConstantMaturityTreasury = "6.55";
    private String expectedFiveYearConstantMaturityTreasury = "6.95";
    private String expectedIndexDate = "9/9/1994";
    private String expectedThreeMonthSecondaryMarketCD = "5.23";
    private String expectedThreeMonthTreasuryBill = "4.58";
    private int day;
    private int month;
    private int year;

    @BeforeClass
    public void setUp() {

        MortgageIndex mortgageIndex = new MortgageIndex();
        mortgageIndex.setHandlerResolver(new JaxWsHandlerResolver());
        mortgageIndexSoap = mortgageIndex.getMortgageIndexSoap();
    }


    @Test
    public void indexDateTest(){
        WeeklyIndex currentMortgageIndexByWeekly = mortgageIndexSoap.getCurrentMortgageIndexByWeekly();
        String actual = currentMortgageIndexByWeekly.getIndexDate();
        assertEquals(actual, expectedIndexDate);

    }

    @Test
    public void sixMonthTreasuryBillTest(){
        WeeklyIndex weeklyIndex = mortgageIndexSoap.getCurrentMortgageIndexByWeekly();
        String actual = weeklyIndex.getSixMonthTreasuryBill();
        assertEquals(actual, expectedSixMonthTreasuryBill);

    }
    @Test
    public void oneYearConstantMaturityTreasuryTest(){
        WeeklyIndex weeklyIndex = mortgageIndexSoap.getCurrentMortgageIndexByWeekly();
        String actualData = weeklyIndex.getOneYearConstantMaturityTreasury();
        assertEquals(actualData, expectedOneYearConstantMaturityTreasury);
    }
    @Test
    public void threeYearConstantMaturityTreasury(){
        WeeklyIndex weeklyIndex = mortgageIndexSoap.getCurrentMortgageIndexByWeekly();
        String actualData = weeklyIndex.getThreeYearConstantMaturityTreasury();
        assertEquals(actualData, expectedThreeYearConstantMaturityTreasury);
    }
    @Test
    public void fiveYearConstantMaturityTreasuryTest(){
        WeeklyIndex weeklyIndex = mortgageIndexSoap.getCurrentMortgageIndexByWeekly();
        String actualData = weeklyIndex.getFiveYearConstantMaturityTreasury();
        assertEquals(actualData, expectedFiveYearConstantMaturityTreasury);
    }

    @Test
    public  void threeMonthSecondaryMarketCDTest(){
        WeeklyIndex weeklyIndex = mortgageIndexSoap.getCurrentMortgageIndexByWeekly();
        String actualData = weeklyIndex.getThreeMonthSecondaryMarketCD();
        assertEquals(actualData, expectedThreeMonthSecondaryMarketCD);

    }
    @Test
    public void threeMonthTreasuryBillTest(){
        WeeklyIndex weeklyIndex = mortgageIndexSoap.getCurrentMortgageIndexByWeekly();
        String actualData = weeklyIndex.getThreeMonthTreasuryBill();
        assertEquals(actualData, expectedThreeMonthTreasuryBill);
    }
    @Test
    public void negativeTest(){
        try{
            mortgageIndexSoap.getMortgageIndexByWeek(0, 0,0);
        }catch (ServerSOAPFaultException exception){
            Assert.assertTrue(exception.getMessage().contains("The conversion of a varchar data type to a datetime data type resulted in an out-of-range value"));
            Assert.assertTrue(exception.getMessage().contains("Server was unable to process request."));
        }
    }
    @Test
    public void negativeTest1(){
        try{
            mortgageIndexSoap.getMortgageIndexByWeek(day, month, year);
        }catch (ServerSOAPFaultException exception){
            Assert.assertTrue(exception.getMessage().contains("The conversion of a varchar data type to a datetime data type resulted in an out-of-range value"));
            Assert.assertTrue(exception.getMessage().contains("Server was unable to process request."));
        }
    }



}
