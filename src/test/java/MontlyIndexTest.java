import com.sun.xml.internal.ws.fault.ServerSOAPFaultException;
import mortgageIndexService.MonthlyIndex;
import mortgageIndexService.MortgageIndex;
import mortgageIndexService.MortgageIndexSoap;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.JaxWsHandlerResolver;
import static org.testng.Assert.assertEquals;

/**
 * Created by tanya on 04.06.2017.
 */
public class MontlyIndexTest {
    private MortgageIndexSoap mortgageIndexSoap;
    private String expectedIndexDate = "7/1/2004";
    private String expectedOneYearConstantMaturityTreasury = "2.1";
    private String expectedThreeYearConstantMaturityTreasury = "3.05";
    private String expectedFiveYearConstantMaturityTreasury = "3.69";
    private String expectedThreeMonthTreasuryBill = "1.36";
    private String expectedSixMonthTreasuryBill = "1.69";
    private String expectedThreeMonthSecondaryMarketCD = "1.4625";
    private String expectedSixMonthSecondaryMarketCD = "-";
    private String expectedEleventhDistrictCOFI = "1.4929";
    private String expectedCostOfSavingsIndex = "1.6945";
    private String expectedOneMonthLIBOR = "1.9857";
    private String expectedThreeMonthLIBOR = "2.4632";
    private String expectedSixMonthLIBOR = "1.1617";
    private String expectedOneYearLIBOR = "1.91";
    private String expectedCostOfDepositsIndex = "1.57";
    private String expectedTwelveMonthTreasuryAverage = "1.85";
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
        MonthlyIndex monthlyIndex = mortgageIndexSoap.getCurrentMortgageIndexMonthly();
        String actualData = monthlyIndex.getIndexDate();
        assertEquals(actualData, expectedIndexDate);

    }
    @Test
    public void oneYearConstantMaturityTreasuryTest(){
        MonthlyIndex  monthlyIndex = mortgageIndexSoap.getCurrentMortgageIndexMonthly();
        String actualData = monthlyIndex.getOneYearConstantMaturityTreasury();
        assertEquals(actualData, expectedOneYearConstantMaturityTreasury);
    }
    @Test
    public void threeYearConstantMaturityTreasuryTest(){
        MonthlyIndex  monthlyIndex = mortgageIndexSoap.getCurrentMortgageIndexMonthly();
        String actualData = monthlyIndex.getThreeYearConstantMaturityTreasury();
        assertEquals(actualData, expectedThreeYearConstantMaturityTreasury);
    }
    @Test
    public void fiveYearConstantMaturityTreasuryTest(){
        MonthlyIndex  monthlyIndex = mortgageIndexSoap.getCurrentMortgageIndexMonthly();
        String actualData = monthlyIndex.getFiveYearConstantMaturityTreasury();
        assertEquals(actualData, expectedFiveYearConstantMaturityTreasury);
    }
    @Test
    public void threeMonthTreasuryBillTest(){
        MonthlyIndex  monthlyIndex = mortgageIndexSoap.getCurrentMortgageIndexMonthly();
        String actualData = monthlyIndex.getThreeMonthTreasuryBill();
        assertEquals(actualData, expectedThreeMonthTreasuryBill);

    }
    @Test
    public void sixMonthTreasuryBillTest(){
        MonthlyIndex  monthlyIndex = mortgageIndexSoap.getCurrentMortgageIndexMonthly();
        String actualData = monthlyIndex.getSixMonthTreasuryBill();
        assertEquals(actualData, expectedSixMonthTreasuryBill);

    }
    @Test
    public void threeMonthSecondaryMarketCDTest(){
        MonthlyIndex  monthlyIndex = mortgageIndexSoap.getCurrentMortgageIndexMonthly();
        String actualData = monthlyIndex.getThreeMonthSecondaryMarketCD();
        assertEquals(actualData, expectedThreeMonthSecondaryMarketCD);

    }
    @Test
    public void sixMonthSecondaryMarketCDTest(){
        MonthlyIndex  monthlyIndex = mortgageIndexSoap.getCurrentMortgageIndexMonthly();
        String actualData = monthlyIndex.getSixMonthSecondaryMarketCD();
        assertEquals(actualData, expectedSixMonthSecondaryMarketCD);

    }
    @Test
    public void eleventhDistrictCOFITest(){
        MonthlyIndex  monthlyIndex = mortgageIndexSoap.getCurrentMortgageIndexMonthly();
        String actualData = monthlyIndex.getEleventhDistrictCOFI();
        assertEquals(actualData, expectedEleventhDistrictCOFI);

    }
    @Test
    public void costOfSavingsIndexTest(){
        MonthlyIndex  monthlyIndex = mortgageIndexSoap.getCurrentMortgageIndexMonthly();
        String actualData = monthlyIndex.getCostOfSavingsIndex();
        assertEquals(actualData, expectedCostOfSavingsIndex);
    }
    @Test
    public void oneMonthLIBORTest(){
        MonthlyIndex  monthlyIndex = mortgageIndexSoap.getCurrentMortgageIndexMonthly();
        String actualData = monthlyIndex.getOneMonthLIBOR();
        assertEquals(actualData, expectedOneMonthLIBOR);
    }
    @Test
    public void threeMonthLIBORTest(){
        MonthlyIndex  monthlyIndex = mortgageIndexSoap.getCurrentMortgageIndexMonthly();
        String actualData = monthlyIndex.getThreeMonthLIBOR();
        assertEquals(actualData, expectedThreeMonthLIBOR);
    }
    @Test
    public void sixMonthLIBORTest(){
        MonthlyIndex  monthlyIndex = mortgageIndexSoap.getCurrentMortgageIndexMonthly();
        String actualData = monthlyIndex.getSixMonthLIBOR();
        assertEquals(actualData, expectedSixMonthLIBOR);
    }
    @Test
    public void oneYearLIBORTest(){
        MonthlyIndex  monthlyIndex = mortgageIndexSoap.getCurrentMortgageIndexMonthly();
        String actualData = monthlyIndex.getOneYearLIBOR();
        assertEquals(actualData, expectedOneYearLIBOR);
    }
    @Test
    public void costOfDepositsIndexTest(){
        MonthlyIndex  monthlyIndex = mortgageIndexSoap.getCurrentMortgageIndexMonthly();
        String actualData = monthlyIndex.getCostOfDepositsIndex();
        assertEquals(actualData, expectedCostOfDepositsIndex);
    }
    @Test
    public void twelveMonthTreasuryAverageTest(){
        MonthlyIndex  monthlyIndex = mortgageIndexSoap.getCurrentMortgageIndexMonthly();
        String actualData = monthlyIndex.getTwelveMonthTreasuryAverage();
        assertEquals(actualData, expectedTwelveMonthTreasuryAverage);
    }
    @Test
    public void negativeTest(){
        try{
            mortgageIndexSoap.getMortgageIndexByMonth(0,0);
        }catch (ServerSOAPFaultException exception){
            Assert.assertTrue(exception.getMessage().contains("The conversion of a varchar data type to a datetime data type resulted in an out-of-range value"));
            Assert.assertTrue(exception.getMessage().contains("Server was unable to process request."));
        }
    }
    @Test
    public void negativeTest1(){

        try{
            mortgageIndexSoap.getMortgageIndexByMonth(month, year);
        }catch (ServerSOAPFaultException exception){
            Assert.assertTrue(exception.getMessage().contains("The conversion of a varchar data type to a datetime data type resulted in an out-of-range value"));
            Assert.assertTrue(exception.getMessage().contains("Server was unable to process request."));
        }
    }

}
