package com.ll.multiChat.domain.chat.ChatMessage.repository;

import com.ll.multiChat.domain.chat.ChatMessage.entity.ChatMessage;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ChatMessageRepository extends JpaRepository<ChatMessage, Long> {
}
