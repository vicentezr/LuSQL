
# LuSQL
-------------------------
INSTRUCCIONES DE TRABAJO:

-Cada uno se encargará de uno o varios proyectos que tenga adjudicados,
disponibles en la pestaña proyectos.

-El código debe estar organizado (tabulado, etc.) y ser eficiente.

-Todos los métodos debrán estar documentados (sobre todo que parámetros hay
que pasarles, que hacen y que devuelven).

-Al actualizar el repositorio se deberá añadir aquí una entrada después de estas
instrucciones en el formato que pedes ver en la primera actualización debajo de
estas instrucciones (numero, que será el siguiente al de la anterior
actulización, fecha y modificaciones, indicando todos los métodos modificados, si es necesario, diciendo a que clase
pertenecen y la acción que se llevó acbo sobre ellos: borrado, modificado o nuevo).
También habra que decir sobre que número de actualización hiciste los cambios, que
será la última puesta en el readme que tengas tu (a lo mejor trabajaste sobre una
versión más antigua, por eso hay que indicarlo).

-Sis obligaciones de tiempo y cuando quieras puedes dejarlo.

-------------------------

*****
NÚMERO: 1
FECHA: 29/06/2017
MODIFICACIONES: Es el inicio del repositorio.
*****

*****
NÚMERO: 2
FECHA: 10/07/2017
MODIFICACIONES: Puesta la documentación de readme.
*****

*****
NÚMERO: 3
FECHA: 13/07/2017
MODIFICACIONES: Añadida estructura de clases básica de la parte lógica.

- Nuevo paquete "LuSQL.logica" (Nuevas clases:ConexionSingleton,ServidorSQL,TipoBD (enumeration))

- Nuevo paquete "LuSQL.logica.Factorias" (Nuevas clases: Conexiones)

- Nuevo paquete "LuSQL.logica.Interfaces" (Nuevas clases,AlmacenServidores,ConexionBD)

- Nuevo paquete "LuSQL.logica.Modelos" (Nuevas clases:BaseDeDatos,Tabla,Columna,Fila)

*****
NÚMERO: 4
FECHA: 17/07/1017
MODIFICACIONES: Cámbios en la interfaz gráfica.

- Modificaciones en colores, formatos de letra y formatos de organización al mostrar la información.

- Añadidas más funciones en las barras de menús y más atajos de teclado.

- Añadida barra de progreso (A medias, falta parte lógica).

NOTA: La modificación solo afecta al paquete principal de LuSQL y las funciones deben
ser relizadas y enlazadas adecuadamente para su funcionamiento.

*****
NÚMERO: 5
FECHA: 22/07/1017
MODIFICACIONES: Modificación de la estructura lógica.

- Modificación y borrado de clases y paquetes de la parte lógica (Paquetes actuales: "logica" , "interfaces")
	
- Funcionamiento de gran parte de los métodos relacionados con la conexión a la base de datos SQL_Server
	
- Nuevas interfaces añadidas (BaseDatos,Tabla)

*****
NÚMERO: 6
FECHA: 24/07/2017
MODIFICACIONES: Modificación en la interfaz gráfica y de comandos.

- Modificación de la organización del código.

- Inicio del paquete comandos.

- nueva ventana de ayuda.

- Otras modificaciones menores.

NOTA: Me haré cargo también del paquete de comandos (que será como una extensión de lógica de la interfaz
gráfica). Los cambiós aún están incompletos y falta unir la interfaz gráfica con la parte lógica.

*****
NÚMERO: 7
FECHA: 27/07/2017
MODIFICACIONES: Modificación en paquete de comandos y otras menores en gráfica.

- Ampliación de código en paquete de comandos

- Otras modificaciones menores en parte gráfica.
	
*****
NÚMERO: 7
FECHA: 28/07/2017
MODIFICACIONES: Completada parte lógica de conexión y acceso.

- Completados los métodos de BaseDatos (ejecutarSentencia,ejecutarConsulta,crearNuevaTabla,eliminarTabla).

- Añadida documentación javadoc a los métodos.

- Añadidos nuevas propiedades en la clase "LuSQL.logica.Columna"

Nota: Testeada la conexión y el funcionamiento de todos los métodos para un servidor SQL_Server_Windows, falta testear con el resto de servidores y detectar posibles errores.

*****
NÚMERO: 8
FECHA: 31/07/2017
MODIFICACIONES: Modificación en sistema de comandos e interfaz gráfica.

- Adicción de funciones para comandos.
