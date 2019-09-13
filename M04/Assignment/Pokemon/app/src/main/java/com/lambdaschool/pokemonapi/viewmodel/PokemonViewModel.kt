package com.lambdaschool.pokemonapi.viewmodel

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR
import com.lambdaschool.pokemonapi.model.JSONPokemon
import com.lambdaschool.pokemonapi.view.MainActivity
import com.lambdaschool.pokemonapi.view.MainActivity.Companion.pokemonViewModel
import com.lambdaschool.pokemonapi.view.ViewPokemonActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokemonViewModel(context: Context) : BaseObservable(), Callback<JSONPokemon> {

    val context = context

    override fun onFailure(call: Call<JSONPokemon>, t: Throwable) {
        println("failed")
    }

    override fun onResponse(call: Call<JSONPokemon>, response: Response<JSONPokemon>) {
        if (response.isSuccessful) {
            println(response.body()?.name)
        } else {
            print(response)
        }
    }

    @Bindable
    fun getPokemonName(): String? {
        return pokemonViewModel?.name
    }

    @Bindable
    fun getPokemonId(): String? {
        val id = pokemonViewModel?.id.toString()
        return "Pokemon ID: $id"
    }

    fun setPokemonName(pokemonName: String) {
        pokemonViewModel?.name = pokemonName
        notifyPropertyChanged(BR.pokemonName)
    }

    fun onSearchClicked() {
        ViewPokemonActivity.pokemonList.add(pokemonViewModel!!)
        println(pokemonViewModel)
        startActivity(context, Intent(context, MainActivity::class.java), null)
    }
}