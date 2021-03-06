package com.codepath.adhoc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class EventListActivity extends Activity {
	// list sorted by % full (fuller = better)
	// then by what's happening soonest

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event_list);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event_list, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action_create_event:
			Intent iCreate = new Intent(this, CreateEventActivity.class);
			startActivity(iCreate);
			break;
		case R.id.action_map:
			Intent iMap = new Intent(this, LocationActivity.class);
			startActivity(iMap);
			break;
		default:
			break;
		}

		return true;
	}
}
