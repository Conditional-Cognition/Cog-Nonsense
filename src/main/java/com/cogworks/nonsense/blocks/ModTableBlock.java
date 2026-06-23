package com.cogworks.nonsense.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ModTableBlock extends Block {
    public static final EnumProperty<Direction.Axis> HORIZONTAL_AXIS = EnumProperty.create("axis", Direction.Axis.class, Direction.Axis.X, Direction.Axis.Z);

    private static final VoxelShape Z_SHAPE =
            Block.box(0, 12, 2, 16, 16, 14);
    private static final VoxelShape X_SHAPE =
            Block.box(2, 12, 0, 14, 16, 16);

    public ModTableBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(HORIZONTAL_AXIS, Direction.Axis.X));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(HORIZONTAL_AXIS, context.getHorizontalDirection().getAxis());
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        if (state.getValue(HORIZONTAL_AXIS) == Direction.Axis.Z) {
            return Z_SHAPE;
        }
        return X_SHAPE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_AXIS);
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return switch (rotation) {
            case COUNTERCLOCKWISE_90, CLOCKWISE_90 -> (state.getValue(HORIZONTAL_AXIS) == Direction.Axis.X)
                    ? state.setValue(HORIZONTAL_AXIS, Direction.Axis.Z)
                    : state.setValue(HORIZONTAL_AXIS, Direction.Axis.X);
            default -> state;
        };
    }
}
