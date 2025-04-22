# Sistema de Gestión de Torneos de eSports 
 
## Autor 
Hada Sanchez Serrano 
hadaserrano
 
## Descripción del Proyecto 
Trabajo para la asignatura de entornos en el que he tenido que crear una aplicación de gestión de torneos de eSports para lo cual he usado UML y Java. En UML he creado un diagrama de clases y uno de usos.

[https://github.com/hadaserrano/AD3-UML.git](https://github.com/hadaserrano/torneo-esports-uml.git)

 
## Diagramas UML 
### Diagrama de Casos de Uso 
![Diagrama de casos de uso] (diagrams/DiagramaDeUsos.png)
 
### Diagrama de Clases 
![Diagrama de clases](diagrams/clases.png) 
 
## Estructura del Proyecto 
 
torneo-esports-uml/ ├── src/ 
│ │ ├── Main.java 
│ │ ├── control/ 
│ │ ├──entidades
│ │ ├──negocio
│ │ ├──test
│ │ ├── vista/ 
├── diagrams/ 
│ ├── DiagramaDeClases.png 
│ ├── DiagramaDeUsos.png 
├── README.md 
├── .gitignore 
 
## Instalación y Ejecución 
1. Clonar el repositorio: 
`git clone https://github.com/hadaserrano/torneo-esports-uml.git` 
 
2. Compilar y ejecutar el proyecto: 
`cd src javac es/empresa/torneo/Main.java java es.empresa.torneo.Main` 
 
## Justificación del diseño 
En el diagrama de casos de usos encontramos los siguientes casos: "Registrar jugador, Añadir jugadores a un equipo, Registrar equipo", Consultar lista de equipos y jugadores. Decidí incluir el caso de uso de "registrar jugador" ya que no creo que sea posible anadir jugadores a un equipo sin antes haber registrado a los propios jugadores, considero que todos los casos de uso son indepenedientes ya que tu puedes realizar cada uno de ellos de forma individual. El unico actor que encontré es el Admin(administrador) el cuál es el encargado de realizar cada una de las acciones. 
//No está acabado
 
## Conclusiones  
Sobre el aprendizaje obtenido.
