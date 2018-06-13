package com.example.android.todolist;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;
import android.util.Log;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

import java.util.List;

// DO (1) make this class extend AndroidViewModel and implement its default constructor
public class MainViewModel extends AndroidViewModel {
    private LiveData<List<TaskEntry>> tasks;
    // Constant for logging
    private static final String TAG = MainViewModel.class.getSimpleName();

    public MainViewModel(@NonNull Application application) {
        super(application);
        Log.d(TAG, "Retrieving all tasks from dataBase");
        tasks = AppDatabase.getInstance(getApplication().getApplicationContext()).taskDao().loadAllTasks();
    }

    public LiveData<List<TaskEntry>> getTasks() {
        return tasks;
    }

    // DO (2) Add a tasks member variable for a list of TaskEntry objects wrapped in a LiveData

    // DO (4) In the constructor use the loadAllTasks of the taskDao to initialize the tasks variable

    // DO (3) Create a getter for the tasks variable
}
