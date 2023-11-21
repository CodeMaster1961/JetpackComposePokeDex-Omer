package com.seanaujong.pokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.seanaujong.pokedex.data.remote.responses.Pokemon
import com.seanaujong.pokedex.repository.PokemonRepository
import com.seanaujong.pokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}