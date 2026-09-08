/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sistema;

/**
 *
 * @author juran
 */

    public class Sistema {

        private static final double MEDIA_MINIMA_APROVACAO = 6;

        public static void main(String[] args) {
            String nomeAluno = "Carlos";
            double notaPrimeiraAvaliacao = 8;
            double notaSegundaAvaliacao = 7;

            double media = calcularMedia(notaPrimeiraAvaliacao, notaSegundaAvaliacao);
            String situacao = verificarSituacao(media);

            exibirResultado(nomeAluno, media, situacao);
        }

        private static double calcularMedia(double nota1, double nota2) {
            return (nota1 + nota2) / 2;
        }

        private static String verificarSituacao(double media) {
            return media >= MEDIA_MINIMA_APROVACAO ? "Aprovado" : "Reprovado";
        }

        private static void exibirResultado(String nomeAluno, double media, String situacao) {
            System.out.println("Aluno: " + nomeAluno);
            System.out.println("Media: " + media);
            System.out.println(situacao);
        }
    }
