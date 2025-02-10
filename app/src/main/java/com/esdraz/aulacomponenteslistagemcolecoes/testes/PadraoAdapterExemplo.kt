package com.esdraz.aulacomponenteslistagemcolecoes.testes

class PadraoAdapterExemplo {

}


interface DeviceInfoProvider {
    fun getDeviceInfo(): String
}

class OldDevice {
    fun getRawDeviceData(): String {
        return "DeviceName:OldPhone;OS:Android 8;Battery:50%"
    }
}

class DeviceAdapter(private val oldDevice: OldDevice) : DeviceInfoProvider {
    override fun getDeviceInfo(): String {
        val rawData = oldDevice.getRawDeviceData()
        val dataMap = rawData.split(";")
            .map {
                it.split(":")
                    .let { parts -> parts[0] to parts[1] }
            }.toMap()
        return "Device Name: ${dataMap["DeviceName"]}, OS: ${dataMap["OS"]}, Battery: ${dataMap["Battery"]}"
    }

}

fun main() {
    val oldDevice = OldDevice()
    val adapter: DeviceInfoProvider = DeviceAdapter(oldDevice)

    println(adapter.getDeviceInfo())
}

