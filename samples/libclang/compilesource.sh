jextract --source -t org.llvm.clang -lclang \
  -I /Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/usr/include/ \
  -I ${LIBCLANG_HOME}/include/ \
  -I ${LIBCLANG_HOME}/include/clang-c \
  ${LIBCLANG_HOME}/include/clang-c/Index.h
javac --enable-preview --source=20 org/llvm/clang/*.java
