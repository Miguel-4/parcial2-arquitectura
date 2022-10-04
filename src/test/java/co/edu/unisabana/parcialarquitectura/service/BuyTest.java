package co.edu.unisabana.parcialarquitectura.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import javax.xml.crypto.Data;

@ExtendWith(MockitoExtension.class)
class BuyTest {

  //MOCKSS
  @InjectMocks
  private Buy service;

  @Mock
  private DatabasePort databasePort;

  @Test
  public void Given_Buy_MakePurchase_When_BuyerCode_Different_from_1_Then_Return_Not_Possible_Sale() {
    //service.makePurchase(2, 3, "Books");
    assertEquals("The sale was not possible", service.makePurchase(2, 3, "Books"));
  }

  @Test
  public void Given_Buy_MakePurchase_When_BuyerCode_Equals_1_Then_Return_Product_Sold() {
    //service.makePurchase(2, 3, "Books");
    assertEquals("Product sold", service.makePurchase(2, 1, "Books"));
  }

  @Test
  public void Given_Buy_MakePurchase_When_BuyerCode_Equals_VendorCode_Then_Exception() {
    //service.makePurchase(2, 3, "Books");
    
    assertEquals(Exception, service.makePurchase(2, 2, "Books"));
  }

}