cmake_minimum_required(VERSION 3.22.1)

project("nativelib")

add_subdirectory(android_tvm)

include_directories(
        ${CMAKE_CURRENT_LIST_DIR}/android_tvm/tvm/include
        ${CMAKE_CURRENT_LIST_DIR}/android_tvm/tvm/3rdparty/dmlc-core/include
        ${CMAKE_CURRENT_LIST_DIR}/android_tvm/tvm/3rdparty/dlpack/include
        ${CMAKE_CURRENT_LIST_DIR}/android_tvm/tvm/3rdparty/cnpy/include
)

add_library(${CMAKE_PROJECT_NAME} SHARED
        nativelib.cpp)

target_link_libraries(${CMAKE_PROJECT_NAME}
        tvm
        tvm_runtime
        android
        log)

message(${CMAKE_CURRENT_LIST_DIR})