package com.github.kingtorsten.NewEndlessAbyss.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.GuardianEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.world.BlockEvent;

import javax.annotation.Nullable;

public class HerbivorousSquidEntity extends SquidEntity {

    private EatGrassGoal eatGrassGoal;
    private int HerbivorousSquidTimer;

    public HerbivorousSquidEntity(EntityType<? extends SquidEntity> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 10.0D)
                .createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 100.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.25D);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.eatGrassGoal = new EatGrassGoal(this);
        this.goalSelector.addGoal(0, new PanicGoal(this, 0.5D));
        this.goalSelector.addGoal(1, new FollowBoatGoal(this));
        this.goalSelector.addGoal(2, new FollowMobGoal(this, 0.25D, 3.0F, 20.0F));
        this.goalSelector.addGoal(4, this.eatGrassGoal);
        this.goalSelector.addGoal(5, new RandomSwimmingGoal(this, 0.25D, 1));
    }

    @Override
    protected int getExperiencePoints(PlayerEntity player) {
        return 1 + this.world.rand.nextInt(4 );
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_SQUID_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_SQUID_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.ENTITY_SQUID_HURT;
    }

    @Override
    public boolean isPushedByWater() {
        return super.isPushedByWater();
    }

    @Override
    public boolean canBreatheUnderwater() {
        return super.canBreatheUnderwater();
    }

    @Override
    protected void updateAITasks() {
        this.HerbivorousSquidTimer = this.eatGrassGoal.getEatingGrassTimer();
        super.updateAITasks();
    }

    @Override
    public void livingTick () {
        if (this.world.isRemote) {
            this.HerbivorousSquidTimer = Math.max(0, this.HerbivorousSquidTimer-1);
        }
        super.livingTick();
    }

    @OnlyIn(Dist.CLIENT)
    public void handleStatusUpdate(byte id) {
        if (id == 10) {
            this.HerbivorousSquidTimer = 40;
        } else {
            super.handleStatusUpdate(id);
        }
    }
}
