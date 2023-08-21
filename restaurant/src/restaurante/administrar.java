package restaurante;

import administrativoCozinha.almoxarife;
import administrativoCozinha.cozinheiro;

public class administrar {
	public static void main(String[] args) {
		administrativoCozinha.cozinheiro  cozinheiro= new cozinheiro();
		cozinheiro.cozinhandoEntrada();
		cozinheiro.cozinhandoPrincipal();
		cozinheiro.cozinhandoSobrimesa();
		
		administrativoCozinha.almoxarife almoxarife = new almoxarife();
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();
		almoxarife.controlarEntregas();
		
		restaurante.atendente atendente= new atendente();
		atendente.atenderMesas();
		atendente.escrevendoPedidos();
		}
	
}
