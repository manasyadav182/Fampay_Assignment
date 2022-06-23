package com.example.fampayassignment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fampayassignment.Model.ItemsDesc
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {

    val  repository : Repository = Repository()

    init {
        getData()
    }

    var flowapi: Flow<List<ItemsDesc>> = emptyFlow()

    fun getData(){
        viewModelScope.launch {
            flowapi = flow {
                emit(repository.getItems())
            }
        }
    }
}