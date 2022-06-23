package com.example.fampayassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fampayassignment.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel : MainActivityViewModel
    val itemController : ItemController = ItemController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        initRecycler()
    }


    private fun initRecycler(){
        viewModel.getData()
        val linearLayoutManager = LinearLayoutManager(this)
        binding.recyclerView.apply {
            layoutManager = linearLayoutManager
            setHasFixedSize(true)
            adapter = itemController.adapter
            addItemDecoration(DividerItemDecoration(this@MainActivity, linearLayoutManager.orientation))
        }
        lifecycleScope.launch{
            viewModel.flowapi.collect {
                itemController.setData(it)
            }
        }
        itemController.requestModelBuild()
    }
}