All object-oriented programming (Java) projects will be uploaded here.

contrusctor es aquel elemnto es aquel encargado de construir objetos o instancias
es una funcion especial encargada de construir la clase
ejemplo Vehicle  vehicle = new Vehicle();

memoria stack donde van los metodos
heaq donde se liga con la instancia


es un metodo pertenenciente a la clase
no regresa nada
se llama a igual a la clase


Person p = new Person(); // Person() es un constructor vacio
person p2 = new Person("Pedro", 15);

modificadors de acceso
public {
  hace visible para todo el mundo
}
protected {
  visbible a todo le paquete a menos que se este en otro paquete
}
private {
  visible solo a la clase en la que se encuentra
}
default {
  visibles a todo el paquete
}

modificador static
static {
  el atributo o metodo pertenece a la clase y no a la instancia
  solo podemos tener variables y metodos

  si tenemos static int number
  al generar la instancia no se guarda el numero, si no en la clase
  asi que si tenemos 3 instancias diferentes, no importa el valor de cada una
  ya que si es statica tendran todos el mismo valor
}

modificador final {
  clase no puede ser heredada
  varibles solo puede inicializada una vez
  metodos no se pueden ser sobreesrito

  puedo crear la clase pero solo se instancia una vez, puede cambiar su estado 
}

variables de instancia {
  son todas las varibales que no estan en un meotdo de la clase
}

variables static {
  es una variable con el modificador static
}

variables locales {
  son las que estan dentro del metodo
}

shadowing 

se refiere a que tienes 2 clases con el mismo onmbre en diferentes contextos

puedes tener variables locales o no


this. hace referencia a la instancia

si instancias un bloque statico se ejecuta una unica vez que se crea una instancia de la clase 

java bean
pojo es lo mismo
play old java objet
es una clase simple que solo contiene atributos privados y proporciona metodos para
acceder a los datos
todos las varibales son privadas
tiene metodos get y set por cada propriedad

son objetos encapsulado