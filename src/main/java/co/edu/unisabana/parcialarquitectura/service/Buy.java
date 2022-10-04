package co.edu.unisabana.parcialarquitectura.service;


import co.edu.unisabana.parcialarquitectura.repository.Database;

import javax.xml.crypto.Data;

public class Buy {

  //Esto lo hice yo: Juan Miguel Hernandez Retamoso - 0000220471
  //Realizamos la inversión despues de hacer una clase abstracta
  private DatabasePort database;

  //Construimos...
  public Buy(DatabasePort database)
  {
    this.database = database;
  }

  //Ahora si hablamos de inyección por que database hace parte de una clase abstracta
  public String makePurchase(int vendorCode, int buyerCode, String item) {
    //Database database = new Database();
    if (buyerCode == vendorCode) {
      throw new IllegalSaleException(vendorCode, buyerCode);
    }
    int result = database.savePurchase(buyerCode, item);
    if (result == 1) {
      return "Product sold";
    } else {
      return "The sale was not possible";
    }
  }
}
