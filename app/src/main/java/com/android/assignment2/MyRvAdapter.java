package com.android.assignment2;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.android.assignment2.MainActivity;
import com.android.assignment2.Module.User;

import java.util.ArrayList;
import java.util.List;

public class MyRvAdapter extends RecyclerView.Adapter<MyRvAdapter.MyHolder> {

    List<User> UserList = new ArrayList<>();
     Context context;

    public MyRvAdapter(List<User> UserList, Context context)
    {
        this.UserList = UserList;
        this.context = context;

    }

    @androidx.annotation.NonNull
    @Override
    public MyHolder onCreateViewHolder(@androidx.annotation.NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_user_rv,parent,false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@androidx.annotation.NonNull MyHolder holder, int position) {
        final User User = UserList.get(position);

        String uri = "@drawable/" + User.getImage();
        int imageResource = context.getResources().getIdentifier(uri, null, context.getPackageName());
        Drawable image = ContextCompat.getDrawable(context, imageResource);

        holder.imageView.setImageDrawable(image);
        holder.Name.setText(User.getName());





        holder.Name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(context, UserDetailActivity.class);
                intent1.putExtra("Name",User.getName());
                intent1.putExtra("Gender",User.getGender());
                intent1.putExtra("Dob",User.getDob());
                intent1.putExtra("Country",User.getCountry());
                intent1.putExtra("Phone",User.getPhone());
                intent1.putExtra("Email",User.getEmail());
                intent1.putExtra("img",User.getImage());

                context.startActivity(intent1);

            }
        });
    }
    @Override
    public int getItemCount() {
        return UserList.size();
    }



    public class MyHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView Name;


        public MyHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.Img);
            Name = itemView.findViewById(R.id.Name);

        }
    }

}

