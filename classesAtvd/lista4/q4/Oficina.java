package javaprojects.classesAtvd.lista4.q4;

import java.util.Random;

public class Oficina {

    Random r = new Random();

    public Veiculo proximo(){
        Veiculo v;
        int code = r.nextInt();

        if(code%2 == 0){
            v = new Automovel();
        }
        else {
            v = new Bicicleta();
        }

        return v;
    }

    public void manter(Veiculo v){
        v.checklist();
        v.adjust();
        v.cleanup();
    }

    public static void main(String[] args) {
        Oficina o = new Oficina();
        Veiculo v;

        for (int i=0; i = 4; i++){
            v = o.proximo();
            o.manter(v);
        }
    }

}
