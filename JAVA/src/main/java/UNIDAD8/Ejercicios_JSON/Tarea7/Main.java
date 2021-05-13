package UNIDAD8.Ejercicios_JSON.Tarea7;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CentralFutbolistas service=retrofit.create(CentralFutbolistas.class);
        Futbolista futbolista=null;

        System.out.println("Obtenemos el listado completo de futbolistas: ");
        try{
            Response<List<Futbolista>> response=service.listFutbolistas().execute();
            //comprobamos si la respuesta se ha ejecutado correctamente
            if(response.isSuccessful()){
                List<Futbolista> futbolistas=response.body();
                System.out.println(futbolistas);
            }else{
                System.out.println("Peticion no valida: " + response.message());
            }
        } catch (IOException e) {
            System.out.println("Error en la peticion: "+e.getMessage());
        }

    }
}
