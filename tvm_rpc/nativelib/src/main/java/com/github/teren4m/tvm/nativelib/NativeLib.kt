package com.github.teren4m.tvm.nativelib

class NativeLib {

    /**
     * A native method that is implemented by the 'nativelib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'nativelib' library on application startup.
        init {
            System.loadLibrary("nativelib")
            System.loadLibrary("tvm")
            System.loadLibrary("tvm_runtime")
        }
    }
}