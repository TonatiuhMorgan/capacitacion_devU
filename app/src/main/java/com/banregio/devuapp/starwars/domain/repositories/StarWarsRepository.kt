package com.banregio.devuapp.starwars.domain.repositories

import com.banregio.devuapp.starwars.domain.models.SWFilm
import com.banregio.devuapp.util.DevUResponse

interface StarWarsRepository {

    suspend fun getFilmsList(): DevUResponse<List<SWFilm>>

}