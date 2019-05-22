package test_frag.com.frag_lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cat.ereza.customactivityoncrash.config.CaocConfig;

public class MainActivity extends Activity {

    @BindView(R.id.bt_frag_1) Button BT_Frag_1;
    @BindView(R.id.bt_frag_2) Button BT_Frag_2;

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {

        super.onPostCreate(savedInstanceState);
        Toast.makeText(getApplicationContext(), "onPostCreate Main Activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);

        Toast.makeText(getApplicationContext(), "onCreate Main Activity", Toast.LENGTH_SHORT).show();

        BT_Frag_1.performClick();

        CaocConfig.Builder.create()
                .backgroundMode(CaocConfig.BACKGROUND_MODE_SILENT) //default: CaocConfig.BACKGROUND_MODE_SHOW_CUSTOM
                .enabled(false) //default: true
                .showErrorDetails(false) //default: true
                .showRestartButton(false) //default: true
                .logErrorOnRestart(false) //default: true
                .trackActivities(true) //default: false
                .minTimeBetweenCrashesMs(2000) //default: 3000
                .errorDrawable(R.drawable.ic_launcher_background) //default: bug image
                .restartActivity(MainActivity.class) //default: null (your app's launch activity)
                .apply();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart Main Activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        super.onResume();

        Toast.makeText(getApplicationContext(), "onResume Main Activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        Toast.makeText(getApplicationContext(), "onPostResume Main Activity", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getApplicationContext(), "onPause Main Activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(getApplicationContext(), "onStop Main Activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(getApplicationContext(), "onRestart Main Activity", Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(getApplicationContext(), "onDestroy Main Activity", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.bt_frag_1)
    public void load_farg_1(View view) {

        loadFragment_1(new HelloFragment_1());

    }

    @OnClick(R.id.bt_frag_2)
    public void load_farg_2(View view) {

        loadFragment_2(new HelloFragment_2());
    }


    private void loadFragment_1(HelloFragment_1 HF1 ) {


        FragmentManager fm = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fl_frg, HF1);
        //fragmentTransaction.addToBackStack("Frag1");
        fragmentTransaction.commit();
    }


    private void loadFragment_2( HelloFragment_2 HF2 ) {


        FragmentManager fm = getFragmentManager();
        android.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fl_frg, HF2);
        fragmentTransaction.addToBackStack("Frag2");
        fragmentTransaction.commit();
    }


}
