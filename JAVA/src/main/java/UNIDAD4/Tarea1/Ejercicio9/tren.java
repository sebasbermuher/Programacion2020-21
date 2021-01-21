package UNIDAD4.Tarea1.Ejercicio9;

public class tren {
    locomotora locomotora;
    vagon[] vagones = new vagon[5];
    maquinista maquinista;

    tren (locomotora locomotora, maquinista maquinista){
        this.locomotora=locomotora;
        this.maquinista=maquinista;
    }
    void mostrarInfo(){
        locomotora.mostrarInfo();
        maquinista.mostrarInfo();
        for (int i=0;i<5;i++){
            vagones[i].mostrarInfo();
        }
    }

    void anadirVagon (vagon vagon){
        for (int i=0;i<5;i++){
            vagones[i]=vagon;
        }
    }
}
