/*
 * Copyright (c) 2020, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

import java.lang.foreign.Arena;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static test.jextract.fp.funcPtr_h.*;
import test.jextract.fp.*;

/*
 * @test id=classes
  * @library /lib
 * @run main/othervm JtregJextract -l FuncPtr -t test.jextract.fp funcPtr.h
 * @run testng/othervm LibFuncPtrTest
 */
 /*
 * @test id=sources
  * @library /lib
 * @run main/othervm JtregJextractSources -l FuncPtr -t test.jextract.fp funcPtr.h
 * @run testng/othervm LibFuncPtrTest
 */
public class LibFuncPtrTest {
    @Test
    public void test() {
        try (Arena arena = Arena.openConfined()) {
            var handle = func$f.allocate(x -> x * x, arena.scope());
            assertEquals(func(handle, 35), 35 * 35 + 35);
        }
    }
}
