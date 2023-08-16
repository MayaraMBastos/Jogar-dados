package com.dados.Jogar.dados.Service;

import com.dados.Jogar.dados.Model.M_Jogar;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class S_Dados {

    public static M_Jogar jogarDados(int dados, int faces){
        int soma = 0;
        int maior= 0;
        int resultado = 0;

        int[] jogadas = new int[dados];
        for(int i = 1; i <= dados; i++){
            Random rand = new Random();
            resultado = rand.nextInt(faces) + 1;
            jogadas[i-1] = resultado;
            soma += resultado;
            if(resultado > maior){
                maior = resultado;
            }
        }
        M_Jogar m_jogada = new M_Jogar(soma,jogadas,maior);
        return m_jogada;

    }
}
