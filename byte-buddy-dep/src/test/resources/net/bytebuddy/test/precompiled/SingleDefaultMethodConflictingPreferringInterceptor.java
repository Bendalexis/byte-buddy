package net.bytebuddy.test.precompiled;

import net.bytebuddy.instrumentation.method.bytecode.bind.annotation.DefaultCall;

import java.util.concurrent.Callable;

public class SingleDefaultMethodConflictingPreferringInterceptor {

    public static Object foo(@DefaultCall(targetType = SingleDefaultMethodConflictingInterface.class) Callable<?> callable) throws Exception {
        return callable.call();
    }
}
