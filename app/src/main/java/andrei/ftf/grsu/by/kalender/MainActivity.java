package andrei.ftf.grsu.by.kalender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalendarView calendarView = (CalendarView) findViewById(R.id.calendarView1);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year,
                                            int month, int dayOfMonth) {
                int mYear = year;
                int mMonth = month;
                int mDay = dayOfMonth;
                String selectedDate = new StringBuilder().append(mDay)
                        .append("-").append(mMonth + 1).append("-").append(mYear)
                        .append(" ").toString();
                Toast.makeText(getApplicationContext(), selectedDate, Toast.LENGTH_LONG).show();

            }
        });
    }
}
