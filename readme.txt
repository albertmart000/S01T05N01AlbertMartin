
Per poder executar un programa  des de una terminal Linux:

    - Cal tenir instal.lat el compilador de java (javac).

    - Segons expliquem els tutorials que he trobat, des del directori a on tenim el package
      de l'exercici i la classe Principal, primer cal compilar l'arxiu .java i passar-lo a un
      arxiu .class de la següent manera:
                javac "Nom de l'arxiu".java
      I després s'ha d'executar amb el comandament: java "Nom de l'arxiu".

    - En el meu cas, des del directori on es troba la classe principal, només cal escriure:
                java "Nom de l'arxiu".java

Els quatre primers exercicis funcionen des de la consola i des de la terminal, però el Ex5 nomès funciona des de la consola. Tè dues classes i tot i que he compilat els dos arxius
.java, el terminal em dona errors d'execuci´0 i em mostra aquest text:
:
albert@albertmart000:~/Escritorio/IdeaProjects/S01T05N01AlbertMartin/src/S01T05N01Ex05AlbertMartin$ javac *.java
albert@albertmart000:~/Escritorio/IdeaProjects/S01T05N01AlbertMartin/src/S01T05N01Ex05AlbertMartin$ ls
App.class App.java Fruit.class Fruit.java
albert@albertmart000:~/Escritorio/IdeaProjects/S01T05N01AlbertMartin/src/S01T05N01Ex05AlbertMartin$ java App.java
App.java:15: error: cannot find symbol
private static void serializeObject(Fruit fruit) {
^
symbol: class Fruit
location: class App
App.java:9: error: cannot find symbol
Fruit fruit = new Fruit("poma", "vermell");
^
symbol: class Fruit
location: class App
App.java:9: error: cannot find symbol
Fruit fruit = new Fruit("poma", "vermell");
^
symbol: class Fruit
location: class App
3 errors
albert@albertmart000:~/Escritorio/IdeaProjects/S01T05N01AlbertMartin/src/S01T05N01Ex05AlbertMartin$

Moltes gràcies!!!!
