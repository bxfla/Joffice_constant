package com.hy.powerplatform.weekly;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hy.powerplatform.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2018/5/17.
 */

public class WeeklyListAdapter extends RecyclerView.Adapter<WeeklyListAdapter.ViewHolder> {
    List<WeeklyList> beanList = new ArrayList<>();
    Context context;

    public WeeklyListAdapter(Context context, List<WeeklyList> mainDataList) {
        this.context = context;
        this.beanList = mainDataList;
    }

    @Override
    public WeeklyListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_easy, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(WeeklyListAdapter.ViewHolder holder, final int position) {
        holder.tvData.setText(beanList.get(position).getTitleName());
        holder.tvData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeeklyList bean = beanList.get(position);
                Intent intent = new Intent(context,WeekDetailActivity.class);
                intent.putExtra("bean",bean);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return beanList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvData;
        int mPosition;

        public ViewHolder(View itemView) {
            super(itemView);
            tvData = (TextView) itemView.findViewById(R.id.tvData);
        }
    }
}
