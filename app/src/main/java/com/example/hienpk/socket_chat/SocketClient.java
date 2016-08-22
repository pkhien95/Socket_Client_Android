package com.example.hienpk.socket_chat;

import android.net.Uri;
import android.os.Parcel;
import android.util.Log;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_17;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by HienPK on 8/22/2016.
 */
public class SocketClient
{
    private static final String host = "127.0.0.1";
    private static final String port = "8080";
    private static WebSocketClient webSocketClient;
    private static URI uri;
    private static final String TAG = "SOCKET";

    public static void connect()
    {
        try
        {
            uri = new URI("ws://" + host + ":" + port);
        }
        catch (URISyntaxException e)
        {
            e.printStackTrace();
        }

        webSocketClient = new WebSocketClient(uri, new Draft_17())
        {
            @Override
            public void onOpen(ServerHandshake handshakedata)
            {
                Log.d("TAG", "Connected to server");
            }

            @Override
            public void onMessage(String message)
            {
                Log.d("TAG", "Message: " + message);
            }

            @Override
            public void onClose(int code, String reason, boolean remote)
            {
                Log.d(TAG, "Connection was closed.");
            }

            @Override
            public void onError(Exception ex)
            {
                Log.d(TAG, ex.getMessage());
            }
        };

        webSocketClient.connect();
    }

    public static void sendMessage(String message)
    {
        if(message != "")
        {
            webSocketClient.send(message);
        }
    }
}
