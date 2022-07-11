packege on. digitalinovation.gof/
*SingletonLazy

public class SingletonLazy{

private static singletonLazy instancia;
 
private SingletonLazy(){
super();
}

public static SingletonLazy getInstancia(){

if(Instancia == null){

instancia = new SingletonLazy();
}
return Instancia

}

} 