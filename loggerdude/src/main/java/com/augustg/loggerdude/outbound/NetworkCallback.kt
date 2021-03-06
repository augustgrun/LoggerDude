package com.augustg.loggerdude.outbound

/**
 * Interface for handling the network response of outgoing Logs
 */
interface NetworkCallback {
    fun onSucceededSendingLogs()
    fun onFailedSendingLogs()
}