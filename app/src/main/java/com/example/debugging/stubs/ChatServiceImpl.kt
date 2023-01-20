package com.example.debugging.stubs

import cheers.chat.v1.ChatServiceGrpcKt
import kotlinx.coroutines.flow.Flow


class ChatService : ChatServiceGrpcKt.ChatServiceCoroutineImplBase() {
}