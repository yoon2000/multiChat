package com.ll.multiChat.domain.chat.ChatRoom.entity;

import com.ll.multiChat.domain.chat.ChatMessage.entity.ChatMessage;
import com.ll.multiChat.global.baseEntity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

import static lombok.AccessLevel.PROTECTED;

@Entity
@Setter
@Getter
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@SuperBuilder
@ToString(callSuper = true)
public class ChatRoom extends BaseEntity {
    private String name;

    @OneToMany
    private List<ChatMessage> chatMessages;
}
