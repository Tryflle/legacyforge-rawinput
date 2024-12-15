package xyz.tryfle.rawinput

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import xyz.tryfle.rawinput.listener.MouseListener

@Mod(modid = "rawinput", useMetadata = true)
class Main {

    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {
        environ.addControllerListener(MouseListener())
    }
}
