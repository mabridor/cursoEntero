package com.resuadam2.curso

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.resuadam2.curso.ui.navigation.AppNavigation
import com.resuadam2.curso.ui.theme.CursoTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
        CursoTheme {
                AppNavigation()
            //sfdñlkgdeeeeeeeeeeeeeeyoi
            }
        }
    }
}

