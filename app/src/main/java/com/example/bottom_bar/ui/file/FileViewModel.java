package com.example.bottom_bar.ui.file;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FileViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FileViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is file fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}