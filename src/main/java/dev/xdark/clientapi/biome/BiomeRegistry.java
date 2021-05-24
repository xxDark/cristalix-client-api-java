package dev.xdark.clientapi.biome;

public interface BiomeRegistry {

    Biome getById(int id);

    Biome getByInternalName(String internalName);

    void register(int id, String internalName, Biome biome);
}
