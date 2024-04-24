/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Mailon
 */
public class ControleCarregar {

    public static void carregar(String path) {

        // Inicializar a matriz
        int[][] matriz = null;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            // Ler a primeira linha para obter a altura e a largura da matriz
            int altura = Integer.parseInt(br.readLine());
            int largura = Integer.parseInt(br.readLine());

            // Inicializar a matriz com a altura e a largura obtidas
            matriz = new int[altura][largura];

            // Preencher a matriz com os dados do arquivo
            for (int i = 0; i < altura; i++) {
                String[] linha = br.readLine().split("\\s+");
                for (int j = 0; j < largura; j++) {
                    matriz[i][j] = Integer.parseInt(linha[j]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Imprimir a matriz
        System.out.println("Matriz criada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
