/*
 *  Copyright (c) 2021, Oracle and/or its affiliates. All rights reserved.
 *  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 *  This code is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License version 2 only, as
 *  published by the Free Software Foundation.  Oracle designates this
 *  particular file as subject to the "Classpath" exception as provided
 *  by Oracle in the LICENSE file that accompanied this code.
 *
 *  This code is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 *  version 2 for more details (a copy is included in the LICENSE file that
 *  accompanied this code).
 *
 *  You should have received a copy of the GNU General Public License version
 *  2 along with this work; if not, write to the Free Software Foundation,
 *  Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 *   Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 *  or visit www.oracle.com if you need additional information or have any
 *  questions.
 */

// Generated by jextract

package org.openjdk.jextract.clang.libclang;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$9 {

    static final FunctionDescriptor clang_equalTypes$FUNC = FunctionDescriptor.of(JAVA_INT,
        MemoryLayout.structLayout(
            JAVA_INT.withName("kind"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.sequenceLayout(2, ADDRESS).withName("data")
        ),
        MemoryLayout.structLayout(
            JAVA_INT.withName("kind"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.sequenceLayout(2, ADDRESS).withName("data")
        )
    );
    static final MethodHandle clang_equalTypes$MH = RuntimeHelper.downcallHandle(
        "clang_equalTypes",
        constants$9.clang_equalTypes$FUNC, false
    );
    static final FunctionDescriptor clang_getCanonicalType$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        JAVA_INT.withName("kind"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.sequenceLayout(2, ADDRESS).withName("data")
    ),
        MemoryLayout.structLayout(
            JAVA_INT.withName("kind"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.sequenceLayout(2, ADDRESS).withName("data")
        )
    );
    static final MethodHandle clang_getCanonicalType$MH = RuntimeHelper.downcallHandle(
        "clang_getCanonicalType",
        constants$9.clang_getCanonicalType$FUNC, false
    );
    static final FunctionDescriptor clang_isConstQualifiedType$FUNC = FunctionDescriptor.of(JAVA_INT,
        MemoryLayout.structLayout(
            JAVA_INT.withName("kind"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.sequenceLayout(2, ADDRESS).withName("data")
        )
    );
    static final MethodHandle clang_isConstQualifiedType$MH = RuntimeHelper.downcallHandle(
        "clang_isConstQualifiedType",
        constants$9.clang_isConstQualifiedType$FUNC, false
    );
    static final FunctionDescriptor clang_Cursor_isMacroFunctionLike$FUNC = FunctionDescriptor.of(JAVA_INT,
        MemoryLayout.structLayout(
            JAVA_INT.withName("kind"),
            JAVA_INT.withName("xdata"),
            MemoryLayout.sequenceLayout(3, ADDRESS).withName("data")
        )
    );
    static final MethodHandle clang_Cursor_isMacroFunctionLike$MH = RuntimeHelper.downcallHandle(
        "clang_Cursor_isMacroFunctionLike",
        constants$9.clang_Cursor_isMacroFunctionLike$FUNC, false
    );
    static final FunctionDescriptor clang_isVolatileQualifiedType$FUNC = FunctionDescriptor.of(JAVA_INT,
        MemoryLayout.structLayout(
            JAVA_INT.withName("kind"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.sequenceLayout(2, ADDRESS).withName("data")
        )
    );
    static final MethodHandle clang_isVolatileQualifiedType$MH = RuntimeHelper.downcallHandle(
        "clang_isVolatileQualifiedType",
        constants$9.clang_isVolatileQualifiedType$FUNC, false
    );
    static final FunctionDescriptor clang_getTypedefName$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        ADDRESS.withName("data"),
        JAVA_INT.withName("private_flags"),
        MemoryLayout.paddingLayout(32)
    ),
        MemoryLayout.structLayout(
            JAVA_INT.withName("kind"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.sequenceLayout(2, ADDRESS).withName("data")
        )
    );
    static final MethodHandle clang_getTypedefName$MH = RuntimeHelper.downcallHandle(
        "clang_getTypedefName",
        constants$9.clang_getTypedefName$FUNC, false
    );
}


