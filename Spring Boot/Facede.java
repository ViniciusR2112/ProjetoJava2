
packge one.digitalinovation.gof.facade;

public class facede{

public void migrarCliente(String nome, String cep){
String Cidade = CepApi.getinstancia().recuperar Cidade (cep);
String Estado =CepApi.getinstancia().recuperar Cidade (cep);


crmServe.gravarCliente(nome,cep,cidade,estado);

 }

}