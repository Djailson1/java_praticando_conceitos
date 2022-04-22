package com.br.javaoo;
/*testando casting */
public class exercicio_2_Casting {
    public static void main(String[] args) {
        
        double num = 6.90;//variável tipo double com ponto flutuante
        int num1 = (int) num;//transformando double em número inteiro

        System.out.println(num1);
        //O casting foi feito para moldar a variável num como um int . O valor de num1 agora é 6.

        //transformando long em int

        long x = 10000;
        int y = (int) x;

        System.out.println(y);

        //Até casting com variáveis do tipo char podem ocorrer. O único tipo primitivo que não pode
        //ser atribuído a nenhum outro tipo é o boolean .


    }
}
