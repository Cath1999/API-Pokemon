package ni.edu.uca.pokemon

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
@GET

suspend fun getDatosPokemon(@Url url:String): Response<ModelPokemon>


}