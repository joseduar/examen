package net.unadeca.ana.emleados2;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by ANA on 05/02/2018.
 */

@Database(name = Tododatabase.NAME, version = Tododatabase.VERSION)
public class Tododatabase {
    public static final String NAME = "TodoDatabase";

    public static final int VERSION = 3;
}
