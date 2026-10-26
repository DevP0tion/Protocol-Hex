package com.devp0tion.protocolhex;

import net.neoforged.neoforge.common.ModConfigSpec;

// Common config, saved to config/protocolhex-common.toml.
// FML ignores an empty spec, so the file is only created once at least one value is defined below.
public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    // Example value. Add a matching "protocolhex.configuration.<name>" key to the lang file for the config screen.
    // public static final ModConfigSpec.BooleanValue SOME_FLAG = BUILDER
    //         .comment("Description written to the config file")
    //         .define("someFlag", true);

    static final ModConfigSpec SPEC = BUILDER.build();
}
