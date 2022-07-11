packege on. digitalinovation.gof/
*SingletonLazy

private static class Holder{
public class SingletonLazyHolder{

Private static SingletonLazyHolder instancia = new SingletonLazyHolder(); 
}
Private static SingletonLazyHolder(){
super();
}

public static SingletonLazyHolder getHolder(){
return instancia; 
}
  }