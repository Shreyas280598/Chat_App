package com.example.chatapp.presentation

import com.example.chatapp.domain.chat.BluetoothDevice

data class BluetoothUiState (
    val scannedDevice: List<BluetoothDevice> = emptyList(),
    val paredDevice: List<BluetoothDevice> = emptyList()
)