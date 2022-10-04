package co.edu.unisabana.parcialarquitectura.service;

import java.sql.SQLOutput;

public interface DatabasePort {

    //Hacemos la clase abstracta para la inversión
    default int savePurchase(int buyerCode, String item) {
        return buyerCode;
    }
}
