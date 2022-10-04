package co.edu.unisabana.parcialarquitectura.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class BuyTest {

  @InjectMocks
  private Buy service;


  @Test
  public void test() {
    service.makePurchase(2, 3, "Books");
  }

}