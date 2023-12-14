package com.example.cleanarchitecturemultimodule.viewmodel

import com.example.cleanarchitecturemultimodule.viewmodel.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
//    private val setTokenInfoUseCase: SetTokenInfoUseCase
) : BaseViewModel() {

}