package me.alterway.workaholic;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class IntroActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        new LoadData().execute();
    }

    private class LoadData extends AsyncTask<Void, Void, Boolean>
    {

        @Override
        protected Boolean doInBackground(Void... params)
        {
            try
            {
                Thread.sleep(3000);

                return true;
            }
            catch(Exception e)
            {
                e.printStackTrace();
                return false;
            }
        }

        @Override
        protected void onPostExecute(Boolean success)
        {
            try
            {
                if (success)
                {
                    Intent continuing = new Intent(IntroActivity.this, LoginActivity.class);
                    startActivity(continuing);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
                    finish();
                }
                else
                {
                    throw new Exception();
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    }

}
