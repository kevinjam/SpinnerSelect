package kevinjanvier.spinnerselect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Spinner spinner = (Spinner)findViewById(R.id.spinner_category);
        final Spinner spinner1 = (Spinner) findViewById(R.id.spinner);

        /**
         * First Option
         * Select the Options of the Categories
         */
        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.type, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
/**
 * Second Option
 */

        final ArrayAdapter<CharSequence> universty = ArrayAdapter.createFromResource(
                this, R.array.universty, android.R.layout.simple_spinner_item);
        universty.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(universty);

/**
 * Third Option
 */

        final ArrayAdapter<CharSequence> church = ArrayAdapter.createFromResource(
                this, R.array.church, android.R.layout.simple_spinner_item);
        church.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(church);
/**
 * African
 */
//        final ArrayAdapter<CharSequence> africa = ArrayAdapter.createFromResource(
//                this, R.array.africa, android.R.layout.simple_spinner_item);
//        africa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner1.setAdapter(africa);
//
//        /**
//         * America
//         */
//        final ArrayAdapter<CharSequence> america = ArrayAdapter.createFromResource(
//                this, R.array.america, android.R.layout.simple_spinner_item);
//        america.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner1.setAdapter(america);
//
//        /**
//         * Techo
//         */
//        final ArrayAdapter<CharSequence> techno = ArrayAdapter.createFromResource(
//                this, R.array.technology, android.R.layout.simple_spinner_item);
//        techno.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner1.setAdapter(techno);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position){
                    case 1:
                        spinner1.setAdapter(universty);
                        break;
                    case 2:
                        spinner1.setAdapter(church);
                        break;



                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }


}
