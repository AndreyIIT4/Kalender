package andrei.ftf.grsu.by.kalender;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class Control extends Service {
    public Control() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
