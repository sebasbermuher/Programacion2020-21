package UNIDAD5.U5_Entregable;

public class main {
    public static void main(String[] args) {

        Pais pais = new Pais("España",20);
        jugadorBaloncesto jBaloncesto = new jugadorBaloncesto("Pau Gasol",35,2.05);
        Atleta alt = new Atleta("Alejandro",21,"500 metros lisos");
        Judoka judoka = new Judoka("Luis",32,86);

        Baloncesto baloncesto  = new Baloncesto("Los Estudiantes","Los pinares",10);
        Atletismo atletismo = new Atletismo("Atletismo juvenil","Pista cubierta",3);
        Judo judo = new Judo("Judo AS","La mascareta",6);

        baloncesto.addJugadorBaloncesto(jBaloncesto);
        atletismo.addAtleta(alt);
        judo.addJudoka(judoka);

        alt.correr();
        judoka.luchar();
        jBaloncesto.encestar();

        alt.hacerJuramento();
        judoka.hacerJuramento();
        jBaloncesto.hacerJuramento();

        System.out.println();
        System.out.println("Participantes de Baloncesto:");
        baloncesto.mostrarParticipantes();
        System.out.println("Participantes de Judo");
        judo.mostrarParticipantes();
        System.out.println("Participantes de Atletismo");
        atletismo.mostrarParticipantes();
    }
}
