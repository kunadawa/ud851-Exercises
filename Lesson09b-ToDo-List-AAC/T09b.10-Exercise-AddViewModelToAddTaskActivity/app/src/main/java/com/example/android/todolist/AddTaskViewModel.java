package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

// DO (5) Make this class extend ViewModel
public class AddTaskViewModel extends ViewModel {
    private static final String TAG = AddTaskViewModel.class.getSimpleName();

    public LiveData<TaskEntry> getTask() {
        return task;
    }

    // DO (6) Add a task member variable for the TaskEntry object wrapped in a LiveData
    private LiveData<TaskEntry> task;

    // DO (8) Create a constructor where you call loadTaskById of the taskDao to initialize the tasks variable
    // Note: The constructor should receive the database and the taskId

    public AddTaskViewModel(AppDatabase mDb, int taskId) {
        Log.d(TAG, "Retrieving specific task from the DataBase");
        task = mDb.taskDao().loadTaskById(taskId);
    }


    // DO (7) Create a getter for the task variable
}
