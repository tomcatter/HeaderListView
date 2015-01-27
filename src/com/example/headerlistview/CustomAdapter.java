package com.example.headerlistview;

import com.headerlistview.libary.StickyListHeadersAdapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter implements
		StickyListHeadersAdapter {

	private LayoutInflater inflater;

	
	private String [][] list = new String[][]{ {"a", "b", "c", "d"}, {"a", "b", "c", "d"}, {"a", "b", "c", "d"}, {"a", "b", "c", "d"}, {"a", "b", "c", "d"}
			
	};
	
	
	public CustomAdapter(Context context) {
		inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		
		return 20;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if(convertView == null){
			convertView = inflater.inflate(R.layout.item, null);
			TextView textView = (TextView) convertView.findViewById(R.id.item);
			textView.setText(position + "");
			textView.setBackgroundColor(Color.RED);
		}
		return convertView;
	}

	@Override
	public View getHeaderView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.header, null);
		TextView textView = (TextView) view.findViewById(R.id.header);
		textView.setText(position + "");
		return view;
	}

	@Override
	public long getHeaderId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

}
