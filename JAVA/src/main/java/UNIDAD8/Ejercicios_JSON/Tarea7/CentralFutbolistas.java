package UNIDAD8.Ejercicios_JSON.Tarea7;

import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface CentralFutbolistas {
    //https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/jugadores
    @GET("jugadores") Call<List<Futbolista>> listFutbolistas();
}
