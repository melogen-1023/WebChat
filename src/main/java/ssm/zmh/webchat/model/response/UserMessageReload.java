// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UserMessageReload.java

package ssm.zmh.webchat.model.response;

import ssm.zmh.webchat.model.message.Message;
import ssm.zmh.webchat.model.message.MessageItem;

import java.util.List;

public class UserMessageReload
{

    public UserMessageReload()
    {
    }

    public List<Message> getMessages()
    {
        return messages;
    }

    public void setPrivateMessages(List<Message> messages)
    {
        this.messages = messages;
    }

    public List<MessageItem> getMessageList()
    {
        return messageList;
    }

    public void setMessageList(List<MessageItem> messageList)
    {
        this.messageList = messageList;
    }

    private List<Message> messages;
    private List<MessageItem> messageList;
}
