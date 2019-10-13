cmake_minimum_required(VERSION 3.5.1)
set(CMAKE_CXX_STANDARD 11)

include_directories(include)

project(app)

file(GLOB SOURCES "src/*.cpp")
file(GLOB SPECS "spec/*.cpp")

find_package(Boost COMPONENTS system REQUIRED)
if(Boost_FOUND)
  include_directories(${Boost_INCLUDE_DIRS})
  add_executable(app ${SOURCES})
  target_link_libraries(app ${Boost_LIBRARIES})
endif()

add_executable(spec ${SPECS} "src/hello.cpp")
