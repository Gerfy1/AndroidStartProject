package com.gerfy.dayfras.classes;


public class ContaBancaria {


    //Atributos
    protected double saldo = 0;


    //Métodos
    private void recuperaSaldo(){}
    public void sacar(){
        //Recuperar o saldo atual da pessoa
        recuperaSaldo(); // ou this.recuperarSaldo();
    }



     public void transferir(){}
}
