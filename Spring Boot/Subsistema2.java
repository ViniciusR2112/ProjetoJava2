packge substema2.crm;

public class CepApi{

private static  CepApi instancia = new  CepApi();


private Cepapi(){
Super();
}

public static  SingletonEager getinstancia (){
return instancia;





 }

public String recuperarCidade(String cep){

return "Araraquara";
}

public String recuperarEstado(String cep){

return "SP";

}
}