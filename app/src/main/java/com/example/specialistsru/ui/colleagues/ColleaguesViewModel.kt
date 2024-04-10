package com.example.specialistsru.ui.colleagues

import Colleague
import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.specialistsru.retrofit.projectAPI
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ColleaguesViewModel : ViewModel() {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retrofit.create(projectAPI::class.java)
    private var arrayOfUsers: List<Colleague> = arrayListOf()

    suspend fun getColleguesList(): List<Colleague> {
        return CoroutineScope(Dispatchers.IO).async {
            val listOfUsers = apiService.getUserData()
            val user = apiService.getUser()
            Log.d("netData", "$listOfUsers")
            Log.d("netDataUser", "$user")

            withContext(Dispatchers.Main) {
                arrayOfUsers = listOfUsers.users
                Log.d("zxc", "$arrayOfUsers")
            }
            Log.d("zxc1", "$arrayOfUsers")
            arrayOfUsers
        }.await()
    }
}