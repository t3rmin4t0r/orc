package org.apache.orc.impl;

import io.airlift.compress.zstd.ZstdDecompressor;

import java.util.EnumSet;
import java.util.zip.Deflater;

import org.apache.orc.CompressionCodec;
import org.apache.orc.util.thirdparty.ZstdJniCompressor;

public class ZstdCodec  extends AircompressorCodec {

  ZstdCodec() {
    super(new ZstdJniCompressor(Deflater.DEFAULT_COMPRESSION), new ZstdDecompressor());
  }
  
  @Override
  public CompressionCodec modify(EnumSet<Modifier> modifiers) {
    return this;
  }

  @Override
  public void reset() {
    // Nothing to do.
  }

  @Override
  public void close() {
    // Nothing to do.
  }
}
