package com.iluscode.xoli.ui.crear;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CrearViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CrearViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is crear fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}