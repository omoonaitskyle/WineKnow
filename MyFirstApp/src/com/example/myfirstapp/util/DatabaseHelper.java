package com.example.myfirstapp.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
	// The Android's default system path of your application database.
	// private static String DB_PATH = "/data/data/MyFirstApp/databases/";
	// private static String DB_PATH2 = "data/MyFirstApp/databases/";
	/*
	 * public enum FOOD { VEGETABLES, ROASTED_VEGETABLES, SOFT_CHEESE,
	 * HARD_CHEESE, STARCHES, FISH, RICH_FISH, WHITE_MEAT, RED_MEAT, CURED_MEAT,
	 * SWEETS };
	 */
	public enum FOOD {
		VEGETABLES, ROASTED_VEGETABLES, CHEESE, STARCHES, FISH, RICH_FISH, WHITE_MEAT, RED_MEAT, CURED_MEAT, SWEETS
	};

	public boolean isOpen() {
		return myDatabase.isOpen();
	}
	
	// used to find pairings eg WINES[DRY_WHITE] returns dry whites, etc.
	private static final int DRY_WHITE = 0, SWEET_WHITE = 1, RICH_WHITE = 2,
			SPARKLING = 3, LIGHT_RED = 4, MEDIUM_RED = 5, BOLD_RED = 6,
			DESSERT = 7;
	private static final String[][] VAR = new String[][] {
			new String[] { "White Table Wine", "Sauvignon Blanc",
					"Gruner Vertliner", "Pinot Grigio", "Albarino" },
			new String[] { "Gewurtzraminer", "Muller-Thurgau", "Malvasia",
					"Moscato", "Riesling" },
			new String[] { "Chardonnay", "Roussanne", "Marsanne", "Viognier" },
			new String[] { "Sparkling Wine", "Champagne", "Proseco", "Cava" },
			new String[] { "St.Laurent", "Pinot Noir", "Zweigelt", "Gamay" },
			new String[] { "Red Table Wine", "Tempranillo", "Sangiovese",
					"Zinfandel", "Grenache", "Merlot" },
			new String[] { "Cabernet Sauvignon", "Monastrell", "Aglianico",
					"Malbec", "Syrah" },
			new String[] { "Late Harvest", "Ice Wine", "Sherry", "Port" } };

	private static ArrayList<String> addVarietals(int... params) {
		ArrayList<String> l = new ArrayList<String>();
		for (int i : params) {
			l.addAll(Arrays.asList(VAR[i]));
		}
		return l;
	}

	public static final ArrayList<String> getWines(FOOD f) {
		ArrayList<String> a;
		switch (f) {
		case VEGETABLES:
			a = addVarietals(DRY_WHITE, SPARKLING);
			break;
		case ROASTED_VEGETABLES:
			a = addVarietals(DRY_WHITE, LIGHT_RED, MEDIUM_RED);
			break;
		/*
		 * case SOFT_CHEESE: a = addVarietals(SWEET_WHITE, RICH_WHITE,
		 * SPARKLING, DESSERT); break; case HARD_CHEESE: a =
		 * addVarietals(SWEET_WHITE, SPARKLING, MEDIUM_RED, BOLD_RED); break;
		 */
		case CHEESE:
			a = addVarietals(SWEET_WHITE, SPARKLING, MEDIUM_RED, BOLD_RED);
			break;
		case STARCHES:
			a = addVarietals(DRY_WHITE, RICH_WHITE, SPARKLING, LIGHT_RED,
					MEDIUM_RED, BOLD_RED, DESSERT);
			break;
		case FISH:
			a = addVarietals(DRY_WHITE, RICH_WHITE, SPARKLING);
			break;
		case RICH_FISH:
			a = addVarietals(RICH_WHITE, LIGHT_RED);
			break;
		case WHITE_MEAT:
			a = addVarietals(RICH_WHITE, LIGHT_RED, MEDIUM_RED);
			break;
		case RED_MEAT:
			a = addVarietals(MEDIUM_RED, BOLD_RED);
			break;
		case CURED_MEAT:
			a = addVarietals(SWEET_WHITE, LIGHT_RED, MEDIUM_RED, BOLD_RED,
					DESSERT);
			break;
		case SWEETS:
			a = addVarietals(SWEET_WHITE, DESSERT);
			break;
		default:
			a = null;
			break;
		}
		return a;
	}

	private static String DB_NAME = "wineknow.db";
	private static int DB_VERSION = 1;
	private SQLiteDatabase myDatabase;
	private final Context myContext;

	/**
	 * Constructor Takes and keeps a reference of the passed context in order to
	 * access to the application assets and resources.
	 * 
	 * @param context
	 */
	public DatabaseHelper(Context context) {
		super(context, DB_NAME, null, DB_VERSION);
		this.myContext = context;
	}

	/**
	 * Creates a empty database on the system and rewrites it with your own
	 * database.
	 * */
	public void createDatabase() throws IOException {
		boolean dbExist = checkDatabase();
		myDatabase = this.getWritableDatabase();
		if (dbExist) {
			// do nothing - database already exists
			System.out.println("database already exists");
		} else {
			System.out.println("database doesn't exist; try creating");
			// By calling this method and empty database will be created into
			// the default system path
			// of your application so we are gonna be able to overwrite that
			// database with our database.
			this.getWritableDatabase();
			try {
				copyDatabase();
			} catch (IOException e) {
				// throw new Error("Error copying database");
				throw e;
			}
		}
	}

	/**
	 * Check if the database already exist to avoid re-copying the file each
	 * time you open the application.
	 * 
	 * @return true if it exists, false if it doesn't
	 */
	private boolean checkDatabase() {
		SQLiteDatabase checkDB = null;
		try {
			String myPath = myContext.getFilesDir().getPath() + "/" + DB_NAME;
			checkDB = SQLiteDatabase.openDatabase(myPath, null,
					SQLiteDatabase.OPEN_READWRITE);
		} catch (SQLiteException e) {
			// database does't exist yet.
		}
		if (checkDB != null) {
			checkDB.close();
		}
		return checkDB != null ? true : false;
	}

	/**
	 * Copies your database from your local assets-folder to the just created
	 * empty database in the system folder, from where it can be accessed and
	 * handled. This is done by transfering bytestream.
	 * */
	private void copyDatabase() throws IOException {
		// Open your local db as the input stream
		InputStream myInput = myContext.getAssets().open(DB_NAME);
		// Path to the just created empty db
		// String outFileName = DB_PATH + DB_NAME;
		String outFileName = myContext.getFilesDir().getPath() + "/" + DB_NAME;
		System.out.println(outFileName);
		// Open the empty db as the output stream
		OutputStream myOutput = new FileOutputStream(outFileName);
		// transfer bytes from the inputfile to the outputfile
		byte[] buffer = new byte[1024];
		int length;
		while ((length = myInput.read(buffer)) > 0) {
			myOutput.write(buffer, 0, length);
		}
		// Close the streams
		myOutput.flush();
		myOutput.close();
		myInput.close();
	}

	public void openDatabase() throws SQLException {
		// Open the database
		String myPath = myContext.getFilesDir().getPath() + "/" + DB_NAME;
		myDatabase = SQLiteDatabase.openDatabase(myPath, null,
				SQLiteDatabase.OPEN_READWRITE);
	}

	@Override
	public synchronized void close() {
		if (myDatabase != null)
			myDatabase.close();
		super.close();
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}

	// Add your public helper methods to access and get content from the
	// database.
	// You could return cursors by doing "return myDataBase.query(....)" so it'd
	// be easy
	// to you to create adapters for your views.
	public Cursor getWineByID(int id) {
		return myDatabase.rawQuery("select * from Wine where _id is " + id,
				null);
	}

	// offset ID of first wine to return
	// limit Number of wines to return
	public Cursor getWinesByID(int offset, int limit) {
		return myDatabase.rawQuery("select * from Wine limit " + limit
				+ " offset " + offset, null);
	}

	public Cursor getWinesByVarietal(String var) {
		return myDatabase
				.rawQuery(
						"SELECT w.Name, w.Description, w.Color, v.Name, v.Region, var.Name, d1.Name, d2.Name FROM Wine w, Wine_Vineyard wv, Vineyard v, Wine_Descriptor wd1, Wine_Descriptor wd2, Descriptor d1, Descriptor d2, Wine_Variety wvar, Variety var WHERE w._id = wv.Wine_Id AND w._id = wd1.Wine_Id AND w._id = wd2.Wine_Id AND w._id = wvar.Wine_ID AND v._id = wv.Vineyard_Id AND d1._id = wd1.Descriptor_ID AND d2._id = wd2.Descriptor_Id AND var._id = wvar.Variety_Id AND wd1.Descriptor_Id < wd2.Descriptor_Id AND var.Name = '"
								+ var + "';", null);
	}
	
	public Cursor getWinesByDescriptor(String var) {
		return myDatabase
				.rawQuery(
						"SELECT w.Name, w.Description, w.Color, v.Name, v.Region, var.Name, d1.Name, d2.Name FROM Wine w, Wine_Vineyard wv, Vineyard v, Wine_Descriptor wd1, Wine_Descriptor wd2, Descriptor d1, Descriptor d2, Wine_Variety wvar, Variety var WHERE w._id = wv.Wine_Id AND w._id = wd1.Wine_Id AND w._id = wd2.Wine_Id AND w._id = wvar.Wine_ID AND v._id = wv.Vineyard_Id AND d1._id = wd1.Descriptor_ID AND d2._id = wd2.Descriptor_Id AND var._id = wvar.Variety_Id AND wd1.Descriptor_Id < wd2.Descriptor_Id AND (d1.Name LIKE '" + var + "' OR d2.Name LIKE '" + var + "');" 
						, null);
	}
	
	

	public Cursor getRandomWine() {
		// Get the number of wines in the database
		return myDatabase.rawQuery("SELECT w.Name, w.Description, w.Color, v.Name, v.Region, var.Name, d1.Name, d2.Name FROM Wine w, Wine_Vineyard wv, Vineyard v, Wine_Descriptor wd1, Wine_Descriptor wd2, Descriptor d1, Descriptor d2, Wine_Variety wvar, Variety var WHERE w._id = wv.Wine_Id AND w._id = wd1.Wine_Id AND w._id = wd2.Wine_Id AND w._id = wvar.Wine_ID AND v._id = wv.Vineyard_Id AND d1._id = wd1.Descriptor_ID AND d2._id = wd2.Descriptor_Id AND var._id = wvar.Variety_Id AND wd1.Descriptor_Id < wd2.Descriptor_Id;", null);
		
	}

	public Cursor getRandomPairedWine(FOOD f) {
		ArrayList<String> matches = getWines(f);
		Random r = new Random();
		int i = r.nextInt(matches.size());
		System.out.println(i);
		return getWinesByVarietal(matches.get(i));
	}

	public Cursor getRedWine() {
		return myDatabase.rawQuery(
				"SELECT w.Name, w.Description, w.Color, v.Name, v.Region, var.Name, d1.Name, d2.Name FROM Wine w, Wine_Vineyard wv, Vineyard v, Wine_Descriptor wd1, Wine_Descriptor wd2, Descriptor d1, Descriptor d2, Wine_Variety wvar, Variety var WHERE w._id = wv.Wine_Id AND w._id = wd1.Wine_Id AND w._id = wd2.Wine_Id AND w._id = wvar.Wine_ID AND v._id = wv.Vineyard_Id AND d1._id = wd1.Descriptor_ID AND d2._id = wd2.Descriptor_Id AND var._id = wvar.Variety_Id AND wd1.Descriptor_Id < wd2.Descriptor_Id AND w.Color = 'Red';", null);
		
	}
	
	public Cursor getWhiteWine() {
		return myDatabase.rawQuery(
				"SELECT w.Name, w.Description, w.Color, v.Name, v.Region, var.Name, d1.Name, d2.Name FROM Wine w, Wine_Vineyard wv, Vineyard v, Wine_Descriptor wd1, Wine_Descriptor wd2, Descriptor d1, Descriptor d2, Wine_Variety wvar, Variety var WHERE w._id = wv.Wine_Id AND w._id = wd1.Wine_Id AND w._id = wd2.Wine_Id AND w._id = wvar.Wine_ID AND v._id = wv.Vineyard_Id AND d1._id = wd1.Descriptor_ID AND d2._id = wd2.Descriptor_Id AND var._id = wvar.Variety_Id AND wd1.Descriptor_Id < wd2.Descriptor_Id AND w.Color = 'White';", null);
		
	}

	public Cursor getRedWineByOffset(int offset, int limit) {
		return myDatabase.rawQuery(
				"select * from Wine where Color='Red' limit " + limit
						+ " offset " + offset, null);
	}
	
	
	public Cursor getWhiteWineByOffset(int offset, int limit) {
		return myDatabase.rawQuery(
				"select * from Wine where Color='White' limit " + limit
						+ " offset " + offset, null);
	}

	
	public void setRating(CharSequence name, int rating)  {
		//myDatabase.beginTransaction();
		Cursor c = myDatabase.rawQuery("Select * from wine where name like '%" + name + "%';", null);
		c.moveToFirst();
		CharSequence s = c.getString(1);
		
		System.out.println("Setting, making sure full name    " + s);
		
		myDatabase.execSQL("UPDATE Wine SET Rating = " + rating + " WHERE Name is " + '"' +  s + '"' + ";");
		//myDatabase.endTransaction();
	}
	
	public int getRating(CharSequence name)  {
		//myDatabase.beginTransaction();
		Cursor c = myDatabase.rawQuery("Select * from wine where name like '%" + name + "%';", null);
		c.moveToFirst();
		String s = c.getString(1);
		
		System.out.println("getting full name " + s);
		
		Cursor cur = myDatabase.rawQuery("select * from wine where name is " + '"' + s + '"' + ";", null);
		cur.moveToFirst();
		int rating = cur.getInt(5);
		//myDatabase.execSQL("UPDATE Wine SET Rating = " + rating + " WHERE Name = " + '"' + name + '"' + ";" );
		//myDatabase.rawQuery("select Rating from wine where name is " + '"' + name + '"' + ";", null);
		//myDatabase.endTransaction();
		return rating;
	}
	
	public Cursor getRatedWines()
	{
		Cursor c = myDatabase.rawQuery("Select * from wine where Rating != 0;",null);
		return c;
	}

}