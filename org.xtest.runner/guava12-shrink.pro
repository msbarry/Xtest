-injars lib/guava-12.0.jar
-libraryjars lib/jsr305-2.0.0.jar
-outjars lib/guava-bloomfilter-12.0.jar(com/google/common/hash/**,com/google/common/math/**)

-dontoptimize
-dontobfuscate
-dontwarn sun.misc.Unsafe

-keep class com.google.common.hash.** {*;}
