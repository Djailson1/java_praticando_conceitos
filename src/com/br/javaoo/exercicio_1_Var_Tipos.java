package com.br.javaoo;

/*Na empresa em que trabalhamos, há tabelas com o gasto de cada mês. Para fechar o balanço do
primeiro trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil
reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um programa que calcule e imprima
a despesa total no trimestre e a média mensal de gastos.*/
public class exercicio_1_Var_Tipos {
    public static void main(String[] args) {

        int janeiro = 15, fevereiro = 23, marco = 17,somaDespTri = 0, mediaMensal = 0;

        somaDespTri = janeiro + fevereiro + marco;
        mediaMensal = somaDespTri / 3;


        System.out.println("Total de despesas no trimestre: R$" + somaDespTri + " mil reais.");
        System.out.println("A média mensal de gastos é de: R$" + mediaMensal + " mil reais.");
    }
}
