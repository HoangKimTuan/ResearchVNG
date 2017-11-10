package com.example.cpu10225.research.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.cpu10225.research.R;
import com.example.cpu10225.research.data.Item;

import java.util.List;

/**
 * Created by cpu10225 on 10/11/2017.
 */

public class AnswersAdapter extends RecyclerView.Adapter<AnswersAdapter.ViewHolder> {

    private List<Item> mItems;
    private Context mContext;
    private PostItemListener mItemListener;

    public AnswersAdapter(Context context, List<Item> posts, PostItemListener itemListener) {
        mItems = posts;
        mContext = context;
        mItemListener = itemListener;
    }

    @Override
    public int getItemCount() {
        return mItems == null ? 0 : mItems.size();
    }

    @Override
    public AnswersAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        Context context = parent.getContext();
//        LayoutInflater inflater = LayoutInflater.from(context);
//        View postView = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        View view;

        if (viewType == 1)
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_owner, parent, false);
        else if (viewType == 2)
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_owner, parent, false);
        else
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_owner, parent, false);

        ViewHolder viewHolder = new ViewHolder(view, this.mItemListener);
        return viewHolder;
    }

    @Override
    public int getItemViewType(int position) {
        if (mItems.get(position).getIsAccepted())
            return 1;
        else
            return 2;
    }

    @Override
    public void onBindViewHolder(AnswersAdapter.ViewHolder holder, int position) {
        Item item = mItems.get(position);
        holder.tvName.setText(item.getOwner().getDisplayName());
        Glide.with(mContext).load(item.getOwner().getProfileImage()).into(holder.ivProfile);
    }

    public void updateAnswers(List<Item> items) {
        mItems = items;
        notifyDataSetChanged();
    }

    private Item getItem(int adapterPosition) {
        return mItems.get(adapterPosition);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView ivProfile;
        private TextView tvName;
        PostItemListener mItemListener;

        public ViewHolder(View itemView, PostItemListener postItemListener) {
            super(itemView);
//            tvName = itemView.findViewById(android.R.id.text1);
            tvName = itemView.findViewById(R.id.tvName);
            ivProfile = itemView.findViewById(R.id.ivProfile);
            this.mItemListener = postItemListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Item item = getItem(getAdapterPosition());
            this.mItemListener.onPostClick(item.getAnswerId());

            notifyDataSetChanged();
        }
    }

    public interface PostItemListener {
        void onPostClick(long id);
    }
}
