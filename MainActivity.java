import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity{
	
	Spinner city_list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		city_list = (Spinner) findViewById(R.id.register_city_list);

		
		ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.tr_city,R.layout.spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		city_list.setAdapter(adapter);
		
		
		int city = (int) city_list.getSelectedItemId();
		
		String[] city_id = getResources().getStringArray(R.array.tr_city_number);
		
		String plaka = city_id[city];
		
	}
	

}
