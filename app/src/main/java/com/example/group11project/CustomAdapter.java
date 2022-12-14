package com.example.group11project;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
//Aodan
public class CustomAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<IssueModel>issues = new ArrayList<IssueModel>();


    public CustomAdapter(Context context, ArrayList<IssueModel>issues){
        this.mContext = context;
        this.issues = issues;
    }


    @Override
    public int getCount() {
        return issues.size();
    }

    @Override
    public Object getItem(int i) {
        return issues.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.listview_item, parent,false);
        }

        IssueModel tempIssue = (IssueModel) getItem(position);

        TextView subId = (TextView)convertView.findViewById(R.id.submissions_id);
        TextView subComment = (TextView)convertView.findViewById(R.id.submissions_comment);
        //TextView subPos = (TextView)convertView.findViewById(R.id.submissions_position);
        TextView subDate = (TextView)convertView.findViewById(R.id.submissions_date);


        subId.setText(""+tempIssue.getId());
        subComment.setText(tempIssue.getComment());
        //subPos.setText(tempIssue.getPosition());
        subDate.setText(tempIssue.getDate());


        return convertView;
    }
}
