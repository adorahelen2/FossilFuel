package dcu.fossilfuel.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import dcu.fossilfuel.data.api.ApiService
import dcu.fossilfuel.ui.components.*

@Composable
fun HomeScreen(navController: NavController, apiService: ApiService) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        TitleSection(navController = navController) // navController 전달
        StudySection()
        MemberSection()
        MemoriesSection()
        FooterSection()
    }
}