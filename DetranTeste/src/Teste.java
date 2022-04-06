import java.util.Scanner;
/**
*
* @author Franklin
*/
public class Teste {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in); 
	    Veiculo c1 = new Carro();
	    Carro carro = new Carro();
	    Moto moto = new Moto();
	    
	    //Entrada de Dados
	    System.out.println("Informe o nome do condutor:");
	    String nome = input.next().toUpperCase();
	    c1.setNome(nome);
	    
	    System.out.println("Informe a CNH do condutor:");
	    int cnh = input.nextInt();
	    c1.setCnh(cnh);
	    
	    System.out.println("Informe o tipo da CNH:");
	    String tipoCnh = input.next().toUpperCase();
	    c1.setTipoCnh(tipoCnh);
	    
	    System.out.println("Seu veículo é carro ou moto? \n 1 - Carro \n 2 - Moto");
	    int num = input.nextInt();
	        if (num == 1) {
	            System.out.println("Informe a Placa do Carro:");
	            String placa = input.next().toUpperCase();
	            c1.setPlaca(placa);
	            System.out.println("Informe a Marca do Carro:");
	            String marca = input.next().toUpperCase();
	            carro.setMarca(marca);
	            System.out.println("Informe a Modelo do Carro:");
	            String modelo = input.next().toUpperCase();
	            carro.setModelo(modelo);
	            System.out.println("Informe a Quantidade de Portas:");
	            int qtdPortas = input.nextInt();
	            carro.setQtdPortas(qtdPortas);
	            //Código para INFRAÇÕES - CARRO
	            System.out.println("Existe alguma multa: Sim ou Nao");
	            String resposta = input.next().toUpperCase();
	                if ("SIM".equals(resposta)) {
	                System.out.println("Digite: \n 1 - Leve \n 2 - Moderada \n 3 - Grave \n 4 - Gravíssima");
	                int multas = input.nextInt();
	                carro.setMultas(multas);
	                }
	   //RELATÓRIO DO CARRO
	   System.out.println("--------------------------------------");
	   System.out.println("--------------------------------------");
	   System.out.println("Nome do condutor: " + c1.getNome());
	   System.out.println("CNH do condutor: " + c1.getCnh());
	   System.out.println("Tipo da CNH do condutor: " + c1.getTipoCnh());
	   System.out.println("Placa do carro: " + c1.getPlaca());
	   System.out.println("Marca do carro: " + carro.getMarca());
	   System.out.println("Modelo do carro: " + carro.getModelo());
	   System.out.println("O carro possui: " + carro.getQtdPortas() + " portas.");
	   System.out.println("O condutor possui um multa do tipo: " + carro.getMultas());
	   
	            
	        } else if(num == 2){
	            System.out.println("Informe a Placa da Moto:");
	            String placa = input.next().toUpperCase();
	            c1.setPlaca(placa);
	            System.out.println("Informe a Marca da Moto:");
	            String marca = input.next().toUpperCase();
	            moto.setMarca(marca);
	            System.out.println("Informe a Modelo da Moto:");
	            String modelo = input.next().toUpperCase();
	            c1.setModelo(modelo);
	            System.out.println("Informe a Quantidade de Cilindradas:");
	            int cilindradas = input.nextInt();
	            moto.setCilindradas(cilindradas);
	            //Código para INFRAÇÕES - MOTO
	            System.out.println("Existe alguma multa: Sim ou Nao");
	            String resposta = input.next().toUpperCase().toUpperCase();
	                if ("SIM".equals(resposta)) {
	                System.out.println("Digite: \n 1 - Leve \n 2 - Moderada \n 3 - Grave \n 4 - Gravíssima");
	                int multas = input.nextInt();
	                c1.setMultas(multas);
	                c1.getMultas();
	                
	                }
	                
	              //RELATÓRIO de MOTO 
	   System.out.println("--------------------------------------");
	   System.out.println("--------------------------------------");
	   System.out.println("Nome do condutor: " + c1.getNome());
	   System.out.println("CNH do condutor: " + c1.getCnh());
	   System.out.println("Tipo da CNH do condutor: " + c1.getTipoCnh());
	   System.out.println("Placa da moto: " + c1.getPlaca());
	   System.out.println("Marca da moto: " + moto.getMarca());
	   System.out.println("Modelo da moto: " + c1.getModelo());
	   System.out.println("A moto possui " + moto.getCilindradas() + " Cilindradas");
	    System.out.println("O Condutor possui uma multa: " + c1.getMultas());

	}
	}
}
