package com.cristian.jetpackcomposeinstagram.login.data

import com.cristian.jetpackcomposeinstagram.login.data.network.LoginService
import javax.inject.Inject

class LoginRepository @Inject constructor(private val api: LoginService) {

    suspend fun doLogin(user: String, password: String) = api.doLogin(user, password)
}