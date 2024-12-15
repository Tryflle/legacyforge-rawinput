package xyz.tryfle.rawinput.util

import net.minecraft.util.MouseHelper
import xyz.tryfle.rawinput.mouses

class RawInputMouseInput : MouseHelper() {

    override fun mouseXYChange() {
        deltaX = 0
        deltaY = 0

        for (mouse in mouses) {
            mouse.poll()
            deltaX += mouse.x.pollData.toInt()
            deltaY -= mouse.y.pollData.toInt()
        }
    }
}