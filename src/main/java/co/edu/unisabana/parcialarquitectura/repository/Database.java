package co.edu.unisabana.parcialarquitectura.repository;

import co.edu.unisabana.parcialarquitectura.service.DatabasePort;

//Database ahora implementa DatabasePort, de nuevo, para realizar la inversión
public class Database implements DatabasePort {

  @Override
  public int savePurchase(int buyerCode, String item) {
    if (buyerCode == 0 || item == null || item.isEmpty()) {
      return 0;
    } else {
      return 1;
    }
  }
}
