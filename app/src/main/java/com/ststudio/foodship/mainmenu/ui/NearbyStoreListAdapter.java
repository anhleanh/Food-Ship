package com.ststudio.foodship.mainmenu.ui;

import android.app.Activity;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ststudio.foodship.R;
import com.ststudio.foodship.mainmenu.database.StoreModel;

import java.util.List;

/**
 * Created by leanh on 5/30/16.
 */
public class NearbyStoreListAdapter extends BaseAdapter {

    List<StoreModel> mListData;
    Activity mActivity;

    public NearbyStoreListAdapter(List<StoreModel> listData, Activity activity) {
        this.mListData = listData;
        this.mActivity = activity;
    }

    @Override
    public int getCount() {
        return mListData.size();
    }

    @Override
    public StoreModel getItem(int position) {
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
            convertView = mActivity.getLayoutInflater().inflate(R.layout.nearby_store_list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.nearby_store_list_item_imv);
            viewHolder.txtName = (TextView) convertView.findViewById(R.id.nearby_store_list_item_name_txt);
            viewHolder.txtDistance = (TextView) convertView.findViewById(R.id.nearby_store_list_item_distance_txt);

            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }


        return convertView;
    }

    class ViewHolder{
        ImageView imageView;
        TextView txtName;
        TextView txtDistance;
    }
}
