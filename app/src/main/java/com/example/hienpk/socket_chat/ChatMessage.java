package com.example.hienpk.socket_chat;

/**
 * Created by HienPK on 8/22/2016.
 */
public class ChatMessage
{
    String name;
    String message;
    boolean own;

    public ChatMessage(String name, String message, boolean own)
    {
        this.name = name;
        this.message = message;
        this.own = own;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public void setOwn(boolean own)
    {
        this.own = own;
    }

    public boolean isOwn()
    {
        return own;
    }
}
