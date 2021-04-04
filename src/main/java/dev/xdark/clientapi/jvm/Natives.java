package dev.xdark.clientapi.jvm;

import dev.xdark.clientapi.Side;
import dev.xdark.clientapi.SidedApi;
import dev.xdark.feder.ciphering.Cipher;
import dev.xdark.feder.compression.Compression;

@SidedApi(Side.BOTH)
public interface Natives {

    Compression newZlib();

    Compression newZstd();

    Cipher newCipher();
}
