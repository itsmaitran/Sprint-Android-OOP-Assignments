package com.lambdaschool.pokemonapi.viewmodel

import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR
import com.lambdaschool.pokemonapi.model.JSONPokemon
import com.lambdaschool.pokemonapi.view.MainActivity
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
        return MainActivity.pokemonViewModel?.name
        notifyPropertyChanged(BR.name)
    }

    @Bindable
    fun getPokemonId(): String? {
        val id = MainActivity.pokemonViewModel?.id.toString()
        return "Pokemon ID: $id"
        notifyPropertyChanged(BR.id)
    }

    fun onSearchClicked() {
        ViewPokemonActivity.pokemonList.add(MainActivity.pokemonViewModel!!)
        println(MainActivity.pokemonViewModel)
        startActivity(context, Intent(context, MainActivity::class.java), null)
    }
}