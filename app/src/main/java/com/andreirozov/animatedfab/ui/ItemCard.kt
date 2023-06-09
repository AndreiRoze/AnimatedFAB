package com.andreirozov.animatedfab.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemCard(item: String) {
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            modifier = Modifier.padding(8.dp),
            text = item,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
    }
}