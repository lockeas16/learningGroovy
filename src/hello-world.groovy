// Así se pueden introducir comentarios en groovy
println("Hello world")

/*
 * Los argumentos del programa se pueden acceder mediante this.args
 * Estos se informan al correr el script, algo de la siguiente forma
 * groovy <script.groovy> arg1 arg2 ... argn
*/
print("Args are:")

for (int i=0; i < this.args.size(); i++){
   print(" " + this.args[i]);
}

/*
 * Las variables son de tipo dinámico y no necesitan ser declaradas
*/

// Variable x es entera
x = 1
println("x = " + x)

// Variable x ahora es un string
x = "Hola"
println("x = " + x)

// Variable x ahora es un boolean
x = true
println("x = " + x)

/*
 * Groovy incluye las siguientes librerias por default, por lo que no es necesario importarlas
 * import java.lang.* 
 * import java.util.* 
 * import java.io.* 
 * import java.net.* 
 * 
 * import groovy.lang.* 
 * import groovy.util.* 
 * 
 * import java.math.BigInteger 
 * import java.math.BigDecimal
 *
 * A diferencia de java, el punto y coma es opcional
 * 
*/

// Identificadores
// Se usa la palabra reservada def para definir variables y/o funciones y no pueden comenzar con un numero
def employeeName
def student
// Tambien pueden comenzar con un $ o un _
def $persona
def _cosa

// El valor default es null y es necesario escapar el signo $ para poderlo imprimir
println("\$persona equivale a " + $persona)