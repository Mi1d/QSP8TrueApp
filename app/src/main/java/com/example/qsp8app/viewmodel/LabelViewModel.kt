package com.example.qsp8app.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.qsp8app.model.bean.Label

class LabelViewModel: ViewModel() {
    var label = MutableLiveData<Label>()


}