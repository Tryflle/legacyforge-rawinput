package xyz.tryfle.rawinput.listener

import net.java.games.input.ControllerEvent
import net.java.games.input.ControllerListener
import net.java.games.input.Mouse
import xyz.tryfle.rawinput.mouses

class MouseListener : ControllerListener {
    override fun controllerAdded(event: ControllerEvent) {
        if (event.controller is Mouse) {
            mouses.add(event.controller as Mouse)
        }
    }

    override fun controllerRemoved(event: ControllerEvent) {
        if (event.controller is Mouse) {
            mouses.remove(event.controller)
        }
    }
}