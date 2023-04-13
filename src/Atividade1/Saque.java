package Atividade1;

import java.util.Scanner;

public class Saque implements AcoesSaque {
    protected float x;
    protected int[] v = new int[12];
    protected float[] n = new float[]{200, 100, 50, 20, 10, 5, 2, 1, 0.5f, 0.25f, 0.05f};

    public void recebeValor(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Insira o valor a ser sacado");
            x = sc.nextFloat();
            if(x<0){
                System.out.println("Valor inválido\n");
            }
        }while(x < 0);
    }

    public void validaValor(){
        while(true){
            try {
                recebeValor();
                break;
            }catch (Exception e) {
                System.out.println("Valor inválido\n");
            }

        }
    }
    @Override
    public void calcSaque(float x) {
        for(int i = 0; i <= 10;){
            if(x >= n[i]){
                x -= n[i];
                v[i] += 1;
                i = 0;
            }else{
                i++;
            }
        }

        for(int i = 0; i <= 6; i++){
            if(v[i] > 0){
                    System.out.println(v[i] + " Notas de " + n[i] + " reais");
            }
        }

        for(int i = 7; i <= 11; i++){
            if(v[i] > 0){
                if(n[i] == 1){
                        System.out.println(v[i] + " Moeda(s) de " + n[i] + " real");
                }
                if(n[i] != 1 && v[i] > 0){
                    System.out.println(v[i] + " Moeda(s) de " + (n[i]*100) + " centavos");
                }
                }
            }
        }


    @Override
    public void operacao(){
        this.validaValor();
        this.calcSaque(x);
    }


}
