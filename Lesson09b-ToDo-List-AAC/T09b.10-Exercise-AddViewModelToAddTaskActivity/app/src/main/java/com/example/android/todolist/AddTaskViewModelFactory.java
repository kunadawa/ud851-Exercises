package com.example.android.todolist;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.android.todolist.database.AppDatabase;

// DO (1) Make this class extend ViewModel ViewModelProvider.NewInstanceFactory
public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory{

    // DO (2) Add two member variables. One for the database and one for the taskId
    private AppDatabase mDb;
    private int taskId;

    public AddTaskViewModelFactory(AppDatabase mDb, int taskId) {
        this.mDb = mDb;
        this.taskId = taskId;
    }
    // DO (3) Initialize the member variables in the constructor with the parameters received

    // DO (4) Uncomment the following method
    // Note: This can be reused with minor modifications
    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        //noinspection unchecked
        return (T) new AddTaskViewModel(mDb, taskId);
    }
}
