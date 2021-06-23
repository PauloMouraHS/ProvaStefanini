package br.com.web.util;

import java.util.Random;

public class Parametros {

	static Random aleatorio = new Random();
	static int valor = aleatorio.nextInt(10);

	
	public static String criarNomeUsuario = "Fulano " + "da Silva";
	public static String criarSenha = "12345678";
	public static String criarEmail = "email" + valor + "@stefanini.com";

}