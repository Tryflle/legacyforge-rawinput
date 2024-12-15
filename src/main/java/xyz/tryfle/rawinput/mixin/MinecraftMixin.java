package xyz.tryfle.rawinput.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.util.MouseHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import xyz.tryfle.rawinput.util.RawInputMouseInput;

@Mixin(Minecraft.class)
public class MinecraftMixin {

    @Shadow
    public MouseHelper mouseHelper;

    @Inject(method="startGame", at=@At("TAIL"))
    private void startGame(CallbackInfo info) {
        mouseHelper = new RawInputMouseInput();
    }
}