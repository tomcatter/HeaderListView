package com.example.headerlistview;

import com.headerlistview.libary.StickyListHeadersListView;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.Toast;

public class MainActivity extends Activity implements OnMenuItemClickListener {

	StickyListHeadersListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		listView = (StickyListHeadersListView) findViewById(R.id.list);
		CustomAdapter adapter = new CustomAdapter(this);
		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				PopupMenu popupMenu = new PopupMenu(MainActivity.this, view);
				popupMenu.setOnMenuItemClickListener(MainActivity.this);
				popupMenu.inflate(R.menu.main);
				popupMenu.show();

			}

		});
	}

	@Override
	public boolean onMenuItemClick(MenuItem item) {
		switch (item.getItemId()) {

		case R.id.item_comedy:
			Toast.makeText(this, "Comedy Clicked", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.item_movies:
			Toast.makeText(this, "Movies Clicked", Toast.LENGTH_SHORT).show();
			return true;
		case R.id.item_music:
			Toast.makeText(this, "Music Clicked", Toast.LENGTH_SHORT).show();
			return true;
		default:
			return false;
		}
	}

}
