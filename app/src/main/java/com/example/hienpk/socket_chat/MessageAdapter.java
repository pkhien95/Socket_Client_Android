package com.example.hienpk.socket_chat;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by HienPK on 8/22/2016.
 */
public class MessageAdapter extends BaseAdapter
{
    ArrayList<ChatMessage> msgList;

    @Override
    public int getCount()
    {
        return msgList.size();
    }

    @Override
    public Object getItem(int i)
    {
        return msgList.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        return null;
    }
}
