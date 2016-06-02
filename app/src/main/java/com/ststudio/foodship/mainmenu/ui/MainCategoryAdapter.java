package com.ststudio.foodship.mainmenu.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ststudio.foodship.R;
import com.ststudio.foodship.mainmenu.database.FoodCategoryModel;

import java.util.List;

/**
 * Created by leanh on 5/30/16.
 */
public class MainCategoryAdapter extends BaseAdapter {

    private List<FoodCategoryModel> mListData;
    private Activity mContext;

    public MainCategoryAdapter(List<FoodCategoryModel> listData, Activity context) {
        this.mListData = listData;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return mListData.size();
    }

    @Override
    public FoodCategoryModel getItem(int position) {
        return mListData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = mContext.getLayoutInflater().inflate(R.layout.main_category_grid_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.main_category_grid_item_imv);
            viewHolder.textView = (TextView) convertView.findViewById(R.id.main_category_grid_item_txt);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        return convertView;
    }

    class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
