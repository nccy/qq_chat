package com.hnust.dao;

import com.hnust.domian.ChatRecord;
import com.hnust.model.ChatMessage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 长夜
 * @date 2023/5/30 8:21
 */
@Mapper
public interface ChatDao {
    Boolean insertChat(ChatRecord chatRecord);
    List<ChatRecord> selectChat(String senderName,String receiverName);
    Boolean deleteBySenderName(String senderName,String receiverName);
}
