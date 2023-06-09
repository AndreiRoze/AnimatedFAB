package com.andreirozov.animatedfab.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ContentViewModel : ViewModel() {
    private val _items = MutableStateFlow<MutableList<String>>(mutableListOf())
    val items: StateFlow<MutableList<String>> = _items.asStateFlow()

    private val _isVisible = MutableStateFlow(true)
    val isVisible: StateFlow<Boolean> = _isVisible.asStateFlow()

    init {
        fillData()
    }

    private fun fillData() {
        repeat(50) {
            _items.value.add("Item №$it")
        }
    }

    fun hideFAB() {
        _isVisible.value = false
    }

    fun showFAB() {
        _isVisible.value = true
    }
}