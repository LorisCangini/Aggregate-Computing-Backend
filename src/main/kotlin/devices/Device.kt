package devices

import communication.Message

/**
 * Basic model for all Devices
 */
interface Device {
    /**
     * The unique identifier of this Device
     */
    val id: Int

    /**
     * Starts executing the program this Device knows
     */
    fun execute()

    /**
     * Messages this Device received
     */
    var status: MutableSet<Message>

    fun selfStatus(): Set<Message> = status.filter { it.senderUid == id }.toSet()

    /**
     * Tell this Device something
     */
    fun tell(message: Message)
}