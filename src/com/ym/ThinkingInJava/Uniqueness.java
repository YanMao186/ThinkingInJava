package com.ym.ThinkingInJava;

import java.lang.annotation.Target;

public @interface Uniqueness {
    Constrains constrains()
            default @Constrains(unique = true);
}
