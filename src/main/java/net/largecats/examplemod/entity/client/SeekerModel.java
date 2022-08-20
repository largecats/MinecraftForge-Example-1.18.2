package net.largecats.examplemod.entity.client;

import net.largecats.examplemod.ExampleMod;
import net.largecats.examplemod.entity.custom.SeekerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SeekerModel extends AnimatedGeoModel<SeekerEntity> {
    @Override
    public ResourceLocation getModelLocation(SeekerEntity object) {
        return new ResourceLocation(ExampleMod.MOD_ID, "geo/seeker.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SeekerEntity object) {
        return new ResourceLocation(ExampleMod.MOD_ID, "textures/entity/seeker/starscream.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SeekerEntity animatable) {
        return new ResourceLocation(ExampleMod.MOD_ID, "animations/seeker.animation.json");
    }
}
