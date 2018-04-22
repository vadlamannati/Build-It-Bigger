package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
public class AsyncTaskCheck {
    private static final String LOG_TAG = AsyncTaskCheck.class.getName();

    @Test
    public void checkStringInAsyncTask() throws Exception {

        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        endpointsAsyncTask.execute(InstrumentationRegistry.getTargetContext());
        try {
            result = endpointsAsyncTask.get();
            Log.v(LOG_TAG, "Received String : " + result);
            if (TextUtils.isEmpty(result))  fail();
            assertNotNull(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
