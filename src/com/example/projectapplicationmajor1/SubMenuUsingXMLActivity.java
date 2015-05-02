package com.example.projectapplicationmajor1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class SubMenuUsingXMLActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//this is where earthquake too place
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflator = new MenuInflater(this);
		inflator.inflate(R.layout.menu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.MENU_SAVE:
			Toast.makeText(getApplicationContext(),
					"You Clicked On Save Menu Item", Toast.LENGTH_LONG).show();
			break;
		case R.id.MENU_VIEW_DETAILS:
			Toast.makeText(getApplicationContext(),
					"You Clicked On View Details SubMenu Item",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.MENU_VIEW_LIST:
			Toast.makeText(getApplicationContext(),
					"You Clicked On View List SubMenu Item", Toast.LENGTH_LONG)
					.show();
			break;
		case R.id.MENU_VIEW_THUMB:
			Toast.makeText(getApplicationContext(),
					"You Clicked On View Thumbnail SubMenu Item",
					Toast.LENGTH_LONG).show();
			break;
		case R.id.MENU_ZOOM1:
			Toast.makeText(getApplicationContext(),
					"You Clicked On 100% Zoom SubMenu Item", Toast.LENGTH_LONG)
					.show();
			break;
		case R.id.MENU_ZOOM2:
			Toast.makeText(getApplicationContext(),
					"You Clicked On 200% Zoom SubMenu Item", Toast.LENGTH_LONG)
					.show();
			break;
			//yo mother fucker this is so fucking weird
		}

		return super.onOptionsItemSelected(item);
	}

}
