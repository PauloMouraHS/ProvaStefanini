package br.com.web.pages;

import static br.com.web.core.DriverFactory.getDriver;
import static br.com.web.util.Parametros.criarEmail;
import static br.com.web.util.Parametros.criarNomeUsuario;
import static br.com.web.util.Parametros.criarSenha;

import org.openqa.selenium.By;

import br.com.web.core.BasePage;

public class CadastrarUsuarioPage extends BasePage {

	// Elementos Web

	By nome = By.id("name");
	By email = By.id("email");
	By senha = By.id("password");
	By btnCadastrar = By.id("register");
	By validarId = By.id("tdUserId1");
	 
	
	public void acessarSite() throws Exception {
		getDriver().get("http://prova.stefanini-jgr.com.br/teste/qa/");
	}

	public void preencherDadosDeCadastro() {
		clicar(nome);
		escrever(nome, criarNomeUsuario);
		escrever(email, criarEmail);
		escrever(senha, criarSenha);
		clicar(btnCadastrar);
	}

	public void validarCadastroDeUsuario() {
		validarTexto("1", validarId);
	}
}