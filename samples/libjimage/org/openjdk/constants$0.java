// Generated by jextract

package org.openjdk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$0 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$0() {}
    static final FunctionDescriptor JIMAGE_Open$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JIMAGE_Open$MH = RuntimeHelper.downcallHandle(
        "JIMAGE_Open",
        constants$0.JIMAGE_Open$FUNC
    );
    static final FunctionDescriptor JImageOpen_t$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JImageOpen_t$MH = RuntimeHelper.downcallHandle(
        constants$0.JImageOpen_t$FUNC
    );
    static final FunctionDescriptor JIMAGE_Close$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JIMAGE_Close$MH = RuntimeHelper.downcallHandle(
        "JIMAGE_Close",
        constants$0.JIMAGE_Close$FUNC
    );
    static final FunctionDescriptor JImageClose_t$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JImageClose_t$MH = RuntimeHelper.downcallHandle(
        constants$0.JImageClose_t$FUNC
    );
}


