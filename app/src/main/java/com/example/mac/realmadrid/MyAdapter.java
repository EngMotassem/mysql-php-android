package com.example.mac.realmadrid;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by mac on 15‏/11‏/2016.
 */

public class MyAdapter extends RecyclerView.Adapter<MyHolder>  implements Filterable{

    public Context context;
     ArrayList <Players>  players=new ArrayList<Players>() ;
    ArrayList<Players> filterList=new ArrayList<Players>();
    CustomeFilter filter;

    public MyAdapter() {
    }

    public ArrayList<Players> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Players> players) {
        this.players = players;
    }

    public MyAdapter(Context context, ArrayList <Players> players) {
        this.context=context;
        this.players=players;
        this.filterList=players;
    }


    @Override
    public int getItemCount() {
        return players.size();
    }



    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);

        MyHolder holder=new MyHolder(v);


        return holder;
    }
    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        final String playerName=players.get(position).getPlayerName();
        final String playerDetails=players.get(position).getPlayerDetails();

        final int playerImage=players.get(position).getPlayerImage();
        final String playerImageUrl=players.get(position).getImgUrl();
        PicassoClient.downloadImage(context,playerImageUrl,holder.getPlayeImage());



        holder.getPlayerName().setText(playerName);
        holder.getPlayerDetails().setText(playerDetails);
      //  holder.getPlayeImage().setImageResource(playerImage);
        holder.setItemClickListner(new MyHolder.ItemClickListner() {
            @Override
            public void onItemClick(View v, int pos) {
                Intent i=new Intent(context,DetailsActivity.class);
                i.putExtra("name",playerName);
                i.putExtra("details",playerDetails);
                i.putExtra("image",playerImage);

                i.putExtra("imageUrl",playerImageUrl);
                context.startActivity(i);

            }
        });




    }



    @Override
    public Filter getFilter() {
        if(filter==null){
            filter=new CustomeFilter(filterList,this);

        }
        return filter;
    }
}
