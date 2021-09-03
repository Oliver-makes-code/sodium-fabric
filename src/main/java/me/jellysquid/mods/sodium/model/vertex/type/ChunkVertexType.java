package me.jellysquid.mods.sodium.model.vertex.type;

import me.jellysquid.mods.sodium.render.chunk.format.ChunkMeshAttribute;
import me.jellysquid.mods.sodium.render.chunk.format.ModelVertexSink;

public interface ChunkVertexType extends BlittableVertexType<ModelVertexSink>, CustomVertexType<ModelVertexSink, ChunkMeshAttribute> {
    /**
     * @return The scale to be applied to vertex coordinates
     */
    float getModelScale();

    /**
     * @return The translation to be applied to vertex coordinates
     */
    float getModelOffset();

    /**
     * @return The scale to be applied to texture coordinates
     */
    float getTextureScale();
}